package HelperClasses;

import DB.Schema;
import HelperClasses.Expressions.Condition;
import HelperClasses.Expression.Expression;

public abstract class BaseHelper {

    Expression expression;
    public Where where = null;

    public void addColumn(String name){}
    //public void addTables(Table table){}

    public void addWhere(){}

    public void addTables(String name){};
    //public void addCond(){};
    public void startRequest(){}

    public void addExpr(Expression e){};
    public void completeExpr(){};
    public void newSelectItem(String text){}

}
