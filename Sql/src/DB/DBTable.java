package DB;

import HelperClasses.Expression.exprType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBTable {


    public int LastRow = -1;
    public Map<String, Map<Integer, Float>> ColumnsF = new LinkedHashMap<>();
    public Map<String, Map<Integer, String>> ColumnsS = new LinkedHashMap<>();
    public Map<String, Map<Integer, Boolean>> ColumnsB = new LinkedHashMap<>();

    public exprType getColType(String name) throws Exception {
        if (ColumnsF.containsKey(name)) return exprType.Float;
        if (ColumnsS.containsKey(name)) return exprType.String;
        if (ColumnsB.containsKey(name)) return exprType.Bool;
        throw new Exception("Column" + name + "doesnt exist");
    }
    public void addColF(String name){
        ColumnsF.put(name, new LinkedHashMap<Integer, Float>());
    }
    public void addColS(String name){
        ColumnsS.put(name, new LinkedHashMap<Integer, String>());
    }
    public void addColB(String name){
        ColumnsB.put(name, new LinkedHashMap<Integer, Boolean>());
    }



    public float getValF(String colName,int id){
        return ColumnsF.get(colName).get(id);
    }
    public String getValS(String colName,int id){
        return ColumnsS.get(colName).get(id);
    }

    public boolean getValB(String colName,int id){
        return ColumnsB.get(colName).get(id);
    }

    public void insertData(String colName,String data) throws Exception {
        if (ColumnsF.containsKey(colName)) ColumnsF.get(colName).put(LastRow,Float.parseFloat(data));
        if (ColumnsS.containsKey(colName)) ColumnsS.get(colName).put(LastRow,data);
        if (ColumnsB.containsKey(colName)) ColumnsB.get(colName).put(LastRow,Boolean.parseBoolean(data));
        throw new Exception("Column" + colName + "doesnt exist");
    }

}
