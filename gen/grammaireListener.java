// Generated from C:/Users/Dell/IdeaProjects/Tiny_SII/src\grammaire.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammaireParser}.
 */
public interface grammaireListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammaireParser#operande}.
	 * @param ctx the parse tree
	 */
	void enterOperande(grammaireParser.OperandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#operande}.
	 * @param ctx the parse tree
	 */
	void exitOperande(grammaireParser.OperandeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void enterComparateur(grammaireParser.ComparateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void exitComparateur(grammaireParser.ComparateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(grammaireParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(grammaireParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void enterComparaison(grammaireParser.ComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void exitComparaison(grammaireParser.ComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(grammaireParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(grammaireParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#decvar}.
	 * @param ctx the parse tree
	 */
	void enterDecvar(grammaireParser.DecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#decvar}.
	 * @param ctx the parse tree
	 */
	void exitDecvar(grammaireParser.DecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#dakhel}.
	 * @param ctx the parse tree
	 */
	void enterDakhel(grammaireParser.DakhelContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#dakhel}.
	 * @param ctx the parse tree
	 */
	void exitDakhel(grammaireParser.DakhelContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(grammaireParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(grammaireParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(grammaireParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(grammaireParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void enterDakhellecture(grammaireParser.DakhellectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void exitDakhellecture(grammaireParser.DakhellectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#lecture}.
	 * @param ctx the parse tree
	 */
	void enterLecture(grammaireParser.LectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#lecture}.
	 * @param ctx the parse tree
	 */
	void exitLecture(grammaireParser.LectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void enterDakhelecriture(grammaireParser.DakhelecritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void exitDakhelecriture(grammaireParser.DakhelecritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void enterEcriture(grammaireParser.EcritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void exitEcriture(grammaireParser.EcritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(grammaireParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(grammaireParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammaireParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(grammaireParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammaireParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(grammaireParser.ProgrammeContext ctx);
}