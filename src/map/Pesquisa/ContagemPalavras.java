package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String,Integer> mapDeContagemDePalavras;
    public ContagemPalavras(){
        mapDeContagemDePalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra,Integer contagem){
        mapDeContagemDePalavras.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if(!mapDeContagemDePalavras.isEmpty()){
            mapDeContagemDePalavras.remove(palavra);
        }
        else{
            throw new RuntimeException("Map vazio.");
        }
    }
    public int exibirContagemPalavras(){
        int totalDeContagem = 0;
        for (Map.Entry<String,Integer> entry : mapDeContagemDePalavras.entrySet()){
            totalDeContagem+=entry.getValue();
        }
        return totalDeContagem;
    }
    public Map<String,Integer> encontrarPalavrasMaisFrequente(){
        Map<String,Integer> palavraMaisFrequente = new HashMap<>();
        String nomePalavra = null;
        int maiorFrequancia = 0;
        if(!mapDeContagemDePalavras.isEmpty()){
            for(Map.Entry<String,Integer> entry : mapDeContagemDePalavras.entrySet()){
                int frequencia = entry.getValue();
                if(frequencia>maiorFrequancia){
                    nomePalavra = entry.getKey();
                    maiorFrequancia = frequencia;
                }
            }
            palavraMaisFrequente.put(nomePalavra,maiorFrequancia);
            return palavraMaisFrequente;
        }
        else {
            throw new RuntimeException("Seu map está vazio.");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Doido",2);
        contagemPalavras.adicionarPalavra("Afogar",1);
        contagemPalavras.adicionarPalavra("Abraçar",5);
        contagemPalavras.adicionarPalavra("Amar",10);
        contagemPalavras.adicionarPalavra("Comer",8);
        System.out.println("---------------");
        System.out.println("Removi afogar");
        contagemPalavras.removerPalavra("Afogar");
        System.out.println("---------------");
        System.out.println("A seguir, a palavra mais frequente:");
        System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
        System.out.println();
        System.out.println("Numero total de contagem:");
        System.out.println(contagemPalavras.exibirContagemPalavras()+" vezes.");


    }
}
