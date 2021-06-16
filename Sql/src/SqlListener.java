// Generated from Sql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SqlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SqlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void enterSelectItemList(SqlParser.SelectItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void exitSelectItemList(SqlParser.SelectItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SqlParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SqlParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exprM}.
	 * @param ctx the parse tree
	 */
	void enterExprM(SqlParser.ExprMContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exprM}.
	 * @param ctx the parse tree
	 */
	void exitExprM(SqlParser.ExprMContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(SqlParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(SqlParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqlParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqlParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(SqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(SqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SqlParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SqlParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SqlParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SqlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SqlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(SqlParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(SqlParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#columnsSetEq}.
	 * @param ctx the parse tree
	 */
	void enterColumnsSetEq(SqlParser.ColumnsSetEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#columnsSetEq}.
	 * @param ctx the parse tree
	 */
	void exitColumnsSetEq(SqlParser.ColumnsSetEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhereStatement(SqlParser.WhereStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhereStatement(SqlParser.WhereStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operatorL}.
	 * @param ctx the parse tree
	 */
	void enterOperatorL(SqlParser.OperatorLContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operatorL}.
	 * @param ctx the parse tree
	 */
	void exitOperatorL(SqlParser.OperatorLContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operatorC}.
	 * @param ctx the parse tree
	 */
	void enterOperatorC(SqlParser.OperatorCContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operatorC}.
	 * @param ctx the parse tree
	 */
	void exitOperatorC(SqlParser.OperatorCContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#operatorM}.
	 * @param ctx the parse tree
	 */
	void enterOperatorM(SqlParser.OperatorMContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#operatorM}.
	 * @param ctx the parse tree
	 */
	void exitOperatorM(SqlParser.OperatorMContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(SqlParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(SqlParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#createTableCol}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableCol(SqlParser.CreateTableColContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#createTableCol}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableCol(SqlParser.CreateTableColContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(SqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(SqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertCol}.
	 * @param ctx the parse tree
	 */
	void enterInsertCol(SqlParser.InsertColContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertCol}.
	 * @param ctx the parse tree
	 */
	void exitInsertCol(SqlParser.InsertColContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void enterInsertValues(SqlParser.InsertValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void exitInsertValues(SqlParser.InsertValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insertValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertValue(SqlParser.InsertValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insertValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertValue(SqlParser.InsertValueContext ctx);
}