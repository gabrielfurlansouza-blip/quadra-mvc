package model;

import java.util.List;

public class Aluguel {
    private Cliente cliente;
    private List<Horario> horarios;
    private double total;
    private String data;

    public Aluguel(Cliente cliente, List<Horario> horarios, String data) {
        this.cliente = cliente;
        this.horarios = horarios;
        this.data = data;
        calcular();
    }

    private void calcular() {
        total = 0;
        for (Horario h : horarios) {
            if (!h.isDisponivel()) throw new IllegalArgumentException();
            h.reservar();
            total += h.getValor();
        }
    }

    public double getTotal() {
        return total;
    }

    public String getData() {
        return data;
    }
}
