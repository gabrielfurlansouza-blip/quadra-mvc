package view;

import model.Aluguel;

public class AluguelView {
    public void mostrar(Aluguel aluguel) {
        System.out.println("Total: " + aluguel.getTotal());
    }
}
