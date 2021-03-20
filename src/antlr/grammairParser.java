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
		SCANCOMPIL=9, PRINTCOMPIL=10, START=11, COMPIL=12, COM=13, COMLIGNES=14, 
		PROGID=15, ID=16, NBR=17, NBRN=18, WS=19, WHATEVER=20, PV=21, VIR=22, 
		PT=23, AFF=24, O_PAR=25, F_PAR=26, O_ACOL=27, F_ACOL=28, INF=29, SUP=30, 
		EGAL=31, DIFF=32, PLUS=33, SUB=34, MUL=35, DIV=36;
	public static final int
		RULE_operande = 0, RULE_comparateur = 1, RULE_operateur = 2, RULE_expression = 3, 
		RULE_comparaison = 4, RULE_affect = 5, RULE_decvar = 6, RULE_inside = 7, 
		RULE_sinon = 8, RULE_si = 9, RULE_tantque = 10, RULE_dakhellecture = 11, 
		RULE_lecture = 12, RULE_dakhelecriture = 13, RULE_ecriture = 14, RULE_instruction = 15, 
		RULE_programme = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"operande", "comparateur", "operateur", "expression", "comparaison", 
			"affect", "decvar", "inside", "sinon", "si", "tantque", "dakhellecture", 
			"lecture", "dakhelecriture", "ecriture", "instruction", "programme"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'intCompil'", "'floatCompil'", "'stringCompil'", "'if'", "'then'", 
			"'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'", "'start'", 
			"'compil'", null, null, null, null, null, null, null, null, "';'", "','", 
			"'.'", "'='", "'('", "')'", "'{'", "'}'", "'<'", "'>'", "'=='", "'!='", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "IF", "THEN", "ELSE", 
			"DO", "WHILE", "SCANCOMPIL", "PRINTCOMPIL", "START", "COMPIL", "COM", 
			"COMLIGNES", "PROGID", "ID", "NBR", "NBRN", "WS", "WHATEVER", "PV", "VIR", 
			"PT", "AFF", "O_PAR", "F_PAR", "O_ACOL", "F_ACOL", "INF", "SUP", "EGAL", 
			"DIFF", "PLUS", "SUB", "MUL", "DIV"
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
		public TerminalNode F_PAR() { return getToken(grammairParser.F_PAR, 0); }
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(NBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(NBR);
				setState(36);
				match(PT);
				setState(37);
				match(NBRN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(O_PAR);
				setState(40);
				match(NBRN);
				setState(41);
				match(F_PAR);
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
			setState(44);
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
			setState(46);
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
			setState(48);
			operande();
			setState(49);
			operateur();
			setState(50);
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
			setState(52);
			operande();
			setState(53);
			comparateur();
			setState(54);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				match(ID);
				setState(57);
				match(AFF);
				setState(58);
				expression();
				}
				break;
			case 2:
				{
				setState(59);
				match(ID);
				setState(60);
				match(AFF);
				setState(61);
				operande();
				}
				break;
			}
			setState(64);
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				match(ID);
				setState(68);
				match(PV);
				setState(69);
				decvar();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InsideContext extends ParserRuleContext {
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TerminalNode EOF() { return getToken(grammairParser.EOF, 0); }
		public InsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitInside(this);
		}
	}

	public final InsideContext inside() throws RecognitionException {
		InsideContext _localctx = new InsideContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inside);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				affect();
				setState(74);
				inside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				si();
				setState(77);
				inside();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(EOF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class SinonContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(grammairParser.ELSE, 0); }
		public TerminalNode O_ACOL() { return getToken(grammairParser.O_ACOL, 0); }
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public TerminalNode F_ACOL() { return getToken(grammairParser.F_ACOL, 0); }
		public SinonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitSinon(this);
		}
	}

	public final SinonContext sinon() throws RecognitionException {
		SinonContext _localctx = new SinonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sinon);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ELSE);
				setState(84);
				match(O_ACOL);
				setState(85);
				inside();
				setState(86);
				match(F_ACOL);
				}
				break;
			case EOF:
			case IF:
			case DO:
			case SCANCOMPIL:
			case PRINTCOMPIL:
			case ID:
			case F_ACOL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammairParser.IF, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(grammairParser.F_PAR, 0); }
		public TerminalNode THEN() { return getToken(grammairParser.THEN, 0); }
		public TerminalNode O_ACOL() { return getToken(grammairParser.O_ACOL, 0); }
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public TerminalNode F_ACOL() { return getToken(grammairParser.F_ACOL, 0); }
		public SinonContext sinon() {
			return getRuleContext(SinonContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF);
			setState(92);
			match(O_PAR);
			setState(93);
			comparaison();
			setState(94);
			match(F_PAR);
			setState(95);
			match(THEN);
			setState(96);
			match(O_ACOL);
			setState(97);
			inside();
			setState(98);
			match(F_ACOL);
			setState(99);
			sinon();
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
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public TerminalNode F_ACOL() { return getToken(grammairParser.F_ACOL, 0); }
		public TerminalNode WHILE() { return getToken(grammairParser.WHILE, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public ComparaisonContext comparaison() {
			return getRuleContext(ComparaisonContext.class,0);
		}
		public TerminalNode F_PAR() { return getToken(grammairParser.F_PAR, 0); }
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
		enterRule(_localctx, 20, RULE_tantque);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(DO);
				setState(102);
				match(O_ACOL);
				setState(103);
				inside();
				setState(104);
				match(F_ACOL);
				setState(105);
				match(WHILE);
				setState(106);
				match(O_PAR);
				setState(107);
				comparaison();
				setState(108);
				match(F_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(DO);
				setState(111);
				match(O_ACOL);
				setState(112);
				inside();
				setState(113);
				si();
				setState(114);
				match(F_ACOL);
				setState(115);
				match(WHILE);
				setState(116);
				match(O_PAR);
				setState(117);
				comparaison();
				setState(118);
				match(F_PAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(DO);
				setState(121);
				match(O_ACOL);
				setState(122);
				inside();
				setState(123);
				tantque();
				setState(124);
				match(F_ACOL);
				setState(125);
				match(WHILE);
				setState(126);
				match(O_PAR);
				setState(127);
				comparaison();
				setState(128);
				match(F_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
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
		enterRule(_localctx, 22, RULE_dakhellecture);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ID);
				setState(134);
				match(VIR);
				setState(135);
				dakhellecture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
		public TerminalNode F_PAR() { return getToken(grammairParser.F_PAR, 0); }
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
		enterRule(_localctx, 24, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SCANCOMPIL);
			setState(140);
			match(O_PAR);
			setState(141);
			dakhellecture();
			setState(142);
			match(F_PAR);
			setState(143);
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
		enterRule(_localctx, 26, RULE_dakhelecriture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public TerminalNode F_PAR() { return getToken(grammairParser.F_PAR, 0); }
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
		enterRule(_localctx, 28, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PRINTCOMPIL);
			setState(148);
			match(O_PAR);
			setState(149);
			dakhelecriture();
			setState(150);
			match(F_PAR);
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
		enterRule(_localctx, 30, RULE_instruction);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				lecture();
				setState(154);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				ecriture();
				setState(157);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				affect();
				setState(160);
				instruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				si();
				setState(163);
				instruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				tantque();
				setState(166);
				instruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
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
		public TerminalNode COMPIL() { return getToken(grammairParser.COMPIL, 0); }
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
		enterRule(_localctx, 32, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(COMPIL);
			setState(172);
			match(PROGID);
			setState(173);
			match(O_ACOL);
			setState(174);
			decvar();
			setState(175);
			match(START);
			setState(176);
			match(F_ACOL);
			setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tT\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0086\n\f"+
		"\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ac\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\6\3\2\37\"\3\2#&\3\2\3\5\4\2\22\22\26\26\2\u00b6\2,\3\2\2"+
		"\2\4.\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\66\3\2\2\2\f@\3\2\2\2\16I\3"+
		"\2\2\2\20S\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26\u0085\3\2\2\2\30\u008b\3"+
		"\2\2\2\32\u008d\3\2\2\2\34\u0093\3\2\2\2\36\u0095\3\2\2\2 \u00ab\3\2\2"+
		"\2\"\u00ad\3\2\2\2$-\7\23\2\2%&\7\23\2\2&\'\7\31\2\2\'-\7\24\2\2(-\7\22"+
		"\2\2)*\7\33\2\2*+\7\24\2\2+-\7\34\2\2,$\3\2\2\2,%\3\2\2\2,(\3\2\2\2,)"+
		"\3\2\2\2-\3\3\2\2\2./\t\2\2\2/\5\3\2\2\2\60\61\t\3\2\2\61\7\3\2\2\2\62"+
		"\63\5\2\2\2\63\64\5\6\4\2\64\65\5\2\2\2\65\t\3\2\2\2\66\67\5\2\2\2\67"+
		"8\5\4\3\289\5\2\2\29\13\3\2\2\2:;\7\22\2\2;<\7\32\2\2<A\5\b\5\2=>\7\22"+
		"\2\2>?\7\32\2\2?A\5\2\2\2@:\3\2\2\2@=\3\2\2\2AB\3\2\2\2BC\7\27\2\2C\r"+
		"\3\2\2\2DE\t\4\2\2EF\7\22\2\2FG\7\27\2\2GJ\5\16\b\2HJ\3\2\2\2ID\3\2\2"+
		"\2IH\3\2\2\2J\17\3\2\2\2KL\5\f\7\2LM\5\20\t\2MT\3\2\2\2NO\5\24\13\2OP"+
		"\5\20\t\2PT\3\2\2\2QT\7\2\2\3RT\3\2\2\2SK\3\2\2\2SN\3\2\2\2SQ\3\2\2\2"+
		"SR\3\2\2\2T\21\3\2\2\2UV\7\b\2\2VW\7\35\2\2WX\5\20\t\2XY\7\36\2\2Y\\\3"+
		"\2\2\2Z\\\3\2\2\2[U\3\2\2\2[Z\3\2\2\2\\\23\3\2\2\2]^\7\6\2\2^_\7\33\2"+
		"\2_`\5\n\6\2`a\7\34\2\2ab\7\7\2\2bc\7\35\2\2cd\5\20\t\2de\7\36\2\2ef\5"+
		"\22\n\2f\25\3\2\2\2gh\7\t\2\2hi\7\35\2\2ij\5\20\t\2jk\7\36\2\2kl\7\n\2"+
		"\2lm\7\33\2\2mn\5\n\6\2no\7\34\2\2o\u0086\3\2\2\2pq\7\t\2\2qr\7\35\2\2"+
		"rs\5\20\t\2st\5\24\13\2tu\7\36\2\2uv\7\n\2\2vw\7\33\2\2wx\5\n\6\2xy\7"+
		"\34\2\2y\u0086\3\2\2\2z{\7\t\2\2{|\7\35\2\2|}\5\20\t\2}~\5\26\f\2~\177"+
		"\7\36\2\2\177\u0080\7\n\2\2\u0080\u0081\7\33\2\2\u0081\u0082\5\n\6\2\u0082"+
		"\u0083\7\34\2\2\u0083\u0086\3\2\2\2\u0084\u0086\7\2\2\3\u0085g\3\2\2\2"+
		"\u0085p\3\2\2\2\u0085z\3\2\2\2\u0085\u0084\3\2\2\2\u0086\27\3\2\2\2\u0087"+
		"\u0088\7\22\2\2\u0088\u0089\7\30\2\2\u0089\u008c\5\30\r\2\u008a\u008c"+
		"\7\22\2\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\13\2\2\u008e\u008f\7\33\2\2\u008f\u0090\5\30\r\2\u0090\u0091"+
		"\7\34\2\2\u0091\u0092\7\27\2\2\u0092\33\3\2\2\2\u0093\u0094\t\5\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\7\f\2\2\u0096\u0097\7\33\2\2\u0097\u0098\5\34"+
		"\17\2\u0098\u0099\7\34\2\2\u0099\u009a\7\27\2\2\u009a\37\3\2\2\2\u009b"+
		"\u009c\5\32\16\2\u009c\u009d\5 \21\2\u009d\u00ac\3\2\2\2\u009e\u009f\5"+
		"\36\20\2\u009f\u00a0\5 \21\2\u00a0\u00ac\3\2\2\2\u00a1\u00a2\5\f\7\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\5"+
		" \21\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5 \21\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\7\2\2\3\u00ab\u009b\3\2\2\2\u00ab\u009e\3\2"+
		"\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac!\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\7\21\2"+
		"\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\5\16\b\2\u00b1\u00b2\7\r\2\2\u00b2"+
		"\u00b3\7\36\2\2\u00b3\u00b4\7\2\2\3\u00b4#\3\2\2\2\n,@IS[\u0085\u008b"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}