package HelperClasses.Expression;

import HelperClasses.Expressions.Condition;
import HelperClasses.Operators.BaseOperator;
import HelperClasses.Operators.OperatorL;
import HelperClasses.Table;

public class Expression {

    public Expression exprA;
    public Expression exprB;
    public Operator op;
    public boolean complete = false;

    public exprType type;

    public Expression(){}

    public boolean Fill(Expression e) { // czy zaakceptowano
        if (this.complete) return false;


        if (exprA == null) { // nie ma piewszej części, teraz to twoje dziecko
            exprA =  e;
            return true;   // ok
        }
        // mam już dziecko niech ono się tym zajmie
        if (exprA.Fill(e)){ // próbuj przekazać dziecku
            return true;//udało się, jest git
        }
        //dzieckoA nie chce, sprawdźmy czy mam operator
        if (op == null) {
            op = (Operator) e;
            return true;
        }
        //Czas na dziecko 2 jeśli go nie ma
        if (exprB == null) { // Jeśli nie ma drugiego dziecka to teraz już jest
            exprB = e;
            return true;   // ok
        }
        //Jeśli drugie dziecko nie chce to ty też nie chcesz
        return exprB.Fill(e);
    }

    public void Complete(){
        if (exprA.complete){
            if (exprB != null) {
                if(exprB.complete){
                    this.complete = true;
                }else{
                    exprB.Complete();
                }
            }else {
                this.complete = true;//B nie istnieje
            }
        }else {
            exprA.Complete();
        }
    }

    public boolean CalculateB(Table tab, int rowNum) throws Exception {
        if (exprB == null) {
            return exprA.CalculateB(tab,rowNum);
        }
        return op.CalculateB(exprA,exprB,tab,rowNum);
    }

    public float CalculateF(Table tab, int rowNum) throws Exception {
        if (exprB == null) {
            return exprA.CalculateF(tab,rowNum);
        }
        return op.CalculateF(exprA,exprB,tab,rowNum);
    }

    public String CalculateS(Table tab, int rowNum) throws Exception {
        if (exprB == null) {
            return exprA.CalculateS(tab,rowNum);
        }
        return op.CalculateS(exprA,exprB,tab,rowNum);
    }

    public void calcType(Table tab) throws Exception {
        exprA.calcType(tab);
        if (exprB != null) {
            exprB.calcType(tab);
            this.type = op.calcType(exprA,exprB);
        }else this.type=exprA.type;
    }

}
// TODO : WIęcej komend
// Create table
// Select Where
// Drop
// Update

// Lekka Modyfikacja SQL, dodanie instrukcjii
// Dodatkowa instrukcja
// połączenie instrukcji
// Zmiana tematu
//Rozszr

