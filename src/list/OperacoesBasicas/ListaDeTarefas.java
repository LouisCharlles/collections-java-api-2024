package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    List<Tarefa> lista_De_Tarefas = new ArrayList<>();

    public ListaDeTarefas() {
        this.lista_De_Tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        lista_De_Tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> itensParaRemover = new ArrayList<>();
        for(Tarefa tarefa : lista_De_Tarefas){
            if(descricao.equalsIgnoreCase(tarefa.getDescricao())){
                itensParaRemover.add(tarefa);
            }
        }
        lista_De_Tarefas.removeAll(itensParaRemover);
    }

    public int checarComprimentoDaLista(){
        return lista_De_Tarefas.size();
    }

    public void imprimirLista(){
        System.out.println(lista_De_Tarefas);
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.adicionarTarefa("Escutar música");
        System.out.println(listaDeTarefas.checarComprimentoDaLista());
        listaDeTarefas.imprimirLista();
        listaDeTarefas.adicionarTarefa("Estudar");
        listaDeTarefas.adicionarTarefa("Estudar");
        listaDeTarefas.imprimirLista();
        System.out.println(listaDeTarefas.checarComprimentoDaLista());
        listaDeTarefas.removerTarefa("Estudar");
        listaDeTarefas.imprimirLista();

    }
}

