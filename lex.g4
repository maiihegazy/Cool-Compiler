lexer grammar lex;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

@members{
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
}

SEMICOLON   : ';';
DARROW      : '=>';

// grammar for parsing small-length tokens
IF : ('i'|'I') ('f'|'F');
FI : ('f'|'F') ('i'|'I');
OF : ('o'|'O') ('f'|'F');
NEW	: ('n'|'N') ('e'|'E') ('w'|'W');
NOT : ('n'|'N') ('o'|'O') ('t'|'T');
LET : ('l'|'L') ('e'|'E') ('t'|'T');

/*
OBJECTID and TYPEID tokens are defined after keyword definitions since they may conflict with keywords, like 'if' may match
OBJECTID, etc.
*/

/*
We use fragments which are special type of tokens, these tokens are not matched by any input, but
they help us define the other tokens, for example, if we have the input as 'let', then it will identified
by the token 'L E T' and not the individual fragment L : ('l'|'L') or fragment E : ('e'|'E'), etc., even if
they are appearing before the token LET, since they are mere 'fragments' and they don't act as tokens,
instead they should be defined at the top, since they cause no conflict and help define 'LONG' tokens in a compact way,
fragments are defined only for needed chars to avoid unnecessary conflicts.
The following are some english alphabets in character classes defined for respective tokens to be matched.
Other example can be of 'a' matching OBJECTID and not ('a'|'A') since its defined as a fragment, thus not matched.
*/

fragment A : [aA];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment H : [hH];
fragment I : [iI];
fragment L : [lL];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];

// token definitions using above defined fragments
CASE : C A S E;
ESAC : E S A C;
ELSE : E L S E;
THEN : T H E N;
LOOP : L O O P;
POOL : P O O L;
CLASS : C L A S S;
WHILE : W H I L E;
ELSEIF : E L S E I F;
ISVOID : I S V O I D;
INHERITS : I N H E R I T S;
BOOL_CONST : 't' R U E | 'f' A L S E;

// other token definitions
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
COLON : ':';
ASSIGN : '<-';
DOT : '.';
ATSYM : '@';
COMMA : ',';
PLUS : '+';
MINUS : '-';
STAR : '*';
SLASH : '/';
TILDE : '~';
LT : '<';
LE : '<=';
EQUALS : '=';

// INT_CONST definition (one or most digits, concatenated in a greedy manner)
INT_CONST : DIGIT+;
DIGIT : [0-9];

// TYPEID begins with Capital, and then alphanumeric + INT_CONST
TYPEID : [A-Z][0-9a-zA-Z]*;
// OBJECTID only differs from TYPEID in the starting letter being a lowercase letter
OBJECTID : [a-z_][0-9a-zA-Z_]*;