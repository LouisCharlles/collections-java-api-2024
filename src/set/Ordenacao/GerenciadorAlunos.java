package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos{
    Set<Aluno> setDeAlunos;
    public GerenciadorAlunos(){
        setDeAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome,long matricula,double nota){
        setDeAlunos.add(new Aluno(nome,matricula,nota));
    }
    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!setDeAlunos.isEmpty()){
            for(Aluno alunos : setDeAlunos){
                if(alunos.getMatricula() == matricula){
                    alunoParaRemover = alunos;
                }
            }
            setDeAlunos.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso.");
        }
        else {
            throw new RuntimeException("Conunto vazio!");
        }
        if(alunoParaRemover == null){
            System.out.println("Matrícula não encontrada.");
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> setOrganizadoPorNome = new TreeSet<>(setDeAlunos);
        return setOrganizadoPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> setOrganizadoPorNota = new TreeSet<>(new ExibirPorNota());
        setOrganizadoPorNota.addAll(setDeAlunos);
        return setOrganizadoPorNota;
    }
    public void exibirAlunos(){
        System.out.println(setDeAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Luis Carlos",213,10);
        gerenciadorAlunos.adicionarAluno("Vitoria",32,9.9);
        gerenciadorAlunos.adicionarAluno("Artur",321,8);
        gerenciadorAlunos.adicionarAluno("Debora",321,9); //Equals and hash code
        gerenciadorAlunos.adicionarAluno("Paulo",2,6.5);
        gerenciadorAlunos.adicionarAluno("Marcos",1,2.65);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        gerenciadorAlunos.removerAluno(1);
        gerenciadorAlunos.removerAluno(2);
        gerenciadorAlunos.exibirAlunos();
    }


}
