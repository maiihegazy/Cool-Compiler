// Generated from C:/Users/Mai Hegazy/IdeaProjects/untitled\lex.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, EOF_STRING=44, 
		SINGLE_BACKSLASH=45, SL_COMMENT=46, ML_COMMENT=47, E_COMMENT=48, OTHER=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", 
			"ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", 
			"ISVOID", "NOT", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", "FALSE", 
			"BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", "WHITESPACE", "EOF_STRING", 
			"SINGLE_BACKSLASH", "STR_CONST", "OPEN", "CLOSE", "SL_COMMENT", "ML_COMMENT", 
			"E_COMMENT", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
			"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
			"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
			"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"DARROW", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", 
			"ISVOID", "NOT", "WHITESPACE", "EOF_STRING", "SINGLE_BACKSLASH", "SL_COMMENT", 
			"ML_COMMENT", "E_COMMENT", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 54:
			E_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void E_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
//			reportError("UnMatched comment identifier.");
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
//			unmatched();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3,\3,\5,\u0103\n,\3-\6-\u0106\n-\r-\16-\u0107\3.\3.\3.\3.\7"+
		".\u010e\n.\f.\16.\u0111\13.\3/\3/\3/\3/\7/\u0117\n/\f/\16/\u011a\13/\3"+
		"\60\6\60\u011d\n\60\r\60\16\60\u011e\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0127\n\61\f\61\16\61\u012a\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0136\n\63\f\63\16\63\u0139\13\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0145\n\66\f\66\16\66\u0148\13"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u0153\n\67\f\67"+
		"\16\67\u0156\13\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\4"+
		"\u0146\u0154\2:\3\r\5\31\7\t\t\n\13\16\r\17\17\20\21\21\23\22\25\23\27"+
		"\24\31\32\33\25\35\26\37\27!\30#\33%\f\'\13)\'+(-\37/\36\61&\63%\65\35"+
		"\67#9$;\34= ?!A)C\"E*G+I,K\2M\2O\2Q\2S\2U\2W\6Y\7[\4]\5_-a.c/e\bg\2i\2"+
		"k\60m\61o\62q\63\3\2\32\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4\2HH"+
		"hh\4\2YYyy\4\2JJjj\4\2NNnn\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2"+
		"XXxx\4\2FFff\4\2C\\c|\4\2WWww\5\2\13\f\16\17\"\"\4\2$$^^\4\2\f\f$$\5\2"+
		"$$**,,\4\2$$+,\4\2\f\f\17\17\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7x\3\2"+
		"\2\2\tz\3\2\2\2\13|\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008a\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095"+
		"\3\2\2\2%\u0098\3\2\2\2\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u00a1\3\2\2\2"+
		"-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61\u00ac\3\2\2\2\63\u00b2\3\2\2\2\65\u00b7"+
		"\3\2\2\2\67\u00bc\3\2\2\29\u00c1\3\2\2\2;\u00c6\3\2\2\2=\u00cc\3\2\2\2"+
		"?\u00cf\3\2\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E\u00de\3\2\2\2G\u00e2\3"+
		"\2\2\2I\u00e9\3\2\2\2K\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00f1\3\2\2\2Q\u00f3"+
		"\3\2\2\2S\u00f5\3\2\2\2U\u00fa\3\2\2\2W\u0102\3\2\2\2Y\u0105\3\2\2\2["+
		"\u0109\3\2\2\2]\u0112\3\2\2\2_\u011c\3\2\2\2a\u0122\3\2\2\2c\u012d\3\2"+
		"\2\2e\u0131\3\2\2\2g\u013c\3\2\2\2i\u013e\3\2\2\2k\u0140\3\2\2\2m\u014d"+
		"\3\2\2\2o\u015c\3\2\2\2q\u0161\3\2\2\2st\7=\2\2t\4\3\2\2\2uv\7?\2\2vw"+
		"\7@\2\2w\6\3\2\2\2xy\7*\2\2y\b\3\2\2\2z{\7+\2\2{\n\3\2\2\2|}\7.\2\2}\f"+
		"\3\2\2\2~\177\7-\2\2\177\16\3\2\2\2\u0080\u0081\7/\2\2\u0081\20\3\2\2"+
		"\2\u0082\u0083\7,\2\2\u0083\22\3\2\2\2\u0084\u0085\7\61\2\2\u0085\24\3"+
		"\2\2\2\u0086\u0087\7\u0080\2\2\u0087\26\3\2\2\2\u0088\u0089\7>\2\2\u0089"+
		"\30\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c\32\3\2\2\2\u008d"+
		"\u008e\7?\2\2\u008e\34\3\2\2\2\u008f\u0090\7}\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7\177\2\2\u0092 \3\2\2\2\u0093\u0094\7\60\2\2\u0094\"\3\2\2\2\u0095"+
		"\u0096\7>\2\2\u0096\u0097\7/\2\2\u0097$\3\2\2\2\u0098\u0099\7B\2\2\u0099"+
		"&\3\2\2\2\u009a\u009b\7<\2\2\u009b(\3\2\2\2\u009c\u009d\t\2\2\2\u009d"+
		"\u009e\t\3\2\2\u009e\u009f\t\4\2\2\u009f\u00a0\t\5\2\2\u00a0*\3\2\2\2"+
		"\u00a1\u00a2\t\5\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a4\t\3\2\2\u00a4\u00a5"+
		"\t\2\2\2\u00a5,\3\2\2\2\u00a6\u00a7\t\6\2\2\u00a7\u00a8\t\7\2\2\u00a8"+
		".\3\2\2\2\u00a9\u00aa\t\7\2\2\u00aa\u00ab\t\6\2\2\u00ab\60\3\2\2\2\u00ac"+
		"\u00ad\t\b\2\2\u00ad\u00ae\t\t\2\2\u00ae\u00af\t\6\2\2\u00af\u00b0\t\n"+
		"\2\2\u00b0\u00b1\t\5\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\t\13\2\2\u00b3\u00b4"+
		"\t\t\2\2\u00b4\u00b5\t\5\2\2\u00b5\u00b6\t\f\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\t\5\2\2\u00b8\u00b9\t\n\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bb\t\5"+
		"\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\t\n\2\2\u00bd\u00be\t\r\2\2\u00be\u00bf"+
		"\t\r\2\2\u00bf\u00c0\t\16\2\2\u00c08\3\2\2\2\u00c1\u00c2\t\16\2\2\u00c2"+
		"\u00c3\t\r\2\2\u00c3\u00c4\t\r\2\2\u00c4\u00c5\t\n\2\2\u00c5:\3\2\2\2"+
		"\u00c6\u00c7\t\2\2\2\u00c7\u00c8\t\n\2\2\u00c8\u00c9\t\3\2\2\u00c9\u00ca"+
		"\t\4\2\2\u00ca\u00cb\t\4\2\2\u00cb<\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd"+
		"\u00ce\t\f\2\2\u00ce>\3\2\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00d1\t\t\2\2"+
		"\u00d1\u00d2\t\5\2\2\u00d2\u00d3\t\17\2\2\u00d3\u00d4\t\6\2\2\u00d4\u00d5"+
		"\t\13\2\2\u00d5\u00d6\t\4\2\2\u00d6@\3\2\2\2\u00d7\u00d8\t\r\2\2\u00d8"+
		"\u00d9\t\7\2\2\u00d9B\3\2\2\2\u00da\u00db\t\n\2\2\u00db\u00dc\t\5\2\2"+
		"\u00dc\u00dd\t\13\2\2\u00ddD\3\2\2\2\u00de\u00df\t\f\2\2\u00df\u00e0\t"+
		"\5\2\2\u00e0\u00e1\t\b\2\2\u00e1F\3\2\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4"+
		"\t\4\2\2\u00e4\u00e5\t\20\2\2\u00e5\u00e6\t\r\2\2\u00e6\u00e7\t\6\2\2"+
		"\u00e7\u00e8\t\21\2\2\u00e8H\3\2\2\2\u00e9\u00ea\t\f\2\2\u00ea\u00eb\t"+
		"\r\2\2\u00eb\u00ec\t\13\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\4\62;\2\u00eeL"+
		"\3\2\2\2\u00ef\u00f0\4c|\2\u00f0N\3\2\2\2\u00f1\u00f2\4C\\\2\u00f2P\3"+
		"\2\2\2\u00f3\u00f4\t\22\2\2\u00f4R\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\t\17\2\2\u00f7\u00f8\t\23\2\2\u00f8\u00f9\t\5\2\2\u00f9T\3\2\2\2\u00fa"+
		"\u00fb\7h\2\2\u00fb\u00fc\t\3\2\2\u00fc\u00fd\t\n\2\2\u00fd\u00fe\t\4"+
		"\2\2\u00fe\u00ff\t\5\2\2\u00ffV\3\2\2\2\u0100\u0103\5S*\2\u0101\u0103"+
		"\5U+\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103X\3\2\2\2\u0104\u0106"+
		"\5K&\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108Z\3\2\2\2\u0109\u010f\5O(\2\u010a\u010e\7a\2\2\u010b"+
		"\u010e\5Q)\2\u010c\u010e\5K&\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\\\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0118\5M\'\2\u0113"+
		"\u0117\7a\2\2\u0114\u0117\5Q)\2\u0115\u0117\5K&\2\u0116\u0113\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119^\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011d\t\24\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b\60\2\2\u0121"+
		"`\3\2\2\2\u0122\u0128\7$\2\2\u0123\u0127\7^\2\2\u0124\u0127\5_\60\2\u0125"+
		"\u0127\n\25\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\2\2\3\u012cb\3\2\2\2"+
		"\u012d\u012e\7$\2\2\u012e\u012f\7^\2\2\u012f\u0130\7$\2\2\u0130d\3\2\2"+
		"\2\u0131\u0137\7$\2\2\u0132\u0136\7^\2\2\u0133\u0136\n\26\2\2\u0134\u0136"+
		"\5_\60\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7$\2\2\u013bf\3\2\2\2\u013c\u013d"+
		"\n\27\2\2\u013dh\3\2\2\2\u013e\u013f\n\30\2\2\u013fj\3\2\2\2\u0140\u0141"+
		"\7/\2\2\u0141\u0142\7/\2\2\u0142\u0146\3\2\2\2\u0143\u0145\13\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\t\31\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\66\2\2\u014cl\3\2\2\2\u014d\u014e\7*\2\2"+
		"\u014e\u014f\7,\2\2\u014f\u0154\3\2\2\2\u0150\u0153\5m\67\2\u0151\u0153"+
		"\13\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u0158\7,\2\2\u0158\u0159\7+\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\b\67\2\2\u015bn\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\7+\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\b8\3\2\u0160p\3\2\2\2\u0161\u0162\13\2\2\2"+
		"\u0162\u0163\b9\4\2\u0163r\3\2\2\2\21\2\u0102\u0107\u010d\u010f\u0116"+
		"\u0118\u011e\u0126\u0128\u0135\u0137\u0146\u0152\u0154\5\b\2\2\38\2\3"+
		"9\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}