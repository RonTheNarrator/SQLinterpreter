package HelperClasses.Expression;

import HelperClasses.Table;

public class DataField extends Expression{

    public String DataS;
    public float DataF;
    public boolean DataB;


    //String
    public DataField(String s){
        this.DataS = s;
        this.type=exprType.String;
        this.complete = true;
    }
    @Override public String CalculateS(Table tab, int rowNum){
        this.type = exprType.String;
        return DataS;
    }

    public DataField(float f){
        this.type = exprType.Float;
        this.DataF = f;
        this.complete = true;
    }
    @Override public float CalculateF(Table tab, int rowNum){
        return DataF;
    }

    public DataField(boolean b){
        this.type = exprType.Bool;
        this.DataB = b;
        this.complete = true;
    }
    @Override public boolean CalculateB(Table tab, int rowNum){
        return DataB;
    }

    @Override
    public void calcType(Table tab) {
        //To ma być puste, typ ustalamy w konstruktorze
    }

}
