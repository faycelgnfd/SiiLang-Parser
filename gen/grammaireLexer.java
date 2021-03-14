// Generated from C:/Users/Dell/IdeaProjects/Tiny_SII/src\grammaire.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammaireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PROGID=14, ID=15, OPERATEUR=16, 
		WS=17, WHATEVER=18, NBR=19, COM=20, COMLIGNES=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "PROGID", "ID", "OPERATEUR", "WS", 
			"WHATEVER", "NBR", "COM", "COMLIGNES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'<'", "'>'", "'=='", "'!='", "';'", "'='", "'('", "')'", 
			"'{'", "'}'", "','", "'Compil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PROGID", "ID", "OPERATEUR", "WS", "WHATEVER", "NBR", "COM", 
			"COMLIGNES"
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


	public grammaireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammaire.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17P\n\17\r\17\16\17Q"+
		"\3\20\3\20\7\20V\n\20\f\20\16\20Y\13\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\7\23b\n\23\f\23\16\23e\13\23\3\24\6\24h\n\24\r\24\16\24i\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27\3\2\t\3\2C\\\4\2C\\c|\5\2\62;C\\c|\5\2"+
		",-//\61\61\3\2\13\f\3\2\60\60\3\2\62;\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13"+
		"\66\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2"+
		"\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35O\3\2\2\2\37S\3\2\2\2!Z\3\2\2\2"+
		"#\\\3\2\2\2%c\3\2\2\2\'g\3\2\2\2)k\3\2\2\2+q\3\2\2\2-.\7\60\2\2.\4\3\2"+
		"\2\2/\60\7>\2\2\60\6\3\2\2\2\61\62\7@\2\2\62\b\3\2\2\2\63\64\7?\2\2\64"+
		"\65\7?\2\2\65\n\3\2\2\2\66\67\7#\2\2\678\7?\2\28\f\3\2\2\29:\7=\2\2:\16"+
		"\3\2\2\2;<\7?\2\2<\20\3\2\2\2=>\7*\2\2>\22\3\2\2\2?@\7+\2\2@\24\3\2\2"+
		"\2AB\7}\2\2B\26\3\2\2\2CD\7\177\2\2D\30\3\2\2\2EF\7.\2\2F\32\3\2\2\2G"+
		"H\7E\2\2HI\7q\2\2IJ\7o\2\2JK\7r\2\2KL\7k\2\2LM\7n\2\2M\34\3\2\2\2NP\t"+
		"\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\36\3\2\2\2SW\t\3\2\2T"+
		"V\t\4\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2\2YW\3\2\2\2"+
		"Z[\t\5\2\2[\"\3\2\2\2\\]\t\6\2\2]^\3\2\2\2^_\b\22\2\2_$\3\2\2\2`b\t\7"+
		"\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d&\3\2\2\2ec\3\2\2\2fh\t\b"+
		"\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j(\3\2\2\2kl\7\61\2\2lm\7"+
		"\61\2\2mn\5%\23\2no\3\2\2\2op\b\25\2\2p*\3\2\2\2qr\7\61\2\2rs\7,\2\2s"+
		"t\5%\23\2tu\7,\2\2uv\7\61\2\2vw\3\2\2\2wx\b\26\2\2x,\3\2\2\2\7\2QWci\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}