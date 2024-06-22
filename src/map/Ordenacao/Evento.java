package map.Ordenacao;

public class Evento{
    private String nomeDoEvento,nomeDaAtracao;
    public Evento(String nomeDoEvento,String nomeDaAtracao){
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }


    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    public void setNomeDaAtracao(String nomeDaAtracao) {
        this.nomeDaAtracao = nomeDaAtracao;
    }

    @Override
    public String toString() {
        return
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", nomeDaAtracao='" + nomeDaAtracao + '\''
                ;
    }
}
