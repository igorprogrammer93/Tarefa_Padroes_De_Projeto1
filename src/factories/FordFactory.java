package factories;

import models.Carro;
import models.FordFusion;

public class FordFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new FordFusion();
    }
}

