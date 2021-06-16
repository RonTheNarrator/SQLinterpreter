package HelperClasses;

import DB.Schema;
import HelperClasses.Expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Select extends BaseHelper {

    List<String> Columns = new ArrayList<>();
    List<String> Tables  = new ArrayList<>();
    List<Expression> selectExpr = new ArrayList<>();
    Table tab = null;

    @Override
    public void addColumn(String name){
        Columns.add(name);
    }

    @Override
    public void addTables(String name){
        Tables.add(name);
        this.tab = new Table(name);
    }

    public void addWhere(){
        where = new Where();
    }

    public void addExpr(Expression e) {
        if (where != null) {
            where.e.Fill(e);
            return;
        }
        if (selectExpr.isEmpty() || selectExpr.get(selectExpr.size() - 1).complete) {
            selectExpr.add(e);
        }else selectExpr.get(selectExpr.size() - 1).Fill(e);
    }

    @Override
    public void completeExpr(){
        if (where != null) {
            where.e.Complete();
            return;
        }
        if (selectExpr != null) {
            selectExpr.get(selectExpr.size() - 1).Complete();
        }
    };

    @Override
    public void startRequest(){

        Schema schema = Schema.getInstance();
        int rowCount;
        if (tab != null) rowCount =tab.getRowNumber();
        else rowCount = 1;

        // Finalizacja wyrażenia
        for (Expression e : selectExpr){
            try {
                e.calcType(tab);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        // Zwracaj kolejne rzędy
        for (int i = 0; i < rowCount; i++) {
            try {
                for (Expression e : selectExpr){
                    switch (e.type){
                        case Float -> System.out.print(e.CalculateF(tab,i));
                        case Bool -> System.out.print(e.CalculateB(tab,i));
                        case String -> System.out.print(e.CalculateS(tab,i));
                    }
                    System.out.print(" ");
                }
                System.out.print("\n");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            //System.out.println(selectExpr.Calculate(tab,i));
        }



    }
    public void newSelectItem(String text){
        if (text.equals("*")){
            //TODO : Select *
        }
    }
}
