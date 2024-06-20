package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String,Integer> agendaContatos;
    public AgendaContatos(){
        this.agendaContatos = new HashMap<>();
    }
    public void adicionarContato(String nome,Integer numeroDeTelefone){
        agendaContatos.put(nome,numeroDeTelefone);
    }
    public void removerContato(String nome){
        if(!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
        else {
            throw new RuntimeException("Map vazio.");
        }

    }
    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroDeContatoAchado = null;
        if (!agendaContatos.isEmpty()) {
            numeroDeContatoAchado = agendaContatos.get(nome);
            return numeroDeContatoAchado;
        }

        else {
            throw new RuntimeException("Seu map está vazio.");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos1 = new AgendaContatos();
        agendaContatos1.adicionarContato("Luis Carlos",184022542);
        agendaContatos1.adicionarContato("Claudio",284022042);
        agendaContatos1.adicionarContato("Luis Gustavo",38332141);
        agendaContatos1.adicionarContato("Luis Paulo",58332132);
        agendaContatos1.adicionarContato("Luis Cleiton",78332156);
        agendaContatos1.adicionarContato("Luis Roberto",68332149);
        agendaContatos1.exibirContatos();
        agendaContatos1.removerContato("Luis Roberto");
        agendaContatos1.exibirContatos();
        System.out.println(agendaContatos1.pesquisarPorNome("Luis Carlos"));

    }
}
