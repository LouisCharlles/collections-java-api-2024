package list.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    List<Integer> listaInteiros;

    public OrdenacaoNumeros() {
        listaInteiros = new ArrayList<>();
    }

    @Override
    public int compareTo(Integer integer) {
        return compareTo(integer);
    }

    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(listaInteiros);
        if(!listaOrdenadaAscendente.isEmpty()) {
            Collections.sort(listaOrdenadaAscendente);
            return listaOrdenadaAscendente;
        }
        else {
            throw new RuntimeException("Sua lista está vazia.");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadaDescendente = new ArrayList<>(listaInteiros);
        if(!listaOrdenadaDescendente.isEmpty()){
            listaOrdenadaDescendente.sort(Collections.reverseOrder());
            return listaOrdenadaDescendente;
        }
        else {
            throw new RuntimeException("Lista vazia.");
        }
    }
    public void exibirNumeros(){
        if(!listaInteiros.isEmpty()) {

            System.out.println(
                    listaInteiros
            );
        }else {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(543);
        ordenacaoNumeros.adicionarNumero(34);
        ordenacaoNumeros.adicionarNumero(16);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(54);
        ordenacaoNumeros.adicionarNumero(345);
        System.out.println(ordenacaoNumeros.ordenarDescendente()+"|"+
        ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.exibirNumeros();
    }


}

