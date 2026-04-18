package controller;

import model.Aluguel;
import java.util.ArrayList;
import java.util.List;

public class AluguelController {
    private List<Aluguel> alugueis = new ArrayList<>();

    public void adicionar(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public List<Aluguel> buscarPorData(String data) {
        List<Aluguel> lista = new ArrayList<>();
        for (Aluguel a : alugueis) {
            if (a.getData().equals(data)) {
                lista.add(a);
            }
        }
        return lista;
    }
}
