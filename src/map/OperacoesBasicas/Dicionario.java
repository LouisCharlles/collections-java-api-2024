package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String,String> dicionario;
    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra,String definicao){
        dicionario.put(palavra,definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
        else {
            throw new RuntimeException("Seu dicionário está vazio!");
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionario);
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if(definicao != null){
            return definicao;
        }
        else {
            return "Essa palavra não foi encontrada no dicionário.";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario1 = new Dicionario();
        dicionario1.adicionarPalavra("Colher","Utensílio de mesa e cozinha, \ncomposto de um cabo em cuja extremidade se forma uma parte côncava,\n us. para levar alimentos à boca, servir pratos etc.");
        dicionario1.adicionarPalavra("Celular"," Telefone portátil, alimentado por bateria,\n que estabelece comunicação com outros aparelhos \n sem necessitar de uma ligação física fixa (cabo) à rede de telecomunicações.");
        dicionario1.adicionarPalavra("Computador","Máquina destinada ao processamento de dados, \ncapaz de obedecer a instruções que visam produzir certas transformações nesses dados \npara alcançar um fim determinado.");
        System.out.println(dicionario1.pesquisarPorPalavra("Peixe"));
        System.out.println();
        dicionario1.removerPalavra("Colher");
        dicionario1.exibirPalavras();
    }



}
