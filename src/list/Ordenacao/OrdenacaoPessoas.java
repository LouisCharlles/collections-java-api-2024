package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;
    public OrdenacaoPessoas(){
        listaPessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome,int idade,double altura){
        listaPessoas.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;
    }
    public List<Pessoa> ordenarPorALtura(){
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadaPorAltura,new ComparesToAltura());
        return listaOrdenadaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Luis Carlos Macêdo Moreira",20,1.75);
        ordenacaoPessoas.adicionarPessoa("Maria Eduarda",10,1.65);
        ordenacaoPessoas.adicionarPessoa("Vitoria Santana",21,1.67);
        ordenacaoPessoas.adicionarPessoa("João Guilherme",27,1.80);
        System.out.println(ordenacaoPessoas.ordenarPorALtura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
