package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> conjuntoDeContatos;
    public AgendaContatos(){
        conjuntoDeContatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        conjuntoDeContatos.add(new Contato(nome,numero));
    }
    public void exibirContatos(){
        System.out.println(conjuntoDeContatos);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> conjuntoEncontradoNome = new HashSet<>();
        if(!conjuntoDeContatos.isEmpty()){
            for(Contato contatos : conjuntoDeContatos ){
                if(contatos.getNome().startsWith(nome)){
                    conjuntoEncontradoNome.add(contatos);
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio.");
        }
        return conjuntoEncontradoNome;
    }
    public Contato atualizarNumeroContato(String nome,int novoNumero) {
        Contato contato_Atualizado = null;
        if (!conjuntoDeContatos.isEmpty()) {
            for (Contato contatos : conjuntoDeContatos) {
                if (contatos.getNome().equalsIgnoreCase(nome)) {
                    contatos.setNumeroDeTelefone(novoNumero);
                    contato_Atualizado = contatos;
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio.");
        }return contato_Atualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Luis",994332456);
        agendaContatos.adicionarContato("Tania",123232);
        agendaContatos.adicionarContato("Fabio",3235322);
        agendaContatos.adicionarContato("Luis Carlos",994332458); //equals and hash code atuando.
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Luis"));
        agendaContatos.atualizarNumeroContato("Tania",984224313);
        agendaContatos.exibirContatos();
    }
}
