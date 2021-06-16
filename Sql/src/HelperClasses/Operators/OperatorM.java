package HelperClasses.Operators;

import HelperClasses.Expressions.Condition;
import HelperClasses.Expressions.Variable;
import HelperClasses.Table;

public class OperatorM extends BaseOperator{
    public OperatorM(String s) {
        super(s);
    }


    public float calc(Condition a, Condition b, Table tab,int rowNum) {
        if (s.equalsIgnoreCase("+")) {
            return ((Variable) a).CalculateM(tab,rowNum) + ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase("-")) {
            return ((Variable) a).CalculateM(tab,rowNum) + ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase("*")) {
            return ((Variable) a).CalculateM(tab,rowNum) + ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase("/")) {
            return ((Variable) a).CalculateM(tab,rowNum) + ((Variable) b).CalculateM(tab,rowNum);
        }

        return 0;
    }

}
