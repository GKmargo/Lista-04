package br.edu.up.Controles;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.Modelos.Evento;

public class EventoControle {

    private List<Evento> eventos;

    // Construtor
    public EventoControle() {
        eventos = new ArrayList<>();
    }

    // Método para criar um novo evento
    public void criarEvento(String nome, String data, String local, int lotacaoMaxima, double precoIngresso) {
        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventos.add(evento);
        System.out.println("Evento criado com sucesso!");
    }

    // Método para listar todos os eventos
    public void listarEventos() {
        System.out.println("\nEventos Disponíveis:");
        for (Evento evento : eventos) {
            System.out.println(evento.getInfoEvento());
        }
    }

    // Método para vender ingressos para o evento
    public void venderIngressos(int indiceEvento, int quantidade) {
        if (indiceEvento >= 0 && indiceEvento < eventos.size()) {
            Evento evento = eventos.get(indiceEvento);
            evento.venderIngressos(quantidade);
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    // Método para obter preço do ingresso
    public double getPrecoIngresso(int indiceEvento) {
        Evento evento = eventos.get(indiceEvento);
        return evento.getPrecoIngresso();
    }
}


