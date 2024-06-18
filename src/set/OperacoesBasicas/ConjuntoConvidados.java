package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados(){
        conjuntoConvidados = new HashSet<>();
    }
    public void adicionarConvidado(String nome,int codigoConvite){
        conjuntoConvidados.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidado(int codigoConvite){
        Convidado convidado = null;
        for(Convidado convidado1 : conjuntoConvidados){
            if(convidado1.getCodigo() == codigoConvite){
                convidado = convidado1;
                break;
            }
        }
        conjuntoConvidados.remove(convidado);
    }
    public int contarConvidados(){
        return conjuntoConvidados.size();
    }
    public void exibirConvidados(){
        System.out.println(conjuntoConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados1 = new ConjuntoConvidados();
        conjuntoConvidados1.adicionarConvidado("c1",21);
        conjuntoConvidados1.adicionarConvidado("c2",22);
        conjuntoConvidados1.adicionarConvidado("c3",23);
        conjuntoConvidados1.adicionarConvidado("c34",25);
        conjuntoConvidados1.adicionarConvidado("c5",25);
        conjuntoConvidados1.exibirConvidados();
        conjuntoConvidados1.removerConvidado(23);
        System.out.println(conjuntoConvidados1.contarConvidados());
    }
}
