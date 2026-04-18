package model;

public class Horario {
    private String hora;
    private double valor;
    private boolean disponivel = true;

    public Horario(String hora, double valor) {
        if (valor < 0) throw new IllegalArgumentException();
        this.hora = hora;
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        disponivel = false;
    }

    public double getValor() {
        return valor;
    }
}
