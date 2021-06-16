package HelperClasses;

import DB.DBTable;
import DB.Schema;
import HelperClasses.Expression.exprType;
import jdk.jshell.spi.ExecutionControl;

public class Table {

    DBTable dbTable;

    public Table(String name){
        dbTable = Schema.getInstance().getTable(name);
    }

    public void join(String join){
        // TODO : Implement
    }

    public float getValF(String colName,int id){
        return dbTable.getValF(colName, id);
    }
    public String getValS(String colName,int id){
        return dbTable.getValS(colName, id);
    }
    public boolean getValB(String colName,int id){
        return dbTable.getValB(colName, id);
    }

    public exprType getColType(String name) throws Exception {
        return dbTable.getColType(name);
    }

    public int getRowNumber(){
        return 0;
    }

}
