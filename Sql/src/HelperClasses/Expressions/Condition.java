package HelperClasses.Expressions;

import HelperClasses.Operators.BaseOperator;
import HelperClasses.Operators.OperatorL;
import HelperClasses.Table;

public class Condition extends Expression {
    public Condition conditionA = null;
    public Condition conditionB = null;
    public BaseOperator operator = null;
    public boolean complete = false;

    @Override
    public boolean Fill(Expression e){ // czy zaakceptowano
        if (this.complete) return false;


        if (conditionA == null) { // nie ma piewszej części, teraz to twoje dziecko
            conditionA = (Condition) e;
            return true;   // ok
        }
        // mam już dziecko niech ono się tym zajmie
        if (conditionA.Fill(e)){ // próbuj przekazać dziecku
            return true;//udało się, jest git
        }
        //dzieckoA nie chce, sprawdźmy czy mam operator
        if (operator == null) {
            operator = (BaseOperator) e;
            return true;
        }
        //Czas na dziecko 2 jeśli go nie ma
        if (conditionB == null) { // Jeśli nie ma drugiego dziecka to teraz już jest
            conditionB = (Condition) e;
            return true;   // ok
        }
        //Jeśli drugie dziecko nie chce to ty też nie chcesz
        return conditionB.Fill(e);

    }

    public void Complete(){
        if (conditionA.complete){
            if (conditionB != null) {
                if(conditionB.complete){
                    this.complete = true;
                }else{
                    conditionB.Complete();
                }
            }else {
                this.complete = true;//B nie istnieje
            }
        }else {
            conditionA.Complete();
        }
    }

    public boolean Calculate(Table tab,int rowNum){
        if (conditionB == null) {
            return conditionA.Calculate(tab,rowNum);
        }
        return ((OperatorL)operator).calc(conditionA,conditionB,tab,rowNum);
    }


}
