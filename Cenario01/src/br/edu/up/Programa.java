import Util.Prompt;
import modelo.Livro;

public class Programa {
    public static void main(String[] args) throws Exception {
        Livro livro01 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, " 0130819336", 2005);
        Prompt.imprimir("Livro 01:");
        Prompt.imprimir(livro01.getCodigo());
        Prompt.imprimir(livro01.getTitulo());
        Prompt.imprimir(livro01.getAutores());
        Prompt.imprimir(livro01.getIsbn());
        Prompt.imprimir(livro01.getAno());
    }
}
