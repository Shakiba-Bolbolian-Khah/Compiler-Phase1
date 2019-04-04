// Generated from /home/hosna/IdeaProjects/ph1/grammar/Toorla_Actions.g4 by ANTLR 4.7.2

    import toorla.ast.*;
    import toorla.ast.declaration.*;
    import toorla.ast.declaration.classDecs.*;
    import toorla.ast.declaration.classDecs.classMembersDecs.*;
    import toorla.ast.declaration.localVarDecs.*;
    import toorla.ast.expression.*;
    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.unaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.statement.*;
    import toorla.ast.statement.localVarStats.*;
    import toorla.ast.statement.returnStatement.*;
    import toorla.types.*;
    import toorla.types.arrayType.*;
    import toorla.types.singleType.*;



import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Toorla_ActionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INHERIT=3, FUNCTION=4, FIELD=5, SELF=6, TRUE=7, FALSE=8, 
		ELSE=9, ELIF=10, NEW=11, RETURN=12, RETURNS=13, BOOL=14, STRING=15, INT=16, 
		VAR=17, CLASS=18, MAINCLASS=19, IF=20, WHILE=21, BREAK=22, CONTINUE=23, 
		PRINT=24, PUBLIC=25, PRIVATE=26, PLUS=27, MINUSNEG=28, MULT=29, DIV=30, 
		MOD=31, EQUAL=32, NEQUAL=33, LT=34, GT=35, AND=36, OR=37, NOT=38, ASSIGN=39, 
		COMMENT=40, LINECOMMENT=41, WS=42, SEMICOLON=43, INC=44, DEC=45, COLON=46, 
		COMMA=47, DOT=48, STRTOKEN=49, RPARAN=50, LPARAN=51, RBRACKET=52, LBRACKET=53, 
		NUMBER=54, ID=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGIN", "END", "INHERIT", "FUNCTION", "FIELD", "SELF", "TRUE", "FALSE", 
			"ELSE", "ELIF", "NEW", "RETURN", "RETURNS", "BOOL", "STRING", "INT", 
			"VAR", "CLASS", "MAINCLASS", "IF", "WHILE", "BREAK", "CONTINUE", "PRINT", 
			"PUBLIC", "PRIVATE", "PLUS", "MINUSNEG", "MULT", "DIV", "MOD", "EQUAL", 
			"NEQUAL", "LT", "GT", "AND", "OR", "NOT", "ASSIGN", "COMMENT", "LINECOMMENT", 
			"WS", "SEMICOLON", "INC", "DEC", "COLON", "COMMA", "DOT", "STRTOKEN", 
			"RPARAN", "LPARAN", "RBRACKET", "LBRACKET", "NUMBER", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'inherits'", "'function'", "'field'", "'self'", 
			"'true'", "'false'", "'else'", "'elif'", "'new'", "'return'", "'returns'", 
			"'bool'", "'string'", "'int'", "'var'", "'class'", "'entry class'", "'if'", 
			"'while'", "'break'", "'continue'", "'print'", "'public'", "'private'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'<>'", "'<'", "'>'", "'&&'", 
			"'||'", "'!'", "'='", null, null, null, "';'", "'++'", "'--'", "':'", 
			"','", "'.'", null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "END", "INHERIT", "FUNCTION", "FIELD", "SELF", "TRUE", 
			"FALSE", "ELSE", "ELIF", "NEW", "RETURN", "RETURNS", "BOOL", "STRING", 
			"INT", "VAR", "CLASS", "MAINCLASS", "IF", "WHILE", "BREAK", "CONTINUE", 
			"PRINT", "PUBLIC", "PRIVATE", "PLUS", "MINUSNEG", "MULT", "DIV", "MOD", 
			"EQUAL", "NEQUAL", "LT", "GT", "AND", "OR", "NOT", "ASSIGN", "COMMENT", 
			"LINECOMMENT", "WS", "SEMICOLON", "INC", "DEC", "COLON", "COMMA", "DOT", 
			"STRTOKEN", "RPARAN", "LPARAN", "RBRACKET", "LBRACKET", "NUMBER", "ID"
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


	public Toorla_ActionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Toorla_Actions.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0180\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)"+
		"\7)\u0136\n)\f)\16)\u0139\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u0144\n*\f"+
		"*\16*\u0147\13*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0161\n\62\f\62\16\62\u0164\13"+
		"\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\7\67\u0172"+
		"\n\67\f\67\16\67\u0175\13\67\3\67\5\67\u0178\n\67\38\38\78\u017c\n8\f"+
		"8\168\u017f\138\3\u0137\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9\3\2\13\4\2\f\f\17\17\4\2\13\f\"\"\4\2$$^^"+
		"\6\2\f\f\17\17$$^^\3\2\63;\3\2\62;\3\2\62\62\4\2C\\c|\6\2\62;C\\aac|\2"+
		"\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5w\3\2\2\2\7{\3\2\2\2\t\u0084\3\2\2\2"+
		"\13\u008d\3\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23"+
		"\u00a3\3\2\2\2\25\u00a8\3\2\2\2\27\u00ad\3\2\2\2\31\u00b1\3\2\2\2\33\u00b8"+
		"\3\2\2\2\35\u00c0\3\2\2\2\37\u00c5\3\2\2\2!\u00cc\3\2\2\2#\u00d0\3\2\2"+
		"\2%\u00d4\3\2\2\2\'\u00da\3\2\2\2)\u00e6\3\2\2\2+\u00e9\3\2\2\2-\u00ef"+
		"\3\2\2\2/\u00f5\3\2\2\2\61\u00fe\3\2\2\2\63\u0104\3\2\2\2\65\u010b\3\2"+
		"\2\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u0117\3\2\2\2=\u0119\3\2\2\2?\u011b"+
		"\3\2\2\2A\u011d\3\2\2\2C\u0120\3\2\2\2E\u0123\3\2\2\2G\u0125\3\2\2\2I"+
		"\u0127\3\2\2\2K\u012a\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u0131\3\2"+
		"\2\2S\u013f\3\2\2\2U\u014a\3\2\2\2W\u014e\3\2\2\2Y\u0150\3\2\2\2[\u0153"+
		"\3\2\2\2]\u0156\3\2\2\2_\u0158\3\2\2\2a\u015a\3\2\2\2c\u015c\3\2\2\2e"+
		"\u0167\3\2\2\2g\u0169\3\2\2\2i\u016b\3\2\2\2k\u016d\3\2\2\2m\u0177\3\2"+
		"\2\2o\u0179\3\2\2\2qr\7d\2\2rs\7g\2\2st\7i\2\2tu\7k\2\2uv\7p\2\2v\4\3"+
		"\2\2\2wx\7g\2\2xy\7p\2\2yz\7f\2\2z\6\3\2\2\2{|\7k\2\2|}\7p\2\2}~\7j\2"+
		"\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7v\2\2"+
		"\u0082\u0083\7u\2\2\u0083\b\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7w"+
		"\2\2\u0086\u0087\7p\2\2\u0087\u0088\7e\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7q\2\2\u008b\u008c\7p\2\2\u008c\n\3\2\2\2\u008d\u008e"+
		"\7h\2\2\u008e\u008f\7k\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7f\2\2\u0092\f\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7n\2\2\u0096\u0097\7h\2\2\u0097\16\3\2\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2\2\u009c\20\3\2\2\2\u009d"+
		"\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7"+
		"n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\24\3\2\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\26\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7y\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7\32\3\2\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7w\2\2"+
		"\u00bc\u00bd\7t\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2\u00bf\34\3\2"+
		"\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8"+
		"\7t\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7i\2\2\u00cb"+
		" \3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\"\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"$\3\2\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7u\2\2\u00d8\u00d9\7u\2\2\u00d9&\3\2\2\2\u00da\u00db\7g\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7{\2\2"+
		"\u00df\u00e0\7\"\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7u\2\2\u00e5(\3\2\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7h\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb"+
		"\7j\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		",\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7m\2\2\u00f4.\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7p\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7g\2\2\u00fd\60\3\2"+
		"\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7p\2\2\u0102\u0103\7v\2\2\u0103\62\3\2\2\2\u0104\u0105\7r\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u010a\7e\2\2\u010a\64\3\2\2\2\u010b\u010c\7r\2\2\u010c\u010d\7t\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7x\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2"+
		"\u0111\u0112\7g\2\2\u0112\66\3\2\2\2\u0113\u0114\7-\2\2\u01148\3\2\2\2"+
		"\u0115\u0116\7/\2\2\u0116:\3\2\2\2\u0117\u0118\7,\2\2\u0118<\3\2\2\2\u0119"+
		"\u011a\7\61\2\2\u011a>\3\2\2\2\u011b\u011c\7\'\2\2\u011c@\3\2\2\2\u011d"+
		"\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fB\3\2\2\2\u0120\u0121\7>\2\2\u0121"+
		"\u0122\7@\2\2\u0122D\3\2\2\2\u0123\u0124\7>\2\2\u0124F\3\2\2\2\u0125\u0126"+
		"\7@\2\2\u0126H\3\2\2\2\u0127\u0128\7(\2\2\u0128\u0129\7(\2\2\u0129J\3"+
		"\2\2\2\u012a\u012b\7~\2\2\u012b\u012c\7~\2\2\u012cL\3\2\2\2\u012d\u012e"+
		"\7#\2\2\u012eN\3\2\2\2\u012f\u0130\7?\2\2\u0130P\3\2\2\2\u0131\u0132\7"+
		"\61\2\2\u0132\u0133\7,\2\2\u0133\u0137\3\2\2\2\u0134\u0136\13\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b"+
		"\u013c\7\61\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b)\2\2\u013eR\3\2\2\2"+
		"\u013f\u0140\7\61\2\2\u0140\u0141\7\61\2\2\u0141\u0145\3\2\2\2\u0142\u0144"+
		"\n\2\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\b*"+
		"\2\2\u0149T\3\2\2\2\u014a\u014b\t\3\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\b+\2\2\u014dV\3\2\2\2\u014e\u014f\7=\2\2\u014fX\3\2\2\2\u0150\u0151\7"+
		"-\2\2\u0151\u0152\7-\2\2\u0152Z\3\2\2\2\u0153\u0154\7/\2\2\u0154\u0155"+
		"\7/\2\2\u0155\\\3\2\2\2\u0156\u0157\7<\2\2\u0157^\3\2\2\2\u0158\u0159"+
		"\7.\2\2\u0159`\3\2\2\2\u015a\u015b\7\60\2\2\u015bb\3\2\2\2\u015c\u0162"+
		"\7$\2\2\u015d\u015e\7^\2\2\u015e\u0161\t\4\2\2\u015f\u0161\n\5\2\2\u0160"+
		"\u015d\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\7$\2\2\u0166d\3\2\2\2\u0167\u0168\7*\2\2\u0168f\3\2\2\2\u0169\u016a"+
		"\7+\2\2\u016ah\3\2\2\2\u016b\u016c\7]\2\2\u016cj\3\2\2\2\u016d\u016e\7"+
		"_\2\2\u016el\3\2\2\2\u016f\u0173\t\6\2\2\u0170\u0172\t\7\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0178\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\t\b\2\2\u0177\u016f\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178n\3\2\2\2\u0179\u017d\t\t\2\2\u017a\u017c"+
		"\t\n\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017ep\3\2\2\2\u017f\u017d\3\2\2\2\n\2\u0137\u0145\u0160"+
		"\u0162\u0173\u0177\u017d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}