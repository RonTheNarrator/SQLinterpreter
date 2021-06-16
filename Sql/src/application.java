import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class application {


    public static void main(String[] args) {

        String stringTestowy = "Create Table lel ( test Float );" +
                "Insert Into lel ( test ) Values ( 1 );" +
                "Insert Into lel ( test ) Values ( 2 );" +
                "Select test From lel;" +
                "Select test , 'dwa' From lel;";
        SqlLexer lexer = new SqlLexer(CharStreams.fromString(stringTestowy));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyLisener listener= new MyLisener();

        walker.walk(listener, tree);

    }







}
