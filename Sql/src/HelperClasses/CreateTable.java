package HelperClasses;

import DB.DBTable;
import DB.Schema;
import HelperClasses.Expression.exprType;

public class CreateTable extends BaseHelper{
    DBTable dbTable;
    public CreateTable(String name){
        dbTable = new DBTable();
        Schema.getInstance().addTable(name,dbTable);
    }
    public void addColumnF(String name){
        dbTable.addColF(name);
    }
    public void addColumnB(String name){
        dbTable.addColB(name);
    }
    public void addColumnS(String name){
        dbTable.addColS(name);
    }

}
