package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavras(){
        conjuntoPalavras = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavras that)) return false;
        return Objects.equals(conjuntoPalavras, that.conjuntoPalavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjuntoPalavras);
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!conjuntoPalavras.isEmpty()) {
            conjuntoPalavras.remove(palavra);
        }

        else {
            throw new RuntimeException("Seu conjunto está vazio!");
        }
    }
    public void verificarPalavra(String palavra){
        if (conjuntoPalavras.isEmpty()) {
            throw new RuntimeException("Seu conjunto está vazio.");
        }
        if (conjuntoPalavras.contains(palavra)) {
            System.out.println("A palavra: " + palavra + " está contida dentro do conjunto.");
        } else {
            System.out.println("Sua palavra não foi encontrada.");
        }
    }
    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras1 = new ConjuntoPalavras();
        conjuntoPalavras1.adicionarPalavra("Wer");
        conjuntoPalavras1.adicionarPalavra("as");
        conjuntoPalavras1.removerPalavra("as");
        conjuntoPalavras1.exibirPalavrasUnicas();
        System.out.println();conjuntoPalavras1.verificarPalavra("Wer");
    }
}
