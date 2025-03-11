package factories;

import models.Carro;
import models.ChevroletOnix;

public class ChevroletFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new ChevroletOnix();
    }
}

