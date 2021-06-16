package HelperClasses.Operators;

import HelperClasses.Expressions.Condition;
import HelperClasses.Table;

public class OperatorL extends BaseOperator {


    public OperatorL(String s) {
        super(s);
    }

    public boolean calc(Condition a, Condition b, Table tab, int rowNum){
        if (s.equalsIgnoreCase("And")){
            return a.Calculate(tab,rowNum) & b.Calculate(tab,rowNum);
        }

        if (s.equalsIgnoreCase("Or")){
            return a.Calculate(tab,rowNum) | b.Calculate(tab,rowNum);
        }

        return false;
    }
}
