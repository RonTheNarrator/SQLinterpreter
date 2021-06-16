import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class application {


    public static void main(String[] args) {

        String stringTestowy = "Create Table tab ( test Float );" +
                "Insert Into tab ( test ) Values ( 1 );" +
                "Insert Into tab ( test ) Values ( 2 );" +
                "Select test From tab;" +
                "Select test , 'dwa' From tab;" +
                "Create Table numery ( test Float , str Text );" +
                "Insert Into numery ( test , str ) Values ( 0 , 'zero' );" +
                "Insert Into numery ( test , str ) Values ( 1 , 'jeden' );" +
                "Insert Into numery ( test , str ) Values ( 2 , 'dwa' );" +
                "Insert Into numery ( test , str ) Values ( 3 , 'trzy' );" +
                "Select test From numery;" +
                "Select ( 2*3 ) = 5 ;";
        SqlLexer lexer = new SqlLexer(CharStreams.fromString(stringTestowy));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyLisener listener= new MyLisener();

        walker.walk(listener, tree);

    }







}
