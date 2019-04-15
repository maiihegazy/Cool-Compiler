package cool;
import cool.lex;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

public class LexerTest {

	static String[] TOKENS = {"ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", "'}'", "'.'", "DARROW", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT"
	};

	static int VALUED_INDEX_LIMIT = 6;

	static int EOF_TYPEID = -1;

	public static void main(String args[]) {

		if(args.length < 1) {
			System.err.println("No files given");
			System.exit(1);
		}

		for(String filename : args)
			printTokenStream(filename);
	}

	static String escapeSpecialCharacters(String text) {
		return
			text
				.replaceAll("\\\\", "\\\\\\\\")
				.replaceAll("\n", "\\\\n")
				.replaceAll("\t", "\\\\t")
				.replaceAll("\b", "\\\\b")
				.replaceAll("\f", "\\\\f")
				.replaceAll("\"", "\\\\\"")
				.replaceAll("\r", "\\\\015")
				.replaceAll("\033","\\\\033")
				.replaceAll("\001","\\\\001")
				.replaceAll("\002","\\\\002")
				.replaceAll("\003","\\\\003")
				.replaceAll("\004","\\\\004")
				.replaceAll("\022","\\\\022")
				.replaceAll("\013","\\\\013")
				.replaceAll("\000", "\\\\000")
				;
	}

	static void printTokenStream(String filename) {
		//create input stream
		ANTLRInputStream inStream = null;

		try {
			inStream = new ANTLRInputStream(new FileInputStream(filename));
		} catch(IOException e) {
			System.err.println("Cannot read input file.");
			System.exit(1);
		}

		lex lexer = new lex(inStream);

		//Call Lexer API for token stream
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		tokens.fill();

		//printing the name of the file
		String name = filename.substring(filename.lastIndexOf('/') + 1);
		System.out.println("#name \"" + name + "\"");

		final int BOOL_CONST_INDEX = Arrays.asList(TOKENS).indexOf("BOOL_CONST");
		final int STR_CONST_INDEX = Arrays.asList(TOKENS).indexOf("STR_CONST");
		final int ERROR_INDEX = Arrays.asList(TOKENS).indexOf("ERROR");

		//Print tokens
		int typeid;
		for(Token t: tokens.getTokens()) {
			typeid = t.getType();
                        if(typeid > TOKENS.length){
				System.out.println("Invalid Token generated - Token id : "+typeid+" for text \""+t.getText()+"\"");
				continue;
			}
			if(typeid != EOF_TYPEID) {
				String output = String.format("#%d %s", t.getLine(), TOKENS[typeid - 1]);

				if(typeid <= VALUED_INDEX_LIMIT) {

					if(typeid - 1 == BOOL_CONST_INDEX)
						output += " " + t.getText().toLowerCase();

					else if(typeid - 1 == STR_CONST_INDEX)
						output += " \"" + escapeSpecialCharacters(t.getText()) + "\"";
					else if(typeid - 1 == ERROR_INDEX)
						output += " \"" + escapeSpecialCharacters(t.getText()) + "\"";
					else
						output += " " + t.getText();

				}

				System.out.println(output);
			}
		}
	}
}