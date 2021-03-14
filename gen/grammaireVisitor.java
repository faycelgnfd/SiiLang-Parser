// Generated from C:/Users/Dell/IdeaProjects/Tiny_SII/src\grammaire.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammaireParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammaireVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammaireParser#operande}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperande(grammaireParser.OperandeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#comparateur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparateur(grammaireParser.ComparateurContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(grammaireParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#comparaison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaison(grammaireParser.ComparaisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#affect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffect(grammaireParser.AffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#decvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecvar(grammaireParser.DecvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#dakhel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhel(grammaireParser.DakhelContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(grammaireParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#tantque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(grammaireParser.TantqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#dakhellecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhellecture(grammaireParser.DakhellectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#lecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLecture(grammaireParser.LectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#dakhelecriture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDakhelecriture(grammaireParser.DakhelecritureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#ecriture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcriture(grammaireParser.EcritureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(grammaireParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammaireParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(grammaireParser.ProgrammeContext ctx);
}