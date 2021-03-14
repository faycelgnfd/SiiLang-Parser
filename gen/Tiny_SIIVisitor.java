// Generated from C:/Users/Dell/OneDrive/Bureau/LKSC/USTHB/S7/Compile/Projet/SiiLang-Parser/src\Tiny_SII.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Tiny_SIIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Tiny_SIIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#operande}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperande(Tiny_SIIParser.OperandeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#comparateur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparateur(Tiny_SIIParser.ComparateurContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Tiny_SIIParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#comparaison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaison(Tiny_SIIParser.ComparaisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#affect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffect(Tiny_SIIParser.AffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#decvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecvar(Tiny_SIIParser.DecvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#dakhel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhel(Tiny_SIIParser.DakhelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(Tiny_SIIParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#tantque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(Tiny_SIIParser.TantqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#dakhellecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhellecture(Tiny_SIIParser.DakhellectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#lecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecture(Tiny_SIIParser.LectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#dakhelecriture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhelecriture(Tiny_SIIParser.DakhelecritureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#ecriture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcriture(Tiny_SIIParser.EcritureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(Tiny_SIIParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tiny_SIIParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(Tiny_SIIParser.ProgrammeContext ctx);
}