import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class application {


    public static void main(String[] args) {

        String javaClassContent = "Create Table lel ( test Int );";
        SqlLexer lexer = new SqlLexer(CharStreams.fromString(javaClassContent));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        UppercaseMethodListener listener= new UppercaseMethodListener();
    }







}
