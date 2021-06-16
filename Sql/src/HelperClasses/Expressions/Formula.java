package HelperClasses.Expressions;

import HelperClasses.Operators.OperatorC;
import HelperClasses.Table;

public class Formula extends Condition{

    @Override
    public boolean Calculate(Table tab,int rowNum){
        if (conditionB == null) {
            return conditionA.Calculate(tab,rowNum);
        }
        return ((OperatorC)operator).calc(conditionA,conditionB,tab,rowNum);
    }


}
