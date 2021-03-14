// Generated from C:/Users/Dell/OneDrive/Bureau/LKSC/USTHB/S7/Compile/Projet/SiiLang-Parser/src\Tiny_SII.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Tiny_SIIParser}.
 */
public interface Tiny_SIIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#operande}.
	 * @param ctx the parse tree
	 */
	void enterOperande(Tiny_SIIParser.OperandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#operande}.
	 * @param ctx the parse tree
	 */
	void exitOperande(Tiny_SIIParser.OperandeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void enterComparateur(Tiny_SIIParser.ComparateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#comparateur}.
	 * @param ctx the parse tree
	 */
	void exitComparateur(Tiny_SIIParser.ComparateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Tiny_SIIParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Tiny_SIIParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void enterComparaison(Tiny_SIIParser.ComparaisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#comparaison}.
	 * @param ctx the parse tree
	 */
	void exitComparaison(Tiny_SIIParser.ComparaisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#affect}.
	 * @param ctx the parse tree
	 */
	void enterAffect(Tiny_SIIParser.AffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#affect}.
	 * @param ctx the parse tree
	 */
	void exitAffect(Tiny_SIIParser.AffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#decvar}.
	 * @param ctx the parse tree
	 */
	void enterDecvar(Tiny_SIIParser.DecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#decvar}.
	 * @param ctx the parse tree
	 */
	void exitDecvar(Tiny_SIIParser.DecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#dakhel}.
	 * @param ctx the parse tree
	 */
	void enterDakhel(Tiny_SIIParser.DakhelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#dakhel}.
	 * @param ctx the parse tree
	 */
	void exitDakhel(Tiny_SIIParser.DakhelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(Tiny_SIIParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(Tiny_SIIParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(Tiny_SIIParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(Tiny_SIIParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void enterDakhellecture(Tiny_SIIParser.DakhellectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#dakhellecture}.
	 * @param ctx the parse tree
	 */
	void exitDakhellecture(Tiny_SIIParser.DakhellectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#lecture}.
	 * @param ctx the parse tree
	 */
	void enterLecture(Tiny_SIIParser.LectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#lecture}.
	 * @param ctx the parse tree
	 */
	void exitLecture(Tiny_SIIParser.LectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void enterDakhelecriture(Tiny_SIIParser.DakhelecritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#dakhelecriture}.
	 * @param ctx the parse tree
	 */
	void exitDakhelecriture(Tiny_SIIParser.DakhelecritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void enterEcriture(Tiny_SIIParser.EcritureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#ecriture}.
	 * @param ctx the parse tree
	 */
	void exitEcriture(Tiny_SIIParser.EcritureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(Tiny_SIIParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(Tiny_SIIParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tiny_SIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(Tiny_SIIParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tiny_SIIParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(Tiny_SIIParser.ProgrammeContext ctx);
}