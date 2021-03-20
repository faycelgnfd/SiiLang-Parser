// Generated from grammair.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammairLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TYPE=1, FLOAT_TYPE=2, STRING_TYPE=3, IF=4, THEN=5, ELSE=6, DO=7, WHILE=8, 
		SCANCOMPIL=9, PRINTCOMPIL=10, START=11, COMPIL=12, COM=13, COMLIGNES=14, 
		PROGID=15, ID=16, STRING=17, NBR=18, NBRN=19, WS=20, PV=21, VIR=22, PT=23, 
		AFF=24, O_PAR=25, F_PAR=26, O_ACOL=27, F_ACOL=28, INF=29, SUP=30, EGAL=31, 
		DIFF=32, PLUS=33, SUB=34, MUL=35, DIV=36, DBQUOTE=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "IF", "THEN", "ELSE", "DO", 
			"WHILE", "SCANCOMPIL", "PRINTCOMPIL", "START", "COMPIL", "COM", "COMLIGNES", 
			"PROGID", "ID", "STRING", "NBR", "NBRN", "WS", "PV", "VIR", "PT", "AFF", 
			"O_PAR", "F_PAR", "O_ACOL", "F_ACOL", "INF", "SUP", "EGAL", "DIFF", "PLUS", 
			"SUB", "MUL", "DIV", "DBQUOTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", 
			"'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'", "'start'", 
			"'compil'", null, null, null, null, null, null, null, null, "';'", "','", 
			"'.'", "'='", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'=='", "'!='", 
			"'+'", "'-'", "'*'", "'/'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "IF", "THEN", "ELSE", 
			"DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "START", "COMPIL", "COM", 
			"COMLIGNES", "PROGID", "ID", "STRING", "NBR", "NBRN", "WS", "PV", "VIR", 
			"PT", "AFF", "O_PAR", "F_PAR", "O_ACOL", "F_ACOL", "INF", "SUP", "EGAL", 
			"DIFF", "PLUS", "SUB", "MUL", "DIV", "DBQUOTE"
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


	public grammairLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammair.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u00af\n\16\f\16\16\16\u00b2\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\6\20\u00c5\n\20\r\20\16\20\u00c6\3\21\3\21\7\21\u00cb"+
		"\n\21\f\21\16\21\u00ce\13\21\3\22\3\22\3\22\3\22\7\22\u00d4\n\22\f\22"+
		"\16\22\u00d7\13\22\3\22\3\22\3\23\6\23\u00dc\n\23\r\23\16\23\u00dd\3\24"+
		"\3\24\6\24\u00e2\n\24\r\24\16\24\u00e3\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\u00bb\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\n\4\2\f\f\17\17\3\2C\\\4\2C\\c|\5\2"+
		"\62;C\\c|\5\2\f\f\17\17$$\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2\u0114\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5W\3\2\2\2\7c\3\2\2\2\tp\3\2\2\2\13"+
		"s\3\2\2\2\rx\3\2\2\2\17}\3\2\2\2\21\u0080\3\2\2\2\23\u0086\3\2\2\2\25"+
		"\u0091\3\2\2\2\27\u009d\3\2\2\2\31\u00a3\3\2\2\2\33\u00aa\3\2\2\2\35\u00b5"+
		"\3\2\2\2\37\u00c4\3\2\2\2!\u00c8\3\2\2\2#\u00cf\3\2\2\2%\u00db\3\2\2\2"+
		"\'\u00df\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00eb\3\2\2\2/\u00ed\3"+
		"\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2\2\65\u00f3\3\2\2\2\67\u00f5\3\2"+
		"\2\29\u00f7\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u0100"+
		"\3\2\2\2C\u0103\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K"+
		"\u010b\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7E\2\2QR\7q\2\2RS\7o\2\2S"+
		"T\7r\2\2TU\7k\2\2UV\7n\2\2V\4\3\2\2\2WX\7h\2\2XY\7n\2\2YZ\7q\2\2Z[\7c"+
		"\2\2[\\\7v\2\2\\]\7E\2\2]^\7q\2\2^_\7o\2\2_`\7r\2\2`a\7k\2\2ab\7n\2\2"+
		"b\6\3\2\2\2cd\7u\2\2de\7v\2\2ef\7t\2\2fg\7k\2\2gh\7p\2\2hi\7i\2\2ij\7"+
		"E\2\2jk\7q\2\2kl\7o\2\2lm\7r\2\2mn\7k\2\2no\7n\2\2o\b\3\2\2\2pq\7k\2\2"+
		"qr\7h\2\2r\n\3\2\2\2st\7v\2\2tu\7j\2\2uv\7g\2\2vw\7p\2\2w\f\3\2\2\2xy"+
		"\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\16\3\2\2\2}~\7f\2\2~\177\7q\2\2\177"+
		"\20\3\2\2\2\u0080\u0081\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\22\3\2\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a\7p\2\2\u008a\u008b\7E\2\2"+
		"\u008b\u008c\7q\2\2\u008c\u008d\7o\2\2\u008d\u008e\7r\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7n\2\2\u0090\24\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7E\2\2\u0097\u0098\7q\2\2\u0098\u0099\7o\2\2\u0099\u009a\7r\2\2"+
		"\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\26\3\2\2\2\u009d\u009e\7"+
		"u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7o\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\32\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00b0\3\2"+
		"\2\2\u00ad\u00af\n\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\b\16\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6"+
		"\u00b7\7,\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\u00c0\7\61"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\17\2\2\u00c2\36\3\2\2\2\u00c3\u00c5"+
		"\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7 \3\2\2\2\u00c8\u00cc\t\4\2\2\u00c9\u00cb\t\5\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d5\7$\2\2\u00d0"+
		"\u00d4\n\6\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d4\7$\2\2\u00d3\u00d0\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9"+
		"$\3\2\2\2\u00da\u00dc\t\7\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de&\3\2\2\2\u00df\u00e1\7"+
		"/\2\2\u00e0\u00e2\t\b\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4(\3\2\2\2\u00e5\u00e6\t\t\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\25\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7"+
		"=\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7.\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7\60"+
		"\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0\62\3\2\2\2\u00f1\u00f2"+
		"\7*\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\66\3\2\2\2\u00f5\u00f6"+
		"\7}\2\2\u00f68\3\2\2\2\u00f7\u00f8\7\177\2\2\u00f8:\3\2\2\2\u00f9\u00fa"+
		"\7>\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7@\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7"+
		"?\2\2\u00fe\u00ff\7?\2\2\u00ff@\3\2\2\2\u0100\u0101\7#\2\2\u0101\u0102"+
		"\7?\2\2\u0102B\3\2\2\2\u0103\u0104\7-\2\2\u0104D\3\2\2\2\u0105\u0106\7"+
		"/\2\2\u0106F\3\2\2\2\u0107\u0108\7,\2\2\u0108H\3\2\2\2\u0109\u010a\7\61"+
		"\2\2\u010aJ\3\2\2\2\u010b\u010c\7$\2\2\u010cL\3\2\2\2\13\2\u00b0\u00bb"+
		"\u00c6\u00cc\u00d3\u00d5\u00dd\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}