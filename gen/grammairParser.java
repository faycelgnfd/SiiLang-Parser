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
		PROGID=15, ID=16, STRING=17, NBR=18, NBRN=19, WS=20, PV=21, VIR=22, PT=23, 
		AFF=24, O_PAR=25, F_PAR=26, O_ACOL=27, F_ACOL=28, INF=29, SUP=30, EGAL=31, 
		DIFF=32, PLUS=33, SUB=34, MUL=35, DIV=36, DBQUOTE=37;
	public static final int
		RULE_operande = 0, RULE_comparateur = 1, RULE_operateur = 2, RULE_expression = 3, 
		RULE_endExp = 4, RULE_comparaison = 5, RULE_endComp = 6, RULE_affect = 7, 
		RULE_decvar = 8, RULE_inside = 9, RULE_sinon = 10, RULE_si = 11, RULE_tantque = 12, 
		RULE_insidelecture = 13, RULE_lecture = 14, RULE_insideecriture = 15, 
		RULE_ecriture = 16, RULE_instruction = 17, RULE_programme = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"operande", "comparateur", "operateur", "expression", "endExp", "comparaison", 
			"endComp", "affect", "decvar", "inside", "sinon", "si", "tantque", "insidelecture", 
			"lecture", "insideecriture", "ecriture", "instruction", "programme"
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
		public List<TerminalNode> NBR() { return getTokens(grammairParser.NBR); }
		public TerminalNode NBR(int i) {
			return getToken(grammairParser.NBR, i);
		}
		public TerminalNode PT() { return getToken(grammairParser.PT, 0); }
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public TerminalNode NBRN() { return getToken(grammairParser.NBRN, 0); }
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(NBR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(NBR);
				setState(40);
				match(PT);
				setState(41);
				match(NBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(O_PAR);
				setState(44);
				match(NBRN);
				setState(45);
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
			setState(48);
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
			setState(50);
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
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public OperateurContext operateur() {
			return getRuleContext(OperateurContext.class,0);
		}
		public EndExpContext endExp() {
			return getRuleContext(EndExpContext.class,0);
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
			setState(52);
			operande();
			setState(53);
			operateur();
			setState(54);
			endExp();
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

	public static class EndExpContext extends ParserRuleContext {
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public EndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterEndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitEndExp(this);
		}
	}

	public final EndExpContext endExp() throws RecognitionException {
		EndExpContext _localctx = new EndExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public ComparateurContext comparateur() {
			return getRuleContext(ComparateurContext.class,0);
		}
		public EndCompContext endComp() {
			return getRuleContext(EndCompContext.class,0);
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
		enterRule(_localctx, 10, RULE_comparaison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			operande();
			setState(59);
			comparateur();
			setState(60);
			endComp();
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

	public static class EndCompContext extends ParserRuleContext {
		public OperandeContext operande() {
			return getRuleContext(OperandeContext.class,0);
		}
		public EndCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterEndComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitEndComp(this);
		}
	}

	public final EndCompContext endComp() throws RecognitionException {
		EndCompContext _localctx = new EndCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 14, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(64);
				match(ID);
				setState(65);
				match(AFF);
				setState(66);
				expression();
				}
				break;
			case 2:
				{
				setState(67);
				match(ID);
				setState(68);
				match(AFF);
				setState(69);
				operande();
				}
				break;
			}
			setState(72);
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
		enterRule(_localctx, 16, RULE_decvar);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				match(ID);
				setState(76);
				match(PV);
				setState(77);
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
		public TantqueContext tantque() {
			return getRuleContext(TantqueContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_inside);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				affect();
				setState(82);
				inside();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				si();
				setState(85);
				inside();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				tantque();
				setState(88);
				inside();
				}
				break;
			case F_ACOL:
				enterOuterAlt(_localctx, 4);
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
		enterRule(_localctx, 20, RULE_sinon);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(ELSE);
				setState(94);
				match(O_ACOL);
				setState(95);
				inside();
				setState(96);
				match(F_ACOL);
				}
				break;
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
		enterRule(_localctx, 22, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			match(O_PAR);
			setState(103);
			comparaison();
			setState(104);
			match(F_PAR);
			setState(105);
			match(THEN);
			setState(106);
			match(O_ACOL);
			setState(107);
			inside();
			setState(108);
			match(F_ACOL);
			setState(109);
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
		enterRule(_localctx, 24, RULE_tantque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DO);
			setState(112);
			match(O_ACOL);
			setState(113);
			inside();
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

	public static class InsidelectureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammairParser.ID, 0); }
		public TerminalNode VIR() { return getToken(grammairParser.VIR, 0); }
		public InsidelectureContext insidelecture() {
			return getRuleContext(InsidelectureContext.class,0);
		}
		public InsidelectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insidelecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterInsidelecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitInsidelecture(this);
		}
	}

	public final InsidelectureContext insidelecture() throws RecognitionException {
		InsidelectureContext _localctx = new InsidelectureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insidelecture);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				setState(121);
				match(VIR);
				setState(122);
				insidelecture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
		public InsidelectureContext insidelecture() {
			return getRuleContext(InsidelectureContext.class,0);
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
		enterRule(_localctx, 28, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SCANCOMPIL);
			setState(127);
			match(O_PAR);
			setState(128);
			insidelecture();
			setState(129);
			match(F_PAR);
			setState(130);
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

	public static class InsideecritureContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(grammairParser.STRING, 0); }
		public InsidelectureContext insidelecture() {
			return getRuleContext(InsidelectureContext.class,0);
		}
		public InsideecritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insideecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).enterInsideecriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammairListener ) ((grammairListener)listener).exitInsideecriture(this);
		}
	}

	public final InsideecritureContext insideecriture() throws RecognitionException {
		InsideecritureContext _localctx = new InsideecritureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_insideecriture);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				insidelecture();
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

	public static class EcritureContext extends ParserRuleContext {
		public TerminalNode PRINTCOMPIL() { return getToken(grammairParser.PRINTCOMPIL, 0); }
		public TerminalNode O_PAR() { return getToken(grammairParser.O_PAR, 0); }
		public InsideecritureContext insideecriture() {
			return getRuleContext(InsideecritureContext.class,0);
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
		enterRule(_localctx, 32, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PRINTCOMPIL);
			setState(137);
			match(O_PAR);
			setState(138);
			insideecriture();
			setState(139);
			match(F_PAR);
			setState(140);
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
		enterRule(_localctx, 34, RULE_instruction);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANCOMPIL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				lecture();
				setState(143);
				instruction();
				}
				break;
			case PRINTCOMPIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				ecriture();
				setState(146);
				instruction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				affect();
				setState(149);
				instruction();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				si();
				setState(152);
				instruction();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				tantque();
				setState(155);
				instruction();
				}
				break;
			case F_ACOL:
				enterOuterAlt(_localctx, 6);
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

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(grammairParser.COMPIL, 0); }
		public TerminalNode PROGID() { return getToken(grammairParser.PROGID, 0); }
		public TerminalNode O_ACOL() { return getToken(grammairParser.O_ACOL, 0); }
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public TerminalNode START() { return getToken(grammairParser.START, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_programme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(COMPIL);
			setState(161);
			match(PROGID);
			setState(162);
			match(O_ACOL);
			setState(163);
			decvar();
			setState(164);
			match(START);
			setState(165);
			instruction();
			setState(166);
			match(F_ACOL);
			setState(167);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tI\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\ff\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\177\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u0089\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00a1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5"+
		"\3\2\37\"\3\2#&\3\2\3\5\2\u00a8\2\60\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2"+
		"\b\66\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20H\3\2\2\2\22Q\3\2\2"+
		"\2\24]\3\2\2\2\26e\3\2\2\2\30g\3\2\2\2\32q\3\2\2\2\34~\3\2\2\2\36\u0080"+
		"\3\2\2\2 \u0088\3\2\2\2\"\u008a\3\2\2\2$\u00a0\3\2\2\2&\u00a2\3\2\2\2"+
		"(\61\7\24\2\2)*\7\24\2\2*+\7\31\2\2+\61\7\24\2\2,\61\7\22\2\2-.\7\33\2"+
		"\2./\7\25\2\2/\61\7\34\2\2\60(\3\2\2\2\60)\3\2\2\2\60,\3\2\2\2\60-\3\2"+
		"\2\2\61\3\3\2\2\2\62\63\t\2\2\2\63\5\3\2\2\2\64\65\t\3\2\2\65\7\3\2\2"+
		"\2\66\67\5\2\2\2\678\5\6\4\289\5\n\6\29\t\3\2\2\2:;\5\2\2\2;\13\3\2\2"+
		"\2<=\5\2\2\2=>\5\4\3\2>?\5\16\b\2?\r\3\2\2\2@A\5\2\2\2A\17\3\2\2\2BC\7"+
		"\22\2\2CD\7\32\2\2DI\5\b\5\2EF\7\22\2\2FG\7\32\2\2GI\5\2\2\2HB\3\2\2\2"+
		"HE\3\2\2\2IJ\3\2\2\2JK\7\27\2\2K\21\3\2\2\2LM\t\4\2\2MN\7\22\2\2NO\7\27"+
		"\2\2OR\5\22\n\2PR\3\2\2\2QL\3\2\2\2QP\3\2\2\2R\23\3\2\2\2ST\5\20\t\2T"+
		"U\5\24\13\2U^\3\2\2\2VW\5\30\r\2WX\5\24\13\2X^\3\2\2\2YZ\5\32\16\2Z[\5"+
		"\24\13\2[^\3\2\2\2\\^\3\2\2\2]S\3\2\2\2]V\3\2\2\2]Y\3\2\2\2]\\\3\2\2\2"+
		"^\25\3\2\2\2_`\7\b\2\2`a\7\35\2\2ab\5\24\13\2bc\7\36\2\2cf\3\2\2\2df\3"+
		"\2\2\2e_\3\2\2\2ed\3\2\2\2f\27\3\2\2\2gh\7\6\2\2hi\7\33\2\2ij\5\f\7\2"+
		"jk\7\34\2\2kl\7\7\2\2lm\7\35\2\2mn\5\24\13\2no\7\36\2\2op\5\26\f\2p\31"+
		"\3\2\2\2qr\7\t\2\2rs\7\35\2\2st\5\24\13\2tu\7\36\2\2uv\7\n\2\2vw\7\33"+
		"\2\2wx\5\f\7\2xy\7\34\2\2y\33\3\2\2\2z{\7\22\2\2{|\7\30\2\2|\177\5\34"+
		"\17\2}\177\7\22\2\2~z\3\2\2\2~}\3\2\2\2\177\35\3\2\2\2\u0080\u0081\7\13"+
		"\2\2\u0081\u0082\7\33\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7\34\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\37\3\2\2\2\u0086\u0089\7\23\2\2\u0087\u0089\5\34"+
		"\17\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089!\3\2\2\2\u008a\u008b"+
		"\7\f\2\2\u008b\u008c\7\33\2\2\u008c\u008d\5 \21\2\u008d\u008e\7\34\2\2"+
		"\u008e\u008f\7\27\2\2\u008f#\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092"+
		"\5$\23\2\u0092\u00a1\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\5$\23\2"+
		"\u0095\u00a1\3\2\2\2\u0096\u0097\5\20\t\2\u0097\u0098\5$\23\2\u0098\u00a1"+
		"\3\2\2\2\u0099\u009a\5\30\r\2\u009a\u009b\5$\23\2\u009b\u00a1\3\2\2\2"+
		"\u009c\u009d\5\32\16\2\u009d\u009e\5$\23\2\u009e\u00a1\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u0090\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0096\3\2\2\2\u00a0"+
		"\u0099\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1%\3\2\2\2"+
		"\u00a2\u00a3\7\16\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\7\35\2\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7"+
		"\36\2\2\u00a9\u00aa\7\2\2\3\u00aa\'\3\2\2\2\n\60HQ]e~\u0088\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}