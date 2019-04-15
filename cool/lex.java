// Generated from lex.g4 by ANTLR 4.7.1
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, ELSEIF=43, DIGIT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "IF", "FI", "OF", "NEW", "NOT", "LET", "A", "C", 
		"D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", "T", "U", "V", 
		"W", "CASE", "ESAC", "ELSE", "THEN", "LOOP", "POOL", "CLASS", "WHILE", 
		"ELSEIF", "ISVOID", "INHERITS", "BOOL_CONST", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "COLON", "ASSIGN", "DOT", "ATSYM", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "INT_CONST", "DIGIT", 
		"TYPEID", "OBJECTID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "ELSEIF", "DIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		/*
		Function to report errors. Use this function whenever your lexer encounters any erroneous input
		DO NOT EDIT THIS FUNCTION
		*/
		public void reportError(String errorString){									// Error reporting function
			setText(errorString);
			setType(ERROR);
		}

		public void reportTokenError(String errorString){							// function to report Un-recognized token error
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			setText(errorString + text);
			setType(ERROR);
		}

		public void processString(){																	// function to remove extra '\' from the processed string (in case of escaped chars)
			Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
			String text = t.getText();
			if(text.length() > 1024){																		// reportError if length >= 1024
				reportError("String constant too long");
				return;
			}
			String text_ = "";
			int index;
			for(int i = 0;i < text.length();i++){
				if(text.charAt(i) == '\\'){
					++i;
					if(text.charAt(i) == 'n'){
						text_ += '\n';
					}
					else if(text.charAt(i) == 't'){
						text_ += '\t';
					}
					else if(text.charAt(i) == 'b'){
						text_ += '\b';
					}
					else if(text.charAt(i) == 'f'){
						text_ += '\f';
					}
					else if(text.charAt(i) == '0'){
						text_ += '0';
					}
					else if(text.charAt(i) == '\\'){
						text_ += '\\';
					}
					else{
						text_ += text.charAt(i);
					}
				}
				else if(text.charAt(i) == '\"'){
					text_ += "";
				}
				else{
					text_ += text.charAt(i);
				}
			}
			setText(text_);
		}


	public lex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0100\n&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"8\68\u0127\n8\r8\168\u0128\39\39\3:\3:\7:\u012f\n:\f:\16:\u0132\13:\3"+
		";\3;\7;\u0136\n;\f;\16;\u0139\13;\2\2<\3\r\5\31\7\37\t\36\13)\r*\17,\21"+
		"\"\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\'\67(9\35;%=#?$A\34C&E-G+I!K\6M\tO\nQ\26S\27U\13W\33Y\30[\f]\16"+
		"_\17a\20c\21e\22g\23i\24k\32m\25o\7q.s\4u\5\3\2\30\4\2KKkk\4\2HHhh\4\2"+
		"QQqq\4\2PPpp\4\2GGgg\4\2YYyy\4\2VVvv\4\2NNnn\4\2CCcc\4\2EEee\4\2FFff\4"+
		"\2JJjj\4\2RRrr\4\2TTtt\4\2UUuu\4\2WWww\4\2XXxx\3\2\62;\3\2C\\\5\2\62;"+
		"C\\c|\4\2aac|\6\2\62;C\\aac|\2\u012c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7|\3\2\2\2\t\177\3\2\2\2\13\u0082"+
		"\3\2\2\2\r\u0085\3\2\2\2\17\u0089\3\2\2\2\21\u008d\3\2\2\2\23\u0091\3"+
		"\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2"+
		"\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%"+
		"\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3"+
		"\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2"+
		"\2\67\u00b8\3\2\2\29\u00bd\3\2\2\2;\u00c2\3\2\2\2=\u00c7\3\2\2\2?\u00cc"+
		"\3\2\2\2A\u00d1\3\2\2\2C\u00d7\3\2\2\2E\u00dd\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00eb\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0105\3\2"+
		"\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010b\3\2\2\2Y\u010e\3\2\2\2[\u0110"+
		"\3\2\2\2]\u0112\3\2\2\2_\u0114\3\2\2\2a\u0116\3\2\2\2c\u0118\3\2\2\2e"+
		"\u011a\3\2\2\2g\u011c\3\2\2\2i\u011e\3\2\2\2k\u0120\3\2\2\2m\u0123\3\2"+
		"\2\2o\u0126\3\2\2\2q\u012a\3\2\2\2s\u012c\3\2\2\2u\u0133\3\2\2\2wx\7="+
		"\2\2x\4\3\2\2\2yz\7?\2\2z{\7@\2\2{\6\3\2\2\2|}\t\2\2\2}~\t\3\2\2~\b\3"+
		"\2\2\2\177\u0080\t\3\2\2\u0080\u0081\t\2\2\2\u0081\n\3\2\2\2\u0082\u0083"+
		"\t\4\2\2\u0083\u0084\t\3\2\2\u0084\f\3\2\2\2\u0085\u0086\t\5\2\2\u0086"+
		"\u0087\t\6\2\2\u0087\u0088\t\7\2\2\u0088\16\3\2\2\2\u0089\u008a\t\5\2"+
		"\2\u008a\u008b\t\4\2\2\u008b\u008c\t\b\2\2\u008c\20\3\2\2\2\u008d\u008e"+
		"\t\t\2\2\u008e\u008f\t\6\2\2\u008f\u0090\t\b\2\2\u0090\22\3\2\2\2\u0091"+
		"\u0092\t\n\2\2\u0092\24\3\2\2\2\u0093\u0094\t\13\2\2\u0094\26\3\2\2\2"+
		"\u0095\u0096\t\f\2\2\u0096\30\3\2\2\2\u0097\u0098\t\6\2\2\u0098\32\3\2"+
		"\2\2\u0099\u009a\t\3\2\2\u009a\34\3\2\2\2\u009b\u009c\t\r\2\2\u009c\36"+
		"\3\2\2\2\u009d\u009e\t\2\2\2\u009e \3\2\2\2\u009f\u00a0\t\t\2\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\t\5\2\2\u00a2$\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00a6\t\16\2\2\u00a6(\3\2\2\2\u00a7\u00a8\t\17\2\2\u00a8"+
		"*\3\2\2\2\u00a9\u00aa\t\20\2\2\u00aa,\3\2\2\2\u00ab\u00ac\t\b\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\t\21\2\2\u00ae\60\3\2\2\2\u00af\u00b0\t\22\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\t\7\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\5\25\13\2"+
		"\u00b4\u00b5\5\23\n\2\u00b5\u00b6\5+\26\2\u00b6\u00b7\5\31\r\2\u00b7\66"+
		"\3\2\2\2\u00b8\u00b9\5\31\r\2\u00b9\u00ba\5+\26\2\u00ba\u00bb\5\23\n\2"+
		"\u00bb\u00bc\5\25\13\2\u00bc8\3\2\2\2\u00bd\u00be\5\31\r\2\u00be\u00bf"+
		"\5!\21\2\u00bf\u00c0\5+\26\2\u00c0\u00c1\5\31\r\2\u00c1:\3\2\2\2\u00c2"+
		"\u00c3\5-\27\2\u00c3\u00c4\5\35\17\2\u00c4\u00c5\5\31\r\2\u00c5\u00c6"+
		"\5#\22\2\u00c6<\3\2\2\2\u00c7\u00c8\5!\21\2\u00c8\u00c9\5%\23\2\u00c9"+
		"\u00ca\5%\23\2\u00ca\u00cb\5\'\24\2\u00cb>\3\2\2\2\u00cc\u00cd\5\'\24"+
		"\2\u00cd\u00ce\5%\23\2\u00ce\u00cf\5%\23\2\u00cf\u00d0\5!\21\2\u00d0@"+
		"\3\2\2\2\u00d1\u00d2\5\25\13\2\u00d2\u00d3\5!\21\2\u00d3\u00d4\5\23\n"+
		"\2\u00d4\u00d5\5+\26\2\u00d5\u00d6\5+\26\2\u00d6B\3\2\2\2\u00d7\u00d8"+
		"\5\63\32\2\u00d8\u00d9\5\35\17\2\u00d9\u00da\5\37\20\2\u00da\u00db\5!"+
		"\21\2\u00db\u00dc\5\31\r\2\u00dcD\3\2\2\2\u00dd\u00de\5\31\r\2\u00de\u00df"+
		"\5!\21\2\u00df\u00e0\5+\26\2\u00e0\u00e1\5\31\r\2\u00e1\u00e2\5\37\20"+
		"\2\u00e2\u00e3\5\33\16\2\u00e3F\3\2\2\2\u00e4\u00e5\5\37\20\2\u00e5\u00e6"+
		"\5+\26\2\u00e6\u00e7\5\61\31\2\u00e7\u00e8\5%\23\2\u00e8\u00e9\5\37\20"+
		"\2\u00e9\u00ea\5\27\f\2\u00eaH\3\2\2\2\u00eb\u00ec\5\37\20\2\u00ec\u00ed"+
		"\5#\22\2\u00ed\u00ee\5\35\17\2\u00ee\u00ef\5\31\r\2\u00ef\u00f0\5)\25"+
		"\2\u00f0\u00f1\5\37\20\2\u00f1\u00f2\5-\27\2\u00f2\u00f3\5+\26\2\u00f3"+
		"J\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\5)\25\2\u00f6\u00f7\5/\30\2\u00f7"+
		"\u00f8\5\31\r\2\u00f8\u0100\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\5\23"+
		"\n\2\u00fb\u00fc\5!\21\2\u00fc\u00fd\5+\26\2\u00fd\u00fe\5\31\r\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f9\3\2\2\2\u0100L\3\2\2\2"+
		"\u0101\u0102\7*\2\2\u0102N\3\2\2\2\u0103\u0104\7+\2\2\u0104P\3\2\2\2\u0105"+
		"\u0106\7}\2\2\u0106R\3\2\2\2\u0107\u0108\7\177\2\2\u0108T\3\2\2\2\u0109"+
		"\u010a\7<\2\2\u010aV\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d\7/\2\2\u010d"+
		"X\3\2\2\2\u010e\u010f\7\60\2\2\u010fZ\3\2\2\2\u0110\u0111\7B\2\2\u0111"+
		"\\\3\2\2\2\u0112\u0113\7.\2\2\u0113^\3\2\2\2\u0114\u0115\7-\2\2\u0115"+
		"`\3\2\2\2\u0116\u0117\7/\2\2\u0117b\3\2\2\2\u0118\u0119\7,\2\2\u0119d"+
		"\3\2\2\2\u011a\u011b\7\61\2\2\u011bf\3\2\2\2\u011c\u011d\7\u0080\2\2\u011d"+
		"h\3\2\2\2\u011e\u011f\7>\2\2\u011fj\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122"+
		"\7?\2\2\u0122l\3\2\2\2\u0123\u0124\7?\2\2\u0124n\3\2\2\2\u0125\u0127\5"+
		"q9\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129p\3\2\2\2\u012a\u012b\t\23\2\2\u012br\3\2\2\2\u012c"+
		"\u0130\t\24\2\2\u012d\u012f\t\25\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131t\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0133\u0137\t\26\2\2\u0134\u0136\t\27\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138v\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\7\2\u00ff\u0128\u0130\u0137\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}