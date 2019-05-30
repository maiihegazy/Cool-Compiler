// Generated from C:/Users/Mai Hegazy/IdeaProjects/untitled\parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parse}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parse#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parse.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#class_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_list(parse.Class_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#class_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_(parse.Class_Context ctx);
	/**
	 * Visit a parse tree produced by {@link parse#feature_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_list(parse.Feature_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(parse.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(parse.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(parse.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#formal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_list(parse.Formal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(parse.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(parse.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#block_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_expr_list(parse.Block_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#branch_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_list(parse.Branch_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(parse.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#let_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_list(parse.Let_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(parse.ExpressionContext ctx);
}