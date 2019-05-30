import java.io.BufferedWriter;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.io.FileInputStream;

public class ParserTest {

    static String[] TOKENS = {"ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", "'}'", "'.'", "DARROW", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT"
    };
    public static BufferedWriter writer, writer2 ;

    static int VALUED_INDEX_LIMIT = 6;
    static int NAMED_TOKEN_INDEX = 23;
    static int parser_error_flag = 0;

    static void printAST(String filename) throws Exception{
        ANTLRInputStream inStream=null;
        try{
            inStream = new ANTLRInputStream(new FileInputStream(filename));
        }catch(Exception e){
            System.err.println("Could not read file "+filename);
            return;
        }
        /* Start Lexical Analyser*/
        lex lexer = new lex(inStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        int lexer_flag = 0;
        for(Token t : tokens.getTokens()){
            if ( t.getType()> TOKENS.length ){
                lexer_flag = 1;
                System.err.println("Lexical error at "+t.getLine()+": "+t.getText());
            }
        }
        if (lexer_flag == 1)
            return;
        /* end Lexical Analyser*/
        String OutputFile = "file.cl-lex";
        writer = new BufferedWriter(new FileWriter(OutputFile, true));

        parser_error_flag = 0;
        parse parser = new parse(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserError(Paths.get(filename).getFileName().toString()));
        parser.setFilename(Paths.get(filename).getFileName().toString());
        parse.ProgramContext prog = null;
        prog = parser.program();

        if(parser_error_flag == 0) {
            System.out.println(prog.value.getString(""));
            writer.write(prog.value.getString(""));

        }
        else
            System.err.println("Compilation halted due to lex and parse errors");
        writer.close();

    }

    public static void main(String args[]) throws Exception{

        if(args.length < 1) {
            System.err.println("No files given");
            System.exit(1);
        }

        for(String filename : args)
            printAST(filename);
    }

    public static class ParserError extends BaseErrorListener {

        String filename;
        public ParserError(String fn) {
            super();
            filename=fn;
        }
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionIntLine, String msg, RecognitionException e){
            parser_error_flag=1;
            String sourceName = recognizer.getInputStream().getSourceName();
            String errorMessage="";
            if(filename!=null){
                if(offendingSymbol instanceof CommonToken){
                    errorMessage += "\""+filename+"\", line "+line+": syntax error at or near ";
                    int typeid = ((CommonToken)offendingSymbol).getType();
                    if (typeid == -1){
                        errorMessage += "EOF";
                    }
                    else if (typeid <= VALUED_INDEX_LIMIT) {
                        errorMessage += TOKENS[typeid-1] + " = " + ((CommonToken)offendingSymbol).getText();
                    }else if(typeid >= NAMED_TOKEN_INDEX){
                        errorMessage += TOKENS[typeid-1];
                    }else{
                        errorMessage += "\'"+((CommonToken)offendingSymbol).getText()+"\'";
                    }
                }
            }
            System.err.println(errorMessage);
            throw new RuntimeException("One error found!");
        }
    }
}
