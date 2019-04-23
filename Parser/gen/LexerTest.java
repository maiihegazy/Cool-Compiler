import java.io.*;
import java.util.Arrays;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.FileInputStream;

public class LexerTest {

    static String[] TOKENS = {"ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", "'}'", "'.'", "DARROW", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT"
    };
    public static BufferedWriter writer ;

    static int VALUED_INDEX_LIMIT = 6;

    static int EOF_TYPEID = -1;

    public static void main(String args[]) throws IOException {


        String inputFile = "good.cl";
        String OutputFile = "out.cl-lex";

        FileInputStream fis = new FileInputStream(new File(inputFile));
        ANTLRInputStream input = new ANTLRInputStream(fis);

        lex lexer = new lex(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);


        tokens.fill();

              File file = new File(OutputFile);
        //file.delete();
        writer = new BufferedWriter(new FileWriter(OutputFile, true));

        final int BOOL_CONST_INDEX = Arrays.asList(TOKENS).indexOf("BOOL_CONST");
        final int STR_CONST_INDEX = Arrays.asList(TOKENS).indexOf("STR_CONST");
        final int ERROR_INDEX = Arrays.asList(TOKENS).indexOf("ERROR");


        int typeid;
        String output = "";
        for(Token t: tokens.getTokens()) {
            typeid = t.getType();
            if(typeid > TOKENS.length){
                System.out.println("Invalid Token generated - Token id : "+typeid+" for text \""+t.getText()+"\"");
                continue;
            }
            if(typeid != EOF_TYPEID) {
                output = String.format("#%d %s", t.getLine(), TOKENS[typeid - 1]);

                if(typeid <= VALUED_INDEX_LIMIT) {

                    if(typeid - 1 == BOOL_CONST_INDEX)
                        output += " " + t.getText().toLowerCase();


                    else if(typeid - 1 == STR_CONST_INDEX)
                        output += " \"" + t.getText() + "\"";
                    else if(typeid - 1 == ERROR_INDEX)
                        output += " \"" + t.getText() + "\"";
                    else
                        output += " " + t.getText();

                }

                System.out.println(output);
                writer.write(output + "\n");

            }

        }

        writer.close();
    }
}
