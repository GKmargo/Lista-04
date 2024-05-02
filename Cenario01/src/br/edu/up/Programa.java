package br.edu.up;
import br.edu.up.Util.Prompt;
import br.edu.up.modelo.Livro;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Livro livro01 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, " 0130819336", 2005);
        Prompt.imprimir("Livro 01:");
        Prompt.imprimir("Código: " + livro01.getCodigo());
        Prompt.imprimir("Titulo: " + livro01.getTitulo());
        Prompt.imprimir("Autores:");
        for(int i = 0; i < livro01.getAutores().length ; i++){
            Prompt.imprimir((livro01.getAutores()[i]));
        }
        Prompt.imprimir("ISBN: " + livro01.getIsbn());
        Prompt.imprimir("Ano: " + livro01.getAno());
        Prompt.imprimir("");

        Livro livro02 = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);
        Prompt.imprimir("Livro 02:");
        Prompt.imprimir("Código: " + livro02.getCodigo());
        Prompt.imprimir("Titulo: " + livro02.getTitulo());
        for(int i = 0; i < livro02.getAutores().length ; i++){
            Prompt.imprimir("Autor: " + (livro02.getAutores()[i]));
        }
        Prompt.imprimir("ISBN: " + livro02.getIsbn());
        Prompt.imprimir("Ano: " + livro02.getAno());

    }
}
