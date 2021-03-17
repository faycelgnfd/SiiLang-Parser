// Generated from grammair.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammairParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_TYPE=1, FLOAT_TYPE=2, STRING_TYPE=3, IF=4, THEN=5, ELSE=6, DO=7, WHILE=8, 
		SCANCOMPIL=9, PRINTCOMPIL=10, START=11, COMPIL=12, KOMPIL=13, PROGID=14, 
		ID=15, NBR=16, NBRN=17, WS=18, WHATEVER=19, COM=20, COMLIGNES=21, PV=22, 
		VIR=23, PT=24, AFF=25, O_PAR=26, C_PAR=27, O_ACOL=28, F_ACOL=29, INF=30, 
		SUP=31, EGAL=32, DIFF=33, PLUS=34, SUB=35, MUL=36, DIV=37;
	public static final int
		RULE_operande = 0, RULE_comparateur = 1, RULE_operateur = 2, RULE_expression = 3, 
		RULE_comparaison = 4, RULE_affect = 5, RULE_decvar = 6, RULE_dakhel = 7, 
		RULE_si = 8, RULE_tantque = 9, RULE_dakhellecture = 10, RULE_lecture = 11, 
		RULE_dakhelecriture = 12, RULE_ecriture = 13, RULE_instruction = 14, RULE_programme = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"operande", "comparateur", "operateur", "expression", "comparaison", 
			"affect", "decvar", "dakhel", "si", "tantque", "dakhellecture", "lecture", 
			"dakhelecriture", "ecriture", "instruction", "programme"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", 
			"'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'", "'start'", 
			"'compil'", "'kompil'", null, null, null, null, null, null, null, null, 
			"';'", "','", "'.'", "'='", "'('", "')'", "'{'", "'}'", "'<'", "'>'", 
			"'=='", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "IF", "THEN", "ELSE", 
			"DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "START", "COMPIL", "KOMPIL", 
			"PROGID", "ID", "NBR", "NBRN", "WS", "WHATEVER", "COM", "COMLIGNES", 
			"PV", "VIR", "PT", "AFF", "O_PAR", "C_PAR", "O_ACOL", "F_ACOL", "INF", 
			"SUP", "EGAL", "DIFF", "PLUS", "SUB", "MUL", "DIV"
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
	public String getGrammarFileName() { return "grammair.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammairParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperandeContext extends ParserRuleContext {
		public TerminalNode NBR() { return getToken(grammairParser.NBR, 0); }
		public TerminalNode PT() { return getToken(grammairParser.PT, 0); }
		public TerminalNode NBRN() { return getToken(grammairParser.NBRN, 0); }
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public TerminalNode C_PAR() { return getToken(grammairParser.C_PAR, 0); }
		public OperandeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operande; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterOperande(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitOperande(this);
		}
	}

	public final OperandeContext operande() throws RecognitionException {
		OperandeContext _localctx = new OperandeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operande);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(NBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(NBR);
				setState(34);
				match(PT);
				setState(35);
				match(NBRN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(O_PAR);
				setState(38);
				match(NBRN);
				setState(39);
				match(C_PAR);
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
		public TerminalNode INF() { return getToken(grammairParser.INF, 0); }
		public TerminalNode SUP() { return getToken(grammairParser.SUP, 0); }
		public TerminalNode EGAL() { return getToken(grammairParser.EGAL, 0); }
		public TerminalNode DIFF() { return getToken(grammairParser.DIFF, 0); }
		public ComparateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterComparateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitComparateur(this);
		}
	}

	public final ComparateurContext comparateur() throws RecognitionException {
		ComparateurContext _localctx = new ComparateurContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comparateur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EGAL) | (1L << DIFF))) != 0)) ) {
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

	public static class OperateurContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(grammairParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(grammairParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(grammairParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(grammairParser.DIV, 0); }
		public OperateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterOperateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitOperateur(this);
		}
	}

	public final OperateurContext operateur() throws RecognitionException {
		OperateurContext _localctx = new OperateurContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operateur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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
		public OperateurContext operateur() {
			return getRuleContext(OperateurContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			operande();
			setState(47);
			operateur();
			setState(48);
			operande();
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
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterComparaison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitComparaison(this);
		}
	}

	public final ComparaisonContext comparaison() throws RecognitionException {
		ComparaisonContext _localctx = new ComparaisonContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comparaison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			operande();
			setState(51);
			comparateur();
			setState(52);
			operande();
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
		public TerminalNode PV() { return getToken(grammairParser.PV, 0); }
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode AFF() { return getToken(grammairParser.AFF, 0); }
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
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitAffect(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(54);
				match(ID);
				setState(55);
				match(AFF);
				setState(56);
				expression();
				}
				break;
			case 2:
				{
				setState(57);
				match(ID);
				setState(58);
				match(AFF);
				setState(59);
				operande();
				}
				break;
			}
			setState(62);
			match(PV);
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
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode PV() { return getToken(grammairParser.PV, 0); }
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(grammairParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(grammairParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(grammairParser.STRING_TYPE, 0); }
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public DecvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterDecvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitDecvar(this);
		}
	}

	public final DecvarContext decvar() throws RecognitionException {
		DecvarContext _localctx = new DecvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decvar);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(ID);
				setState(66);
				match(PV);
				setState(67);
				decvar();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public DakhelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterDakhel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitDakhel(this);
		}
	}

	public final DakhelContext dakhel() throws RecognitionException {
		DakhelContext _localctx = new DakhelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dakhel);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				expression();
				setState(73);
				dakhel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				affect();
				setState(76);
				dakhel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
		public TerminalNode IF() { return getToken(grammairParser.IF, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(grammairParser.C_PAR, 0); }
		public TerminalNode THEN() { return getToken(grammairParser.THEN, 0); }
		public List<TerminalNode> O_ACOL() { return getTokens(grammairParser.O_ACOL); }
		public TerminalNode O_ACOL(int i) {
			return getToken(grammairParser.O_ACOL, i);
		}
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
		public List<TerminalNode> F_ACOL() { return getTokens(grammairParser.F_ACOL); }
		public TerminalNode F_ACOL(int i) {
			return getToken(grammairParser.F_ACOL, i);
		}
		public TerminalNode ELSE() { return getToken(grammairParser.ELSE, 0); }
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_si);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(IF);
				setState(82);
				match(O_PAR);
				setState(83);
				comparaison();
				setState(84);
				match(C_PAR);
				setState(85);
				match(THEN);
				setState(86);
				match(O_ACOL);
				setState(87);
				dakhel();
				setState(88);
				si();
				setState(89);
				match(F_ACOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(IF);
				setState(92);
				match(O_PAR);
				setState(93);
				comparaison();
				setState(94);
				match(C_PAR);
				setState(95);
				match(THEN);
				setState(96);
				match(O_ACOL);
				setState(97);
				dakhel();
				setState(98);
				si();
				setState(99);
				match(F_ACOL);
				setState(100);
				match(ELSE);
				setState(101);
				match(O_ACOL);
				setState(102);
				dakhel();
				setState(103);
				si();
				setState(104);
				match(F_ACOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
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
		public TerminalNode DO() { return getToken(grammairParser.DO, 0); }
		public TerminalNode O_ACOL() { return getToken(grammairParser.O_ACOL, 0); }
		public DakhelContext dakhel() {
			return getRuleContext(DakhelContext.class,0);
		}
		public TerminalNode F_ACOL() { return getToken(grammairParser.F_ACOL, 0); }
		public TerminalNode WHILE() { return getToken(grammairParser.WHILE, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(grammairParser.C_PAR, 0); }
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public TantqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tantque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitTantque(this);
		}
	}

	public final TantqueContext tantque() throws RecognitionException {
		TantqueContext _localctx = new TantqueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tantque);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(DO);
				setState(110);
				match(O_ACOL);
				setState(111);
				dakhel();
				setState(112);
				match(F_ACOL);
				setState(113);
				match(WHILE);
				setState(114);
				match(O_PAR);
				setState(115);
				comparaison();
				setState(116);
				match(C_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(DO);
				setState(119);
				match(O_ACOL);
				setState(120);
				dakhel();
				setState(121);
				si();
				setState(122);
				match(F_ACOL);
				setState(123);
				match(WHILE);
				setState(124);
				match(O_PAR);
				setState(125);
				comparaison();
				setState(126);
				match(C_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(DO);
				setState(129);
				match(O_ACOL);
				setState(130);
				dakhel();
				setState(131);
				tantque();
				setState(132);
				match(F_ACOL);
				setState(133);
				match(WHILE);
				setState(134);
				match(O_PAR);
				setState(135);
				comparaison();
				setState(136);
				match(C_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
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
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode VIR() { return getToken(grammairParser.VIR, 0); }
		public DakhellectureContext dakhellecture() {
			return getRuleContext(DakhellectureContext.class,0);
		}
		public DakhellectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhellecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterDakhellecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitDakhellecture(this);
		}
	}

	public final DakhellectureContext dakhellecture() throws RecognitionException {
		DakhellectureContext _localctx = new DakhellectureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dakhellecture);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ID);
				setState(142);
				match(VIR);
				setState(143);
				dakhellecture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		public TerminalNode SCANCOMPIL() { return getToken(grammairParser.SCANCOMPIL, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public DakhellectureContext dakhellecture() {
			return getRuleContext(DakhellectureContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(grammairParser.C_PAR, 0); }
		public TerminalNode PV() { return getToken(grammairParser.PV, 0); }
		public LectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterLecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitLecture(this);
		}
	}

	public final LectureContext lecture() throws RecognitionException {
		LectureContext _localctx = new LectureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SCANCOMPIL);
			setState(148);
			match(O_PAR);
			setState(149);
			dakhellecture();
			setState(150);
			match(C_PAR);
			setState(151);
			match(PV);
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
		public TerminalNode WHATEVER() { return getToken(grammairParser.WHATEVER, 0); }
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public DakhelecritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dakhelecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterDakhelecriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitDakhelecriture(this);
		}
	}

	public final DakhelecritureContext dakhelecriture() throws RecognitionException {
		DakhelecritureContext _localctx = new DakhelecritureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dakhelecriture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		public TerminalNode PRINTCOMPIL() { return getToken(grammairParser.PRINTCOMPIL, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public DakhelecritureContext dakhelecriture() {
			return getRuleContext(DakhelecritureContext.class,0);
		}
		public TerminalNode C_PAR() { return getToken(grammairParser.C_PAR, 0); }
		public TerminalNode PV() { return getToken(grammairParser.PV, 0); }
		public EcritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterEcriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitEcriture(this);
		}
	}

	public final EcritureContext ecriture() throws RecognitionException {
		EcritureContext _localctx = new EcritureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(PRINTCOMPIL);
			setState(156);
			match(O_PAR);
			setState(157);
			dakhelecriture();
			setState(158);
			match(C_PAR);
			setState(159);
			match(PV);
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
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruction);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				lecture();
				setState(162);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				ecriture();
				setState(165);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				affect();
				setState(168);
				instruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				si();
				setState(171);
				instruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				tantque();
				setState(174);
				instruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
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
		public TerminalNode KOMPIL() { return getToken(grammairParser.KOMPIL, 0); }
		public TerminalNode PROGID() { return getToken(grammairParser.PROGID, 0); }
		public TerminalNode O_ACOL() { return getToken(grammairParser.O_ACOL, 0); }
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public TerminalNode START() { return getToken(grammairParser.START, 0); }
		public TerminalNode F_ACOL() { return getToken(grammairParser.F_ACOL, 0); }
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(KOMPIL);
			setState(180);
			match(PROGID);
			setState(181);
			match(O_ACOL);
			setState(182);
			decvar();
			setState(183);
			match(START);
			setState(184);
			match(F_ACOL);
			setState(185);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7?\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2 #\3\2$\'"+
		"\3\2\3\5\4\2\21\21\25\25\2\u00c0\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\60"+
		"\3\2\2\2\n\64\3\2\2\2\f>\3\2\2\2\16H\3\2\2\2\20Q\3\2\2\2\22m\3\2\2\2\24"+
		"\u008d\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u009b\3\2\2\2\34\u009d"+
		"\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"+\7\22\2\2#$\7\22\2\2$%\7\32"+
		"\2\2%+\7\23\2\2&+\7\21\2\2\'(\7\34\2\2()\7\23\2\2)+\7\35\2\2*\"\3\2\2"+
		"\2*#\3\2\2\2*&\3\2\2\2*\'\3\2\2\2+\3\3\2\2\2,-\t\2\2\2-\5\3\2\2\2./\t"+
		"\3\2\2/\7\3\2\2\2\60\61\5\2\2\2\61\62\5\6\4\2\62\63\5\2\2\2\63\t\3\2\2"+
		"\2\64\65\5\2\2\2\65\66\5\4\3\2\66\67\5\2\2\2\67\13\3\2\2\289\7\21\2\2"+
		"9:\7\33\2\2:?\5\b\5\2;<\7\21\2\2<=\7\33\2\2=?\5\2\2\2>8\3\2\2\2>;\3\2"+
		"\2\2?@\3\2\2\2@A\7\30\2\2A\r\3\2\2\2BC\t\4\2\2CD\7\21\2\2DE\7\30\2\2E"+
		"I\5\16\b\2FI\3\2\2\2GI\7\2\2\3HB\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\17\3\2\2"+
		"\2JK\5\b\5\2KL\5\20\t\2LR\3\2\2\2MN\5\f\7\2NO\5\20\t\2OR\3\2\2\2PR\7\2"+
		"\2\3QJ\3\2\2\2QM\3\2\2\2QP\3\2\2\2R\21\3\2\2\2ST\7\6\2\2TU\7\34\2\2UV"+
		"\5\n\6\2VW\7\35\2\2WX\7\7\2\2XY\7\36\2\2YZ\5\20\t\2Z[\5\22\n\2[\\\7\37"+
		"\2\2\\n\3\2\2\2]^\7\6\2\2^_\7\34\2\2_`\5\n\6\2`a\7\35\2\2ab\7\7\2\2bc"+
		"\7\36\2\2cd\5\20\t\2de\5\22\n\2ef\7\37\2\2fg\7\b\2\2gh\7\36\2\2hi\5\20"+
		"\t\2ij\5\22\n\2jk\7\37\2\2kn\3\2\2\2ln\7\2\2\3mS\3\2\2\2m]\3\2\2\2ml\3"+
		"\2\2\2n\23\3\2\2\2op\7\t\2\2pq\7\36\2\2qr\5\20\t\2rs\7\37\2\2st\7\n\2"+
		"\2tu\7\34\2\2uv\5\n\6\2vw\7\35\2\2w\u008e\3\2\2\2xy\7\t\2\2yz\7\36\2\2"+
		"z{\5\20\t\2{|\5\22\n\2|}\7\37\2\2}~\7\n\2\2~\177\7\34\2\2\177\u0080\5"+
		"\n\6\2\u0080\u0081\7\35\2\2\u0081\u008e\3\2\2\2\u0082\u0083\7\t\2\2\u0083"+
		"\u0084\7\36\2\2\u0084\u0085\5\20\t\2\u0085\u0086\5\24\13\2\u0086\u0087"+
		"\7\37\2\2\u0087\u0088\7\n\2\2\u0088\u0089\7\34\2\2\u0089\u008a\5\n\6\2"+
		"\u008a\u008b\7\35\2\2\u008b\u008e\3\2\2\2\u008c\u008e\7\2\2\3\u008do\3"+
		"\2\2\2\u008dx\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u008c\3\2\2\2\u008e\25"+
		"\3\2\2\2\u008f\u0090\7\21\2\2\u0090\u0091\7\31\2\2\u0091\u0094\5\26\f"+
		"\2\u0092\u0094\7\21\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u0097\7\34\2\2\u0097\u0098\5\26"+
		"\f\2\u0098\u0099\7\35\2\2\u0099\u009a\7\30\2\2\u009a\31\3\2\2\2\u009b"+
		"\u009c\t\5\2\2\u009c\33\3\2\2\2\u009d\u009e\7\f\2\2\u009e\u009f\7\34\2"+
		"\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\7\30\2\2\u00a2"+
		"\35\3\2\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\5\36\20\2\u00a5\u00b4\3\2"+
		"\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\5\36\20\2\u00a8\u00b4\3\2\2\2\u00a9"+
		"\u00aa\5\f\7\2\u00aa\u00ab\5\36\20\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\5"+
		"\22\n\2\u00ad\u00ae\5\36\20\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\5\24\13"+
		"\2\u00b0\u00b1\5\36\20\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\7\2\2\3\u00b3"+
		"\u00a3\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ac\3\2"+
		"\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6"+
		"\7\17\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\5\16\b"+
		"\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\7\2\2\3\u00bc"+
		"!\3\2\2\2\n*>HQm\u008d\u0093\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}