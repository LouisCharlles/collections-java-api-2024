package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> mapDeProdutos;
    public EstoqueProdutos(){
        this.mapDeProdutos = new HashMap<>();
    }
    public void adicionarProduto(long codigo,String nome,int quantidade,double preco){
        mapDeProdutos.put(codigo,new Produto(nome,quantidade,preco));
    }
    public void exibirProdutos(){
        for (Map.Entry<Long, Produto> entry : mapDeProdutos.entrySet()){
            System.out.println("Código: "+entry.getKey()+" | "+entry.getValue());
        }

    }
    public Map<Integer,Double> calcularValorTotalEstoque(){
        Map<Integer,Double> mapeamentoDoTotalEstoque = new HashMap<>();
        int quantidadeTotalDeProdutos = 0;
        double precoTotal = 0;

        if(!mapDeProdutos.isEmpty()) {
            for (Produto produtos : mapDeProdutos.values()) {
                int quantidadePorProduto = produtos.getQuantidade();
                double precoPorProduto = produtos.getPreco();
                double precoTotalPorProduto = quantidadePorProduto * precoPorProduto;
                quantidadeTotalDeProdutos += quantidadePorProduto;
                precoTotal += precoTotalPorProduto;
            }
            mapeamentoDoTotalEstoque.put(quantidadeTotalDeProdutos, precoTotal);
            return mapeamentoDoTotalEstoque;
        }
        else {
            throw new RuntimeException("Não há oque calcular, seu mapeamento está vazio.");
        }
    }
    public Map<String,Double> obterProdutoMaisCaro(){
        Map<String,Double> produtoMaisCaro = new HashMap<>();
        String nomeDoProduto = null;
        double precoMaisCaro = Double.MIN_VALUE;
        if(!mapDeProdutos.isEmpty()) {
            for (Produto produtos : mapDeProdutos.values()) {
                if(produtos.getPreco()>precoMaisCaro){
                    nomeDoProduto = produtos.getNome();
                    precoMaisCaro = produtos.getPreco();
                }
            }
            produtoMaisCaro.put(nomeDoProduto,precoMaisCaro);
            return produtoMaisCaro;
        }
        else {
            throw new RuntimeException("Não há oque obter, seu mapeamento está vazio.");
        }
    }
    public Map<String,Double> obterProdutoMaisBarato(){
        Map<String,Double> produtoMaisBarato = new HashMap<>();
        String nomeDoProduto = null;
        double precoMaisBarato = Double.MAX_VALUE;
        if(!mapDeProdutos.isEmpty()) {
            for (Produto produtos : mapDeProdutos.values()) {
                if(produtos.getPreco()< precoMaisBarato){
                    nomeDoProduto = produtos.getNome();
                    precoMaisBarato = produtos.getPreco();

                }
            }
            produtoMaisBarato.put(nomeDoProduto, precoMaisBarato);
            return produtoMaisBarato;
        }
        else {
            throw new RuntimeException("Não há oque obter, seu mapeamento está vazio.");
        }
    }
    public Map<String,Double> obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Map<String,Double> produtoComMaiorQuantidadeEValorTotal = new HashMap<>();
        String nomeDoProduto = null;
        double maiorValorQuantidadeEPreco = 0;
        if(!mapDeProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : mapDeProdutos.entrySet()) {
                for (Produto produtos : mapDeProdutos.values()) {
                    double valorQuantidadeEPrecoPorProduto = produtos.getQuantidade() * produtos.getPreco();
                    if(valorQuantidadeEPrecoPorProduto>maiorValorQuantidadeEPreco){
                        nomeDoProduto = produtos.getNome();
                        maiorValorQuantidadeEPreco = valorQuantidadeEPrecoPorProduto;
                    }
                }
            }
            produtoComMaiorQuantidadeEValorTotal.put(nomeDoProduto,maiorValorQuantidadeEPreco);
            return produtoComMaiorQuantidadeEValorTotal;
        }
        else {
            throw new RuntimeException("Não há oque obter, seu mapeamento está vazio.");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(22,"Computador",1,2050);
        estoqueProdutos.adicionarProduto(21,"Garrafa",10,20);
        estoqueProdutos.adicionarProduto(10,"Caneca",200,45);
        estoqueProdutos.adicionarProduto(112,"Lápis",1000,2.50);
        estoqueProdutos.adicionarProduto(214,"Vassoura",50,20);
        estoqueProdutos.adicionarProduto(106,"Detergente",20,15);
        estoqueProdutos.exibirProdutos();

        System.out.println();

        System.out.println("A seguir o produto mais barato: "+estoqueProdutos.obterProdutoMaisBarato());

        System.out.println();

        System.out.println("A seguir o produto mais caro: "+estoqueProdutos.obterProdutoMaisCaro());

        System.out.println();

        System.out.println("Segue aqui o valor total em quantidade no estoque e o preço total: "+estoqueProdutos.calcularValorTotalEstoque());

        System.out.println();

        System.out.println("O produto com maior valor considerando quantidade vezes o valor é: "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
