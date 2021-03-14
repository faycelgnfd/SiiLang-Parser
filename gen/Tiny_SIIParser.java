// Generated from C:/Users/Dell/OneDrive/Bureau/LKSC/USTHB/S7/Compile/Projet/SiiLang-Parser/src\Tiny_SII.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tiny_SIIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PROGID=13, ID=14, OPERATEUR=15, WS=16, WHATEVER=17, 
		NBR=18, COM=19, COMLIGNES=20, Start=21, Compil=22, IntCompil=23, FloatCompil=24, 
		StringCompil=25, If=26, Then=27, Else=28, Do=29, While=30, ScanCompile=31, 
		PrintCompil=32;
	public static final int
		RULE_operande = 0, RULE_comparateur = 1, RULE_expression = 2, RULE_comparaison = 3, 
		RULE_affect = 4, RULE_decvar = 5, RULE_dakhel = 6, RULE_si = 7, RULE_tantque = 8, 
		RULE_dakhellecture = 9, RULE_lecture = 10, RULE_dakhelecriture = 11, RULE_ecriture = 12, 
		RULE_instruction = 13, RULE_programme = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"operande", "comparateur", "expression", "comparaison", "affect", "decvar", 
			"dakhel", "si", "tantque", "dakhellecture", "lecture", "dakhelecriture", 
			"ecriture", "instruction", "programme"
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
			null, "PROGID", "ID", "OPERATEUR", "WS", "WHATEVER", "NBR", "COM", "COMLIGNES", 
			"Start", "Compil", "IntCompil", "FloatCompil", "StringCompil", "If", 
			"Then", "Else", "Do", "While", "ScanCompile", "PrintCompil"
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

	@Override
	public String getGrammarFileName() { return "Tiny_SII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tiny_SIIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperandeContext extends ParserRuleContext {
		public List<TerminalNode> NBR() { return getTokens(Tiny_SIIParser.NBR); }
		public TerminalNode NBR(int i) {
			return getToken(Tiny_SIIParser.NBR, i);
		}
		public TerminalNode ID() { return getToken(Tiny_SIIParser.ID, 0); }
		public OperandeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operande; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterOperande(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitOperande(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitOperande(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandeContext operande() throws RecognitionException {
		OperandeContext _localctx = new OperandeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operande);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(NBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(NBR);
				setState(32);
				match(T__0);
				setState(33);
				match(NBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparateurContext extends ParserRuleContext {
		public ComparateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterComparateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitComparateur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitComparateur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparateurContext comparateur() throws RecognitionException {
		ComparateurContext _localctx = new ComparateurContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comparateur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<OperandeContext> operande() {
			return getRuleContexts(OperandeContext.class);
		}
		public OperandeContext operande(int i) {
			return getRuleContext(OperandeContext.class,i);
		}
		public TerminalNode OPERATEUR() { return getToken(Tiny_SIIParser.OPERATEUR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			operande();
			setState(40);
			match(OPERATEUR);
			setState(41);
			operande();
			setState(42);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparaisonContext extends ParserRuleContext {
		public List<OperandeContext> operande() {
			return getRuleContexts(OperandeContext.class);
		}
		public OperandeContext operande(int i) {
			return getRuleContext(OperandeContext.class,i);
		}
		public ComparateurContext comparateur() {
			return getRuleContext(ComparateurContext.class,0);
		}
		public ComparaisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparaison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterComparaison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitComparaison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitComparaison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparaisonContext comparaison() throws RecognitionException {
		ComparaisonContext _localctx = new ComparaisonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparaison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			operande();
			setState(45);
			comparateur();
			setState(46);
			operande();
			setState(47);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Tiny_SIIParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_affect);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(ID);
				setState(50);
				match(T__6);
				setState(51);
				expression();
				setState(52);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ID);
				setState(55);
				match(T__6);
				setState(56);
				operande();
				setState(57);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecvarContext extends ParserRuleContext {
		public TerminalNode IntCompil() { return getToken(Tiny_SIIParser.IntCompil, 0); }
		public TerminalNode ID() { return getToken(Tiny_SIIParser.ID, 0); }
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public TerminalNode FloatCompil() { return getToken(Tiny_SIIParser.FloatCompil, 0); }
		public TerminalNode StringCompil() { return getToken(Tiny_SIIParser.StringCompil, 0); }
		public TerminalNode EOF() { return getToken(Tiny_SIIParser.EOF, 0); }
		public DecvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterDecvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitDecvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitDecvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvarContext decvar() throws RecognitionException {
		DecvarContext _localctx = new DecvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decvar);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntCompil:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(IntCompil);
				setState(62);
				match(ID);
				setState(63);
				match(T__5);
				setState(64);
				decvar();
				}
				break;
			case FloatCompil:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(FloatCompil);
				setState(66);
				match(ID);
				setState(67);
				match(T__5);
				setState(68);
				decvar();
				}
				break;
			case StringCompil:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(StringCompil);
				setState(70);
				match(ID);
				setState(71);
				match(T__5);
				setState(72);
				decvar();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DakhelContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DakhelContext dakhel() {
			return getRuleContext(DakhelContext.class,0);
		}
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Tiny_SIIParser.EOF, 0); }
		public DakhelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterDakhel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitDakhel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitDakhel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DakhelContext dakhel() throws RecognitionException {
		DakhelContext _localctx = new DakhelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dakhel);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				expression();
				setState(77);
				dakhel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				affect();
				setState(80);
				dakhel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(Tiny_SIIParser.If, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public TerminalNode Then() { return getToken(Tiny_SIIParser.Then, 0); }
		public List<DakhelContext> dakhel() {
			return getRuleContexts(DakhelContext.class);
		}
		public DakhelContext dakhel(int i) {
			return getRuleContext(DakhelContext.class,i);
		}
		public List<SiContext> si() {
			return getRuleContexts(SiContext.class);
		}
		public SiContext si(int i) {
			return getRuleContext(SiContext.class,i);
		}
		public TerminalNode Else() { return getToken(Tiny_SIIParser.Else, 0); }
		public TerminalNode EOF() { return getToken(Tiny_SIIParser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_si);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(If);
				setState(86);
				match(T__7);
				setState(87);
				comparaison();
				setState(88);
				match(T__8);
				setState(89);
				match(Then);
				setState(90);
				match(T__9);
				setState(91);
				dakhel();
				setState(92);
				si();
				setState(93);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(If);
				setState(96);
				match(T__7);
				setState(97);
				comparaison();
				setState(98);
				match(T__8);
				setState(99);
				match(Then);
				setState(100);
				match(T__9);
				setState(101);
				dakhel();
				setState(102);
				si();
				setState(103);
				match(T__10);
				setState(104);
				match(Else);
				setState(105);
				match(T__9);
				setState(106);
				dakhel();
				setState(107);
				si();
				setState(108);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TantqueContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(Tiny_SIIParser.Do, 0); }
		public DakhelContext dakhel() {
			return getRuleContext(DakhelContext.class,0);
		}
		public TerminalNode While() { return getToken(Tiny_SIIParser.While, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Tiny_SIIParser.EOF, 0); }
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitTantque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitTantque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tantque);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(Do);
				setState(114);
				match(T__9);
				setState(115);
				dakhel();
				setState(116);
				match(T__10);
				setState(117);
				match(While);
				setState(118);
				match(T__7);
				setState(119);
				comparaison();
				setState(120);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(Do);
				setState(123);
				match(T__9);
				setState(124);
				dakhel();
				setState(125);
				si();
				setState(126);
				match(T__10);
				setState(127);
				match(While);
				setState(128);
				match(T__7);
				setState(129);
				comparaison();
				setState(130);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(Do);
				setState(133);
				match(T__9);
				setState(134);
				dakhel();
				setState(135);
				tantque();
				setState(136);
				match(T__10);
				setState(137);
				match(While);
				setState(138);
				match(T__7);
				setState(139);
				comparaison();
				setState(140);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DakhellectureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Tiny_SIIParser.ID, 0); }
		public DakhellectureContext dakhellecture() {
			return getRuleContext(DakhellectureContext.class,0);
		}
		public DakhellectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhellecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterDakhellecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitDakhellecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitDakhellecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DakhellectureContext dakhellecture() throws RecognitionException {
		DakhellectureContext _localctx = new DakhellectureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dakhellecture);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__11);
				setState(147);
				dakhellecture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LectureContext extends ParserRuleContext {
		public TerminalNode ScanCompile() { return getToken(Tiny_SIIParser.ScanCompile, 0); }
		public DakhellectureContext dakhellecture() {
			return getRuleContext(DakhellectureContext.class,0);
		}
		public LectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterLecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitLecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitLecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LectureContext lecture() throws RecognitionException {
		LectureContext _localctx = new LectureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ScanCompile);
			setState(152);
			match(T__7);
			setState(153);
			dakhellecture();
			setState(154);
			match(T__8);
			setState(155);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DakhelecritureContext extends ParserRuleContext {
		public TerminalNode WHATEVER() { return getToken(Tiny_SIIParser.WHATEVER, 0); }
		public TerminalNode ID() { return getToken(Tiny_SIIParser.ID, 0); }
		public DakhelecritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhelecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterDakhelecriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitDakhelecriture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitDakhelecriture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DakhelecritureContext dakhelecriture() throws RecognitionException {
		DakhelecritureContext _localctx = new DakhelecritureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dakhelecriture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==WHATEVER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EcritureContext extends ParserRuleContext {
		public TerminalNode PrintCompil() { return getToken(Tiny_SIIParser.PrintCompil, 0); }
		public DakhelecritureContext dakhelecriture() {
			return getRuleContext(DakhelecritureContext.class,0);
		}
		public EcritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterEcriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitEcriture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitEcriture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcritureContext ecriture() throws RecognitionException {
		EcritureContext _localctx = new EcritureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(PrintCompil);
			setState(160);
			match(T__7);
			setState(161);
			dakhelecriture();
			setState(162);
			match(T__8);
			setState(163);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public LectureContext lecture() {
			return getRuleContext(LectureContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public EcritureContext ecriture() {
			return getRuleContext(EcritureContext.class,0);
		}
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Tiny_SIIParser.EOF, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruction);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				lecture();
				setState(166);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				ecriture();
				setState(169);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				affect();
				setState(172);
				instruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				si();
				setState(175);
				instruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				tantque();
				setState(178);
				instruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode Compil() { return getToken(Tiny_SIIParser.Compil, 0); }
		public TerminalNode PROGID() { return getToken(Tiny_SIIParser.PROGID, 0); }
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public TerminalNode Start() { return getToken(Tiny_SIIParser.Start, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tiny_SIIListener ) ((Tiny_SIIListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tiny_SIIVisitor ) return ((Tiny_SIIVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Compil);
			setState(184);
			match(PROGID);
			setState(185);
			match(T__9);
			setState(186);
			decvar();
			setState(187);
			match(Start);
			setState(188);
			instruction();
			setState(189);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\5\2&\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3\13\3\13\5\13\u0098\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2\4\7\4\2\20\20\23\23\2"+
		"\u00c5\2%\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b.\3\2\2\2\n=\3\2\2\2\fL\3\2"+
		"\2\2\16U\3\2\2\2\20q\3\2\2\2\22\u0091\3\2\2\2\24\u0097\3\2\2\2\26\u0099"+
		"\3\2\2\2\30\u009f\3\2\2\2\32\u00a1\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3"+
		"\2\2\2 &\7\24\2\2!\"\7\24\2\2\"#\7\3\2\2#&\7\24\2\2$&\7\20\2\2% \3\2\2"+
		"\2%!\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'(\t\2\2\2(\5\3\2\2\2)*\5\2\2\2*+\7"+
		"\21\2\2+,\5\2\2\2,-\7\b\2\2-\7\3\2\2\2./\5\2\2\2/\60\5\4\3\2\60\61\5\2"+
		"\2\2\61\62\7\b\2\2\62\t\3\2\2\2\63\64\7\20\2\2\64\65\7\t\2\2\65\66\5\6"+
		"\4\2\66\67\7\b\2\2\67>\3\2\2\289\7\20\2\29:\7\t\2\2:;\5\2\2\2;<\7\b\2"+
		"\2<>\3\2\2\2=\63\3\2\2\2=8\3\2\2\2>\13\3\2\2\2?@\7\31\2\2@A\7\20\2\2A"+
		"B\7\b\2\2BM\5\f\7\2CD\7\32\2\2DE\7\20\2\2EF\7\b\2\2FM\5\f\7\2GH\7\33\2"+
		"\2HI\7\20\2\2IJ\7\b\2\2JM\5\f\7\2KM\7\2\2\3L?\3\2\2\2LC\3\2\2\2LG\3\2"+
		"\2\2LK\3\2\2\2M\r\3\2\2\2NO\5\6\4\2OP\5\16\b\2PV\3\2\2\2QR\5\n\6\2RS\5"+
		"\16\b\2SV\3\2\2\2TV\7\2\2\3UN\3\2\2\2UQ\3\2\2\2UT\3\2\2\2V\17\3\2\2\2"+
		"WX\7\34\2\2XY\7\n\2\2YZ\5\b\5\2Z[\7\13\2\2[\\\7\35\2\2\\]\7\f\2\2]^\5"+
		"\16\b\2^_\5\20\t\2_`\7\r\2\2`r\3\2\2\2ab\7\34\2\2bc\7\n\2\2cd\5\b\5\2"+
		"de\7\13\2\2ef\7\35\2\2fg\7\f\2\2gh\5\16\b\2hi\5\20\t\2ij\7\r\2\2jk\7\36"+
		"\2\2kl\7\f\2\2lm\5\16\b\2mn\5\20\t\2no\7\r\2\2or\3\2\2\2pr\7\2\2\3qW\3"+
		"\2\2\2qa\3\2\2\2qp\3\2\2\2r\21\3\2\2\2st\7\37\2\2tu\7\f\2\2uv\5\16\b\2"+
		"vw\7\r\2\2wx\7 \2\2xy\7\n\2\2yz\5\b\5\2z{\7\13\2\2{\u0092\3\2\2\2|}\7"+
		"\37\2\2}~\7\f\2\2~\177\5\16\b\2\177\u0080\5\20\t\2\u0080\u0081\7\r\2\2"+
		"\u0081\u0082\7 \2\2\u0082\u0083\7\n\2\2\u0083\u0084\5\b\5\2\u0084\u0085"+
		"\7\13\2\2\u0085\u0092\3\2\2\2\u0086\u0087\7\37\2\2\u0087\u0088\7\f\2\2"+
		"\u0088\u0089\5\16\b\2\u0089\u008a\5\22\n\2\u008a\u008b\7\r\2\2\u008b\u008c"+
		"\7 \2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\13\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u0092\7\2\2\3\u0091s\3\2\2\2\u0091|\3\2\2\2\u0091"+
		"\u0086\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0094\7\20\2"+
		"\2\u0094\u0095\7\16\2\2\u0095\u0098\5\24\13\2\u0096\u0098\7\20\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7!\2\2"+
		"\u009a\u009b\7\n\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\13\2\2\u009d"+
		"\u009e\7\b\2\2\u009e\27\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0\31\3\2\2\2\u00a1"+
		"\u00a2\7\"\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7"+
		"\13\2\2\u00a5\u00a6\7\b\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8"+
		"\u00a9\5\34\17\2\u00a9\u00b8\3\2\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ac"+
		"\5\34\17\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00af\5\34\17"+
		"\2\u00af\u00b8\3\2\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\5\34\17\2\u00b2"+
		"\u00b8\3\2\2\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\5\34\17\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b8\7\2\2\3\u00b7\u00a7\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b7"+
		"\u00ad\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bb\7\17\2\2\u00bb"+
		"\u00bc\7\f\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\27\2\2\u00be\u00bf\5"+
		"\34\17\2\u00bf\u00c0\7\r\2\2\u00c0\37\3\2\2\2\n%=LUq\u0091\u0097\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}