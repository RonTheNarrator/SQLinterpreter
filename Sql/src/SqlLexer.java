// Generated from Sql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DatatypeI=2, DatatypeF=3, DatatypeT=4, DatatypeB=5, True=6, False=7, 
		Select=8, From=9, Where=10, And=11, Or=12, In=13, Not=14, Order=15, By=16, 
		Descending=17, Update=18, Set=19, Delete=20, Like=21, Insert=22, Into=23, 
		Values=24, Join=25, Inner=26, Outer=27, Left=28, Right=29, Full=30, Create=31, 
		Table=32, Plus=33, Minus=34, Star=35, Divide=36, Equals=37, Lesser=38, 
		Greater=39, Greater_Equal=40, Leser_Equal=41, Not_Equal=42, BracketL=43, 
		BracketR=44, SColon=45, Coma=46, Id=47, Liczba=48, String=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "DatatypeI", "DatatypeF", "DatatypeT", "DatatypeB", "True", "False", 
			"Select", "From", "Where", "And", "Or", "In", "Not", "Order", "By", "Descending", 
			"Update", "Set", "Delete", "Like", "Insert", "Into", "Values", "Join", 
			"Inner", "Outer", "Left", "Right", "Full", "Create", "Table", "Plus", 
			"Minus", "Star", "Divide", "Equals", "Lesser", "Greater", "Greater_Equal", 
			"Leser_Equal", "Not_Equal", "BracketL", "BracketR", "SColon", "Coma", 
			"Id", "Liczba", "String"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Int'", "'Float'", "'Text'", "'Bool'", "'True'", "'False'", 
			"'Select'", "'From'", "'Where'", "'And'", "'Or'", "'In'", "'Not'", "'Order'", 
			"'By'", "'Descending'", "'Update'", "'Set'", "'Delete'", "'Like'", "'Insert'", 
			"'Into'", "'Values'", "'Join'", "'Inner'", "'Outer'", "'Left'", "'Right'", 
			"'Full'", "'Create'", "'Table'", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", 
			"'>'", "'>='", "'<='", "'<>'", "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DatatypeI", "DatatypeF", "DatatypeT", "DatatypeB", "True", 
			"False", "Select", "From", "Where", "And", "Or", "In", "Not", "Order", 
			"By", "Descending", "Update", "Set", "Delete", "Like", "Insert", "Into", 
			"Values", "Join", "Inner", "Outer", "Left", "Right", "Full", "Create", 
			"Table", "Plus", "Minus", "Star", "Divide", "Equals", "Lesser", "Greater", 
			"Greater_Equal", "Leser_Equal", "Not_Equal", "BracketL", "BracketR", 
			"SColon", "Coma", "Id", "Liczba", "String"
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


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6\2g\n\2\r"+
		"\2\16\2h\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\7\60\u0139"+
		"\n\60\f\60\16\60\u013c\13\60\3\61\6\61\u013f\n\61\r\61\16\61\u0140\3\61"+
		"\3\61\6\61\u0145\n\61\r\61\16\61\u0146\5\61\u0149\n\61\3\62\3\62\7\62"+
		"\u014d\n\62\f\62\16\62\u0150\13\62\3\62\3\62\3\62\7\62\u0155\n\62\f\62"+
		"\16\62\u0158\13\62\3\62\5\62\u015b\n\62\4\u014e\u0156\2\63\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\6\5\2\13\f\17\17\"\"\4\2C\\"+
		"c|\6\2\62;C\\aac|\3\2\62;\2\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3f\3\2\2\2\5l\3\2\2"+
		"\2\7p\3\2\2\2\tv\3\2\2\2\13{\3\2\2\2\r\u0080\3\2\2\2\17\u0085\3\2\2\2"+
		"\21\u008b\3\2\2\2\23\u0092\3\2\2\2\25\u0097\3\2\2\2\27\u009d\3\2\2\2\31"+
		"\u00a1\3\2\2\2\33\u00a4\3\2\2\2\35\u00a7\3\2\2\2\37\u00ab\3\2\2\2!\u00b1"+
		"\3\2\2\2#\u00b4\3\2\2\2%\u00bf\3\2\2\2\'\u00c6\3\2\2\2)\u00ca\3\2\2\2"+
		"+\u00d1\3\2\2\2-\u00d6\3\2\2\2/\u00dd\3\2\2\2\61\u00e2\3\2\2\2\63\u00e9"+
		"\3\2\2\2\65\u00ee\3\2\2\2\67\u00f4\3\2\2\29\u00fa\3\2\2\2;\u00ff\3\2\2"+
		"\2=\u0105\3\2\2\2?\u010a\3\2\2\2A\u0111\3\2\2\2C\u0117\3\2\2\2E\u0119"+
		"\3\2\2\2G\u011b\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2\2\2O"+
		"\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012b\3\2\2\2W\u012e\3\2"+
		"\2\2Y\u0130\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0136\3\2\2\2a\u013e"+
		"\3\2\2\2c\u015a\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ij\3\2\2\2jk\b\2\2\2k\4\3\2\2\2lm\7K\2\2mn\7p\2\2no\7v\2\2o\6\3\2"+
		"\2\2pq\7H\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7v\2\2u\b\3\2\2\2vw\7V\2\2"+
		"wx\7g\2\2xy\7z\2\2yz\7v\2\2z\n\3\2\2\2{|\7D\2\2|}\7q\2\2}~\7q\2\2~\177"+
		"\7n\2\2\177\f\3\2\2\2\u0080\u0081\7V\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7g\2\2\u0084\16\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a"+
		"\20\3\2\2\2\u008b\u008c\7U\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7e\2\2\u0090\u0091\7v\2\2\u0091\22\3\2\2\2\u0092"+
		"\u0093\7H\2\2\u0093\u0094\7t\2\2\u0094\u0095\7q\2\2\u0095\u0096\7o\2\2"+
		"\u0096\24\3\2\2\2\u0097\u0098\7Y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7"+
		"g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\26\3\2\2\2\u009d\u009e"+
		"\7C\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7f\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\7Q\2\2\u00a2\u00a3\7t\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0 \3\2\2\2\u00b1\u00b2"+
		"\7D\2\2\u00b2\u00b3\7{\2\2\u00b3\"\3\2\2\2\u00b4\u00b5\7F\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00be\7i\2\2\u00be$\3\2\2\2\u00bf\u00c0\7W\2\2\u00c0\u00c1\7r\2"+
		"\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\7N\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7m\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7v\2\2"+
		"\u00dc.\3\2\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2"+
		"\2\u00e0\u00e1\7q\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7X\2\2\u00e3\u00e4"+
		"\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7L\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7K\2\2\u00ef"+
		"\u00f0\7p\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2"+
		"\u00f3\66\3\2\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7"+
		"v\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f98\3\2\2\2\u00fa\u00fb"+
		"\7N\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7v\2\2\u00fe"+
		":\3\2\2\2\u00ff\u0100\7T\2\2\u0100\u0101\7k\2\2\u0101\u0102\7i\2\2\u0102"+
		"\u0103\7j\2\2\u0103\u0104\7v\2\2\u0104<\3\2\2\2\u0105\u0106\7H\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u0108\7n\2\2\u0108\u0109\7n\2\2\u0109>\3\2\2\2\u010a"+
		"\u010b\7E\2\2\u010b\u010c\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7c\2\2"+
		"\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2\u0110@\3\2\2\2\u0111\u0112\7V\2"+
		"\2\u0112\u0113\7c\2\2\u0113\u0114\7d\2\2\u0114\u0115\7n\2\2\u0115\u0116"+
		"\7g\2\2\u0116B\3\2\2\2\u0117\u0118\7-\2\2\u0118D\3\2\2\2\u0119\u011a\7"+
		"/\2\2\u011aF\3\2\2\2\u011b\u011c\7,\2\2\u011cH\3\2\2\2\u011d\u011e\7\61"+
		"\2\2\u011eJ\3\2\2\2\u011f\u0120\7?\2\2\u0120L\3\2\2\2\u0121\u0122\7>\2"+
		"\2\u0122N\3\2\2\2\u0123\u0124\7@\2\2\u0124P\3\2\2\2\u0125\u0126\7@\2\2"+
		"\u0126\u0127\7?\2\2\u0127R\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7?\2"+
		"\2\u012aT\3\2\2\2\u012b\u012c\7>\2\2\u012c\u012d\7@\2\2\u012dV\3\2\2\2"+
		"\u012e\u012f\7*\2\2\u012fX\3\2\2\2\u0130\u0131\7+\2\2\u0131Z\3\2\2\2\u0132"+
		"\u0133\7=\2\2\u0133\\\3\2\2\2\u0134\u0135\7.\2\2\u0135^\3\2\2\2\u0136"+
		"\u013a\t\3\2\2\u0137\u0139\t\4\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b`\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0148\3\2\2\2\u0142\u0144\7\60"+
		"\2\2\u0143\u0145\t\5\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0142\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149b\3\2\2\2\u014a\u014e\7$\2\2\u014b\u014d"+
		"\13\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u015b"+
		"\7$\2\2\u0152\u0156\7)\2\2\u0153\u0155\13\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015b\7)\2\2\u015a\u014a\3\2\2\2\u015a"+
		"\u0152\3\2\2\2\u015bd\3\2\2\2\13\2h\u013a\u0140\u0146\u0148\u014e\u0156"+
		"\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}