// Generated from C:/Users/Mai Hegazy/IdeaProjects/untitled\parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parse}.
 */
public interface parseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parse#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parse.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parse.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(parse.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(parse.Class_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(parse.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link parse#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(parse.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link parse#feature_list}.
	 * @param ctx the parse tree
	 */
	void enterFeature_list(parse.Feature_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#feature_list}.
	 * @param ctx the parse tree
	 */
	void exitFeature_list(parse.Feature_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(parse.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(parse.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(parse.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(parse.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(parse.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(parse.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#formal_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_list(parse.Formal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#formal_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_list(parse.Formal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(parse.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(parse.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(parse.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(parse.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#block_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expr_list(parse.Block_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#block_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expr_list(parse.Block_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#branch_list}.
	 * @param ctx the parse tree
	 */
	void enterBranch_list(parse.Branch_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#branch_list}.
	 * @param ctx the parse tree
	 */
	void exitBranch_list(parse.Branch_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(parse.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(parse.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#let_list}.
	 * @param ctx the parse tree
	 */
	void enterLet_list(parse.Let_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#let_list}.
	 * @param ctx the parse tree
	 */
	void exitLet_list(parse.Let_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link parse#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(parse.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parse#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(parse.ExpressionContext ctx);
}