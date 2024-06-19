package set.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> conjuntoDeProdutos;
    public CadastroProdutos(){
        conjuntoDeProdutos = new HashSet<>();
    }
    public void adicionarProduto(String nome,long codigo,int quantidade,double preco){
        conjuntoDeProdutos.add(new Produto(nome,codigo,preco,quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> conjuntoExibidoPorNome = new TreeSet<>(conjuntoDeProdutos);
        return conjuntoExibidoPorNome;
    }
    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> conjuntoExibidoPorPreco = new TreeSet<>(new ExibirPorPreco());
        conjuntoExibidoPorPreco.addAll(conjuntoDeProdutos);
        return conjuntoExibidoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Boneco",23,30,30);
        cadastroProdutos.adicionarProduto("Cadeira",221,1,1999);
        cadastroProdutos.adicionarProduto("Garrafa",233,2,12.50);
        cadastroProdutos.adicionarProduto("Geladeira",4562,1,1499);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());


    }


}




