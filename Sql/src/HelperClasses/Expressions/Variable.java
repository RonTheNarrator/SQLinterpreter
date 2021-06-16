package HelperClasses.Expressions;

import HelperClasses.Operators.OperatorM;
import HelperClasses.Table;

public class Variable extends Formula{

        String data = null;

    public Variable(String s){
        data = s;
    }



    public float CalculateM(Table tab,int rowNum){
        if (data != null) {
            return Float.valueOf(data);
        }

        if (conditionB == null) {
            return ((Variable)conditionA).CalculateM(tab,rowNum);
        }
        return ((OperatorM)operator).calc(conditionA,conditionB,tab,rowNum);
    }

}
