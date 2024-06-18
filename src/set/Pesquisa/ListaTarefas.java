package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> conjuntoDeTarefas;

    public ListaTarefas(){
        conjuntoDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoDeTarefas.add(new Tarefa(descricao,false));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> conjuntoDeTarefasParaRemover = new HashSet<>();
        if(!conjuntoDeTarefas.isEmpty()){
            for(Tarefa tarefas : conjuntoDeTarefas){
                if(tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    conjuntoDeTarefasParaRemover.add(tarefas);
                    break;
                }
            }
            conjuntoDeTarefas.removeAll(conjuntoDeTarefasParaRemover);
        }
        else {
            throw new RuntimeException("Conjunto vazio.");
        }
    }

    public void exibirTarefas(){
        System.out.println(conjuntoDeTarefas);
    }

    public int contarTarefas(){
        return conjuntoDeTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> conjuntoDeTarefasConcluidas = new HashSet<>();
        if (!conjuntoDeTarefas.isEmpty()){
            for(Tarefa tarefas : conjuntoDeTarefas){
                if(tarefas.isConcluida()){
                    conjuntoDeTarefasConcluidas.add(tarefas);
                }
            }
        }
        else {
            throw new RuntimeException("Conjunto vazio!");
        }
        return conjuntoDeTarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> conjuntoDeTarefasPendentes = new HashSet<>();
        if (!conjuntoDeTarefas.isEmpty()){
            for(Tarefa tarefas : conjuntoDeTarefas){
                if(!tarefas.isConcluida()){
                    conjuntoDeTarefasPendentes.add(tarefas);
                }
            }
        }
        else {
            throw new RuntimeException("Conjunto vazio!");
        }
        return conjuntoDeTarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!conjuntoDeTarefas.isEmpty()){
            for(Tarefa tarefas : conjuntoDeTarefas){
                if(tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.setConcluida(true);
                }
            }
        }
        else {
            throw new RuntimeException("Conjunto vazio.");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!conjuntoDeTarefas.isEmpty()){
            for(Tarefa tarefas : conjuntoDeTarefas){
                if(tarefas.getDescricao().equalsIgnoreCase(descricao)){
                    tarefas.setConcluida(false);
                    break;
                }
            }
        }
        else {
            throw new RuntimeException("Conjunto vazio.");
        }
    }

    public void limparListaTarefa(){
        conjuntoDeTarefas = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas conjuntoDeTarefas = new ListaTarefas();
        conjuntoDeTarefas.adicionarTarefa("Ir para academia");
        conjuntoDeTarefas.adicionarTarefa("lavar louça");
        conjuntoDeTarefas.adicionarTarefa("Estudar");
        conjuntoDeTarefas.marcarTarefaConcluida("Ir para academia");
        conjuntoDeTarefas.adicionarTarefa("Terminar série.");
        conjuntoDeTarefas.marcarTarefaPendente("lavar louça");
        System.out.println("A seguir o conjunto de tarefas concluidas: " +conjuntoDeTarefas.obterTarefasConcluidas());
        System.out.println();
        System.out.println("A seguir o conjunto de tarefas pendentes: "+conjuntoDeTarefas.obterTarefasPendentes());
        System.out.println();
        System.out.println("A seguir o numero total de tarefas: "+conjuntoDeTarefas.contarTarefas());
        System.out.println();
        conjuntoDeTarefas.removerTarefa("lavar louça");
        conjuntoDeTarefas.exibirTarefas();
        //conjuntoDeTarefas.limparListaTarefa();



    }


}
