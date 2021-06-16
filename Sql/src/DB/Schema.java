package DB;

import HelperClasses.Table;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Schema {

    private static Schema singleton = null;

    private Schema(){}

    public Map<String, DBTable> tables = new LinkedHashMap<>();

    public static Schema getInstance(){
        if (singleton == null) {
            singleton = new Schema();
        }
        return singleton;
    }


    public DBTable addTable(String name ,DBTable dbTable){
        tables.put(name,dbTable);
        return dbTable;
    }

    public DBTable getTable(String name ){return tables.get(name);}

}
