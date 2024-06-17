package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> lista_De_Livros;

    public CatalogoLivros(){
        lista_De_Livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        lista_De_Livros.add(livro);
    }

    public List<Livro> pesqisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!lista_De_Livros.isEmpty()) {
            for (Livro livro : lista_De_Livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!lista_De_Livros.isEmpty()) {
            for (Livro livro : lista_De_Livros) {
                if (anoInicial <= livro.getAno_De_Publicacao() && livro.getAno_De_Publicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return (livrosPorAno);

    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!lista_De_Livros.isEmpty()) {
            for (Livro livro : lista_De_Livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }

        }
        return livrosPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro(new Livro("livro2","Autor1",2005));
        catalogoLivros.adicionarLivro(new Livro("Livro1","Autor2",2013));
        catalogoLivros.adicionarLivro(new Livro("Livro3","Autor2",2012));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002,2016));
        System.out
                .println(catalogoLivros.pesquisarPorTitulo("Livro2"));
        System.out.println(catalogoLivros.pesqisarPorAutor("Autor2"));
    }
}
