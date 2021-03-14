// Generated from C:/Users/Dell/OneDrive/Bureau/LKSC/USTHB/S7/Compile/Projet/SiiLang-Parser/src\Tiny_SII.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tiny_SIILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PROGID=13, ID=14, OPERATEUR=15, WS=16, WHATEVER=17, 
		NBR=18, COM=19, COMLIGNES=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "PROGID", "ID", "OPERATEUR", "WS", "WHATEVER", 
			"NBR", "COM", "COMLIGNES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'<'", "'>'", "'=='", "'!='", "';'", "'='", "'('", "')'", 
			"'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PROGID", "ID", "OPERATEUR", "WS", "WHATEVER", "NBR", "COM", "COMLIGNES"
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


	public Tiny_SIILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiny_SII.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\6\16G\n\16\r\16\16\16H\3\17\3\17\7\17M\n\17\f\17\16\17P\13\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\7\22Y\n\22\f\22\16\22\\\13\22\3\23\6\23_"+
		"\n\23\r\23\16\23`\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\3\2C\\\4\2"+
		"C\\c|\5\2\62;C\\c|\5\2,-//\61\61\3\2\13\f\3\2\60\60\3\2\62;\2s\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3"+
		"\2\2\2\13\64\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2"+
		"\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35J\3\2\2\2\37Q\3\2\2"+
		"\2!S\3\2\2\2#Z\3\2\2\2%^\3\2\2\2\'b\3\2\2\2)h\3\2\2\2+,\7\60\2\2,\4\3"+
		"\2\2\2-.\7>\2\2.\6\3\2\2\2/\60\7@\2\2\60\b\3\2\2\2\61\62\7?\2\2\62\63"+
		"\7?\2\2\63\n\3\2\2\2\64\65\7#\2\2\65\66\7?\2\2\66\f\3\2\2\2\678\7=\2\2"+
		"8\16\3\2\2\29:\7?\2\2:\20\3\2\2\2;<\7*\2\2<\22\3\2\2\2=>\7+\2\2>\24\3"+
		"\2\2\2?@\7}\2\2@\26\3\2\2\2AB\7\177\2\2B\30\3\2\2\2CD\7.\2\2D\32\3\2\2"+
		"\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\34\3\2\2\2JN\t\3"+
		"\2\2KM\t\4\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\36\3\2\2\2PN\3"+
		"\2\2\2QR\t\5\2\2R \3\2\2\2ST\t\6\2\2TU\3\2\2\2UV\b\21\2\2V\"\3\2\2\2W"+
		"Y\t\7\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[$\3\2\2\2\\Z\3\2\2"+
		"\2]_\t\b\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a&\3\2\2\2bc\7\61"+
		"\2\2cd\7\61\2\2de\5#\22\2ef\3\2\2\2fg\b\24\2\2g(\3\2\2\2hi\7\61\2\2ij"+
		"\7,\2\2jk\5#\22\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b\25\2\2o*\3\2\2\2\7"+
		"\2HNZ`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}