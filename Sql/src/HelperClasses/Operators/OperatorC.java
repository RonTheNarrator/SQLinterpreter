package HelperClasses.Operators;

import HelperClasses.Expressions.Condition;
import HelperClasses.Expressions.Variable;
import HelperClasses.Table;

public class OperatorC extends BaseOperator{


    public OperatorC(String s) {
        super(s);
    }

    public boolean calc(Condition a, Condition b, Table tab,int rowNum){
        if (s.equalsIgnoreCase("==")){
            return a.Calculate(tab,rowNum) == b.Calculate(tab,rowNum);
        }

        if (s.equalsIgnoreCase("<")){
            return ((Variable) a).CalculateM(tab,rowNum) < ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase(">")){
            return ((Variable) a).CalculateM(tab,rowNum) > ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase("<=")){
            return ((Variable) a).CalculateM(tab,rowNum) <= ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase(">=")){
            return ((Variable) a).CalculateM(tab,rowNum) >= ((Variable) b).CalculateM(tab,rowNum);
        }

        if (s.equalsIgnoreCase("<>")){
            return ((Variable) a).CalculateM(tab,rowNum) != ((Variable) b).CalculateM(tab,rowNum);
        }

        return false;
    }


}
