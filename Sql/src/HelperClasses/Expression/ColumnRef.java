package HelperClasses.Expression;

import HelperClasses.Table;

public class ColumnRef extends Expression{
    String name;

    public ColumnRef(String name){
        this.name = name;
        this.complete = true;
    }

    @Override public boolean CalculateB(Table tab, int rowNum){
        return tab.getValB(name,rowNum);
    }

    @Override public float CalculateF(Table tab, int rowNum){
        return tab.getValF(name,rowNum);
    }

    @Override public String CalculateS(Table tab, int rowNum){
        return tab.getValS(name,rowNum);
    }

    @Override
    public void calcType(Table tab) throws Exception {
        this.type = tab.getColType(name);
    }
}
