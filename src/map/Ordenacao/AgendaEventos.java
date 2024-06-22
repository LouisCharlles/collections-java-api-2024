package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventosMap;
    public AgendaEventos(){agendaEventosMap = new HashMap<>();}

    public void adicionarEvento(LocalDate data,String nome,String atracao){
        agendaEventosMap.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> agendaOrdenada = new TreeMap<>(agendaEventosMap);
        for(Map.Entry<LocalDate,Evento> entry : agendaOrdenada.entrySet()){
            System.out.println("Dia do evento: "+entry.getKey()+" | "+entry.getValue());
        }
    }

    public void obterProximoEvento(){
        Map<LocalDate,Evento> mapeamentoProximoEvento = new TreeMap<>(agendaEventosMap);
        LocalDate anoAtual = LocalDate.now();
        for(Map.Entry<LocalDate,Evento> entry : mapeamentoProximoEvento.entrySet()){
            if(entry.getKey().equals(anoAtual) || entry.getKey().isAfter(anoAtual)){
                System.out.println("O próximo evento será o: "+entry.getValue()+", no dia: "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,6,22),"Comprar Suplemento","Suplemento");
        agendaEventos.adicionarEvento(LocalDate.of(2024,12,26),"Bruno e Marrone,","Sertanejo");
        agendaEventos.adicionarEvento(LocalDate.of(2024,7,23),"Cervejada,","Beber");
        agendaEventos.adicionarEvento(LocalDate.of(2024,9,12),"Show de Rock,","Banda de Rock");
        agendaEventos.adicionarEvento(LocalDate.of(2024,11,1),"Rock in Rio,","Jack Black");
        agendaEventos.exibirAgenda();
        System.out.println();
        agendaEventos.obterProximoEvento();
    }
}
