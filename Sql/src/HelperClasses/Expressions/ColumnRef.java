package HelperClasses.Expressions;

import HelperClasses.Table;

public class ColumnRef extends Variable{
    //String name; // data z variable

    public ColumnRef(String s) {
        super(s);
    }


    @Override
    public float CalculateM(Table tab,int rowNum){
        return 0;//tab.getVal(data,rowNum);
    }
}
