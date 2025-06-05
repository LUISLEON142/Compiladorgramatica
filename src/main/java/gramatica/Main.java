// Main.java
package gramatica;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Uso: java -jar luis.jar <archivo>.c");
            System.exit(1);
        }
        // 1) Leer el fichero SmallC
        var input = CharStreams.fromFileName(args[0]);
        // 2) Tokenizar
        var lexer  = new SmallCLexer(input);
        var tokens = new CommonTokenStream(lexer);
        // 3) Parsear
        var parser = new SmallCParser(tokens);
        ParseTree tree = parser.program();
        // 4) Recorrer AST y generar ASM
        var visitor = new SmallCVisitorImpl();
        String asm = visitor.visit(tree);
        // 5) Imprimir en stdout
        System.out.print(asm);
    }
}
