package HelperClasses;

import DB.DBTable;
import DB.Schema;
import HelperClasses.BaseHelper;

import java.util.ArrayList;
import java.util.List;

public class InsertInto extends BaseHelper {
    DBTable dbTable;
    List<String> cols = new ArrayList<>();
    int iCol = 0;
    public InsertInto(String s){
        dbTable = Schema.getInstance().getTable(s);
    }

    @Override
    public void addColumn(String name) {
        if (cols.indexOf(name) != (-1)){
            cols.add(null);
        }else{
            cols.add(name);
        }
    }
    public void addVal(String data) throws Exception {
        dbTable.insertData(cols.get(iCol),data);
        iCol++;
    }

    @Override
    public void startRequest() {
        dbTable.nextRow();
    }
}
