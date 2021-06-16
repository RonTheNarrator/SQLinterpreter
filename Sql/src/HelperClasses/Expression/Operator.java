package HelperClasses.Expression;

import HelperClasses.Table;

public class Operator extends Expression {

    public String operator;

    public Operator(String s){
        operator = s;
    }

    public boolean CalculateB(Expression exprA, Expression exprB, Table tab, int rowNum) throws Exception {
        // and or = < <= > >=
        if (operator.equalsIgnoreCase("and")){
            return exprA.CalculateB(tab, rowNum) & exprB.CalculateB(tab, rowNum);
        }
        if (operator.equalsIgnoreCase("or")){
            return exprA.CalculateB(tab, rowNum) | exprB.CalculateB(tab, rowNum);
        }
        if (operator.equalsIgnoreCase("=")){
            if (exprA.type == exprType.Float & exprB.type == exprType.Float)
                return exprA.CalculateF(tab, rowNum) == exprB.CalculateF(tab, rowNum);
            if (exprA.type == exprType.Bool & exprB.type == exprType.Bool)
                return exprA.CalculateB(tab, rowNum) == exprB.CalculateB(tab, rowNum);
            if (exprA.type == exprType.String & exprB.type == exprType.String)
                return exprA.CalculateS(tab, rowNum).equals(exprB.CalculateS(tab, rowNum));
            throw new Exception("Niezgodność typów");
        }
        if (operator.equalsIgnoreCase(">")){
            return exprA.CalculateF(tab, rowNum) > exprB.CalculateF(tab, rowNum);
        }
        if (operator.equalsIgnoreCase(">=")){
            return exprA.CalculateF(tab, rowNum) >= exprB.CalculateF(tab, rowNum);
        }
        if (operator.equalsIgnoreCase("<=")){
            return exprA.CalculateF(tab, rowNum) <= exprB.CalculateF(tab, rowNum);
        }
        if (operator.equalsIgnoreCase("<")){
            return exprA.CalculateF(tab, rowNum) < exprB.CalculateF(tab, rowNum);
        }
        if (operator.equalsIgnoreCase("<>")){
            return exprA.CalculateF(tab, rowNum) != exprB.CalculateF(tab, rowNum);
        }

        throw new Exception("Niepoprawny operator");
    }

    public float CalculateF(Expression exprA, Expression exprB, Table tab, int rowNum) throws Exception {
        // + - * /
        if (operator.equals("+")){
            return exprA.CalculateF(tab, rowNum) + exprB.CalculateF(tab, rowNum);
        }
        if (operator.equals("-")){
            return exprA.CalculateF(tab, rowNum) - exprB.CalculateF(tab, rowNum);
        }
        if (operator.equals("*")){
            return exprA.CalculateF(tab, rowNum) * exprB.CalculateF(tab, rowNum);
        }
        if (operator.equals("/")){
            return exprA.CalculateF(tab, rowNum) / exprB.CalculateF(tab, rowNum);
        }
        throw new Exception("Niepoprawny operator");
    }

    public String CalculateS(Expression exprA, Expression exprB, Table tab, int rowNum) throws Exception {
        // +
        if (operator.equals("+")){
            return exprA.CalculateS(tab, rowNum) + exprB.CalculateS(tab, rowNum);
        }
        throw new Exception("Niepoprawny operator");
    }

    public exprType calcType(Expression exprA, Expression exprB) throws Exception {
        if (exprA.type != exprB.type) throw new Exception("Niezgodność typów");

        if (operator.equalsIgnoreCase("=")) return this.type = exprA.type;

        if (operator.equalsIgnoreCase("and")
                | operator.equalsIgnoreCase("or")
                | operator.equalsIgnoreCase(">")
                | operator.equalsIgnoreCase("<")
                | operator.equalsIgnoreCase(">=")
                | operator.equalsIgnoreCase("<=")
                | operator.equalsIgnoreCase("<>") )
            return this.type = exprType.Bool;

        if (operator.equalsIgnoreCase("+")
                & (exprA.type == exprType.String | exprA.type == exprType.Float ))
            return this.type = exprA.type;

        if (operator.equalsIgnoreCase("-")
                | operator.equalsIgnoreCase("*")
                | operator.equalsIgnoreCase("/"))
            return this.type = exprType.Float;

        throw new Exception("Calc type falied");
    }
}
