// Generated from grammair.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammairParser}.
 */
public interface grammairListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammairParser#operande}.
	 * @param ctx the parse tree
	 */
	void enterOperande(grammairParser.OperandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#operande}.
	 * @param ctx the parse tree
	 */
	void exitOperande(grammairParser.OperandeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void enterComparateur(grammairParser.ComparateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void exitComparateur(grammairParser.ComparateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#operateur}.
	 * @param ctx the parse tree
	 */
	void enterOperateur(grammairParser.OperateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#operateur}.
	 * @param ctx the parse tree
	 */
	void exitOperateur(grammairParser.OperateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(grammairParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(grammairParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void enterComparaison(grammairParser.ComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void exitComparaison(grammairParser.ComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(grammairParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(grammairParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#decvar}.
	 * @param ctx the parse tree
	 */
	void enterDecvar(grammairParser.DecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#decvar}.
	 * @param ctx the parse tree
	 */
	void exitDecvar(grammairParser.DecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#inside}.
	 * @param ctx the parse tree
	 */
	void enterInside(grammairParser.InsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#inside}.
	 * @param ctx the parse tree
	 */
	void exitInside(grammairParser.InsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#sinon}.
	 * @param ctx the parse tree
	 */
	void enterSinon(grammairParser.SinonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#sinon}.
	 * @param ctx the parse tree
	 */
	void exitSinon(grammairParser.SinonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(grammairParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(grammairParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(grammairParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(grammairParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void enterDakhellecture(grammairParser.DakhellectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void exitDakhellecture(grammairParser.DakhellectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#lecture}.
	 * @param ctx the parse tree
	 */
	void enterLecture(grammairParser.LectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#lecture}.
	 * @param ctx the parse tree
	 */
	void exitLecture(grammairParser.LectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void enterDakhelecriture(grammairParser.DakhelecritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void exitDakhelecriture(grammairParser.DakhelecritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void enterEcriture(grammairParser.EcritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void exitEcriture(grammairParser.EcritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(grammairParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(grammairParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammairParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(grammairParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammairParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(grammairParser.ProgrammeContext ctx);
}