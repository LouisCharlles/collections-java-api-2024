package list.Pesquisa;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class SomaNumeros {
    ArrayList<Integer> listaDeNumerosInteiros;
    public SomaNumeros(){
        listaDeNumerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        try {
            listaDeNumerosInteiros.add(numero);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Você não pode adicionar um tipo diferente de um inteiro.");

        }
    }

    public int calcularSoma(){
        if (!listaDeNumerosInteiros.isEmpty()) {
            int soma_Total = 0;
            for (int numeros : listaDeNumerosInteiros) {
                soma_Total += numeros;
            }
            return soma_Total;
        }
        else {
            return 0;
        }
    }

    public int maiorNumero(){
        int maior_Numero = Integer.MIN_VALUE;
        if(!listaDeNumerosInteiros.isEmpty()){
            for(int numeros : listaDeNumerosInteiros){
                if (numeros>maior_Numero){
                    maior_Numero = numeros;
                }
            }
            return maior_Numero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }


    }

    public int menorNumero(){
        int menor_Numero = listaDeNumerosInteiros.getFirst();
        if(!listaDeNumerosInteiros.isEmpty()){
            for(int numeros : listaDeNumerosInteiros){
                if (numeros<menor_Numero){
                    menor_Numero = numeros;
                }
            }
            return menor_Numero;
        }else {
            throw new RuntimeException("A lista está vazia.");
        }

    }

    public void exibirLista(){
        System.out.println(listaDeNumerosInteiros);
    }

    public static void main(String[] args){
        SomaNumeros listaSoma = new SomaNumeros();
        listaSoma.adicionarNumero(4);
        listaSoma.adicionarNumero(8);
        listaSoma.adicionarNumero(2);
        listaSoma.adicionarNumero(25);
        System.out.println(listaSoma.calcularSoma());
        System.out.println(listaSoma.maiorNumero()+"|"+listaSoma.menorNumero());
        listaSoma.exibirLista();
    }
}
