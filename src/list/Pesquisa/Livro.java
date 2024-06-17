package list.Pesquisa;

public class Livro {
    private String titulo,autor;
    private int ano_De_Publicacao;
    public Livro(String titulo,String autor,int ano_De_Publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_De_Publicacao = ano_De_Publicacao;
    }

    public int getAno_De_Publicacao() {
        return ano_De_Publicacao;
    }

    public void setAno_De_Publicacao(int ano_De_Publicacao) {
        this.ano_De_Publicacao = ano_De_Publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano_De_Publicacao=" + ano_De_Publicacao +
                '}';
    }
}
