package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    Map<String,Livro> livrariaMap;
    public LivrariaOnline(){
        livrariaMap = new HashMap<>();
    }
    public void adicionarLivro(String link,String titulo,String autor,double preco){
        livrariaMap.put(link,new Livro(titulo,autor,preco));
    }
    public void removerLivro(String titulo){
        String livroEncontrado = null;
        for(Livro livros : livrariaMap.values()){
            if(livros.getTitulo().equalsIgnoreCase(titulo)){
                livroEncontrado = livros.getTitulo();
            }
        }
        if(livroEncontrado != null) {
            livrariaMap.remove(livroEncontrado);
        }
        else {
            System.out.println("Não foi possível encontrar um livro com este título.");
        }

    }

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String,Livro>> livrosParaOrdenar = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenar,new ComparePorPreco());

        Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String,Livro> entry:livrosParaOrdenar){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor){
        List<Map.Entry<String,Livro>> livrosParaBuscarPorAutor = new ArrayList<>(livrariaMap.entrySet());
        Map<String,Livro> livrosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String,Livro> entry : livrosParaBuscarPorAutor){
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(),entry.getValue());
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro(){
        Map<String,Livro> acharLivroMaisCaro = new HashMap<>(livrariaMap);
        double precoMaisCaro = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        List<Livro> listaDeLivroMaisCaro = new ArrayList<>();

        if(!acharLivroMaisCaro.isEmpty()) {
            for (Map.Entry<String, Livro> entry : acharLivroMaisCaro.entrySet()) {
                double precoDeLivro = entry.getValue().getPreco();
                if (entry.getValue().getPreco() > precoMaisCaro) {
                    precoMaisCaro = precoDeLivro;
                }
            }
        }
        else {
            throw new RuntimeException("Map vazio");
        }

        for(Map.Entry<String,Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getPreco() == precoMaisCaro){
                livroMaisCaro = entry.getValue();
                listaDeLivroMaisCaro.add(livroMaisCaro);
            }
        }return listaDeLivroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato(){
        Map<String,Livro> acharLivroMaisBarato = new HashMap<>(livrariaMap);
        double precoMaisBarato = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        List<Livro> listaDeLivroMaisBarato = new ArrayList<>();

        if(!acharLivroMaisBarato.isEmpty()) {
            for (Map.Entry<String, Livro> entry : acharLivroMaisBarato.entrySet()) {
                double precoDeLivro = entry.getValue().getPreco();
                if (entry.getValue().getPreco() < precoMaisBarato) {
                    precoMaisBarato = precoDeLivro;
                }
            }
        }
        else {
            throw new RuntimeException("Map vazio");
        }

        for(Map.Entry<String,Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getPreco() == precoMaisBarato){
                livroMaisBarato = entry.getValue();
                listaDeLivroMaisBarato.add(livroMaisBarato);
            }
        }return listaDeLivroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("www.link1","HomemAranha","Marvel",16);
        livrariaOnline.adicionarLivro("www.link2","Thor","Marvel",300);
        livrariaOnline.adicionarLivro("www.link3","Batman","DC",50);
        livrariaOnline.adicionarLivro("www.link4","SuperHomem","DC",1000);
        livrariaOnline.adicionarLivro("www.link5","MulherMaravilha","DC",40);
        livrariaOnline.adicionarLivro("www.link6","Capitão América","Marvel",127);
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println();
        System.out.println(livrariaOnline.obterLivroMaisBarato());
        System.out.println();
        System.out.println( livrariaOnline.obterLivroMaisCaro());
        System.out.println();
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Marvel"));

        ;
       ;
        ;
    }


}
