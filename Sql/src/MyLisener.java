import HelperClasses.BaseHelper;
import HelperClasses.CreateTable;
import HelperClasses.Expression.ColumnRef;
import HelperClasses.Expression.DataField;
import HelperClasses.Expression.Operator;
import HelperClasses.Expression.Expression;
import HelperClasses.InsertInto;
import HelperClasses.Select;
import HelperClasses.Table;

public class MyLisener extends SqlBaseListener{

    BaseHelper current;

    // Select

    @Override
    public void enterSelect(SqlParser.SelectContext ctx) {
        current = new Select();
    }

    public void exitSelect(SqlParser.SelectContext ctx) {
        current.startRequest();
    }

    @Override
    public void enterSelectItem(SqlParser.SelectItemContext ctx) {
        current.newSelectItem(ctx.getText());
    }


    @Override public void enterVariable(SqlParser.VariableContext ctx) {
        if (ctx.boolVar != null) {
            current.addExpr(new DataField(Boolean.parseBoolean(ctx.getText())));
            return;
        }
        if (ctx.textVar != null) { // string
            current.addExpr(new DataField(ctx.getText()));
            return;
        }
        if (ctx.numVar != null) { // float
            current.addExpr(new DataField(Float.parseFloat(ctx.getText())));
            return;
        }
        if (ctx.colVar != null) { // kolumna
            current.addExpr(new ColumnRef(ctx.getText()));
            return;
        }

    }

    @Override public void exitVariable(SqlParser.VariableContext ctx) { current.completeExpr();}



    @Override public void enterExpr(SqlParser.ExprContext ctx) {
        current.addExpr(new Expression());
    }
    @Override public void exitExpr(SqlParser.ExprContext ctx) {current.completeExpr(); }

    @Override public void enterOperator(SqlParser.OperatorContext ctx) {
        current.addExpr(new Operator(ctx.getText()));
    }

    @Override
    public void enterCreateTable(SqlParser.CreateTableContext ctx) {
        current = new CreateTable(ctx.Id().getText());
    }

    @Override
    public void enterCreateTableCol(SqlParser.CreateTableColContext ctx) {
        if (ctx.datatype().DatatypeB() != null) {
            ((CreateTable)current).addColumnB(ctx.Id().getText());
        }
        if (ctx.datatype().DatatypeT() != null) {
            ((CreateTable)current).addColumnS(ctx.Id().getText());
        }
        if (ctx.datatype().DatatypeF() != null) {
            ((CreateTable)current).addColumnF(ctx.Id().getText());
        }
    }


    //Insert

    @Override
    public void enterInsert(SqlParser.InsertContext ctx) {
        current = new InsertInto(ctx.Id().getText());
    }

    @Override
    public void exitInsert(SqlParser.InsertContext ctx) {
        super.enterInsert(ctx);
    }

    @Override
    public void enterInsertCol(SqlParser.InsertColContext ctx) {
        current.addColumn(ctx.Id().getText());
    }

    @Override
    public void enterInsertValue(SqlParser.InsertValueContext ctx) {
        try {
            ((InsertInto)current).addVal(ctx.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitInsertValue(SqlParser.InsertValueContext ctx) {
        current.startRequest();
    }

    @Override
    public void enterTable(SqlParser.TableContext ctx) {
        current.addTables(ctx.getText());
    }

    @Override public void
    enterWhereStatement(SqlParser.WhereStatementContext ctx) {
        current.addWhere();
    }

    // Conditions
/*
    @Override
    public void enterCondition(SqlParser.ConditionContext ctx) {
        current.where.e.Fill(new Condition());
    }
    @Override
    public void enterFormula(SqlParser.FormulaContext ctx) {
        current.where.e.Fill(new Formula());
    }
    @Override public void enterVar(SqlParser.VarContext ctx) {
        current.where.e.Fill(new Variable(ctx.getText()));
    }

    @Override
    public void enterOperatorM(SqlParser.OperatorMContext ctx) {
        current.where.e.Fill(new OperatorM(ctx.getText()));
    }
    @Override
    public void enterOperatorC(SqlParser.OperatorCContext ctx) {
        current.where.e.Fill(new OperatorC(ctx.getText()));
    }

*/
}
