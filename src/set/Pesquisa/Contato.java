package set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroDeTelefone;

    public Contato(String nome, int numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return numeroDeTelefone == contato.numeroDeTelefone;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroDeTelefone);
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", numeroDeTelefone=" + numeroDeTelefone
                ;
    }
}
