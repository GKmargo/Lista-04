package br.edu.up.Controles;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.Modelos.Reserva;

public class ReservaControle {
    private List<Reserva> reservas;

    public ReservaControle() {
        reservas = new ArrayList<>();
    }
    public void criarReserva(String responsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
        Reserva reserva = new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
        reservas.add(reserva);
        System.out.println("Reserva criada com sucesso!");
    }

    public void listarReservas() {
        System.out.println("\nReservas:");
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            System.out.println((i + 1) + ". " + reserva.getInfoReserva());
        }
    }

}