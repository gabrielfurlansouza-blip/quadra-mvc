import model.*;
import controller.*;
import view.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Gabriel", "88888");

        Horario h1 = new Horario("10:00", 50);
        Horario h2 = new Horario("11:00", 50);

        Aluguel aluguel = new Aluguel(c, Arrays.asList(h1, h2), "2026-04-17");

        AluguelController controller = new AluguelController();
        controller.adicionar(aluguel);

        AluguelView view = new AluguelView();
        view.mostrar(aluguel);
    }
}
