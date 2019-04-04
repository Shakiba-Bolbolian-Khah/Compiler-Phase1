import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import toorla.ast.Program;
import toorla.visitor.TreePrinter;
import toorla.visitor.Visitor;

public class ToorlaCompiler {
    public void compile(CharStream textStream) {
        Toorla_ActionsLexer toorlaLexer = new Toorla_ActionsLexer( textStream );
        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );
        Toorla_ActionsParser toorlaParser = new Toorla_ActionsParser( tokenStream );
        Program toorlaASTCode = toorlaParser.program().mProgram;
        Visitor<Void> treePrinter = new TreePrinter();
       // toorlaASTCode.accept( treePrinter );
//        AS_EXPR_EVALLexer toorlaLexer = new AS_EXPR_EVALLexer( textStream );
//        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );
//        AS_EXPR_EVALParser toorlaParser = new AS_EXPR_EVALParser( tokenStream );
//        toorlaParser.program();
//        Visitor<Void> treePrinter = new TreePrinter();
        // toorlaASTCode.accept( treePrinter );
    }
}
