import factories.CarroFactory;
import factories.ChevroletFactory;
import factories.FordFactory;
import models.Carro;

public class Main {
    public static void main(String[] args) {
        // Criar fábrica da Ford e Chevrolet
        CarroFactory fordFactory = new FordFactory();
        CarroFactory chevroletFactory = new ChevroletFactory();

        // Criar carros a partir das fábricas
        Carro fordCarro = fordFactory.criarCarro();
        Carro chevroletCarro = chevroletFactory.criarCarro();

        // Exibir informações dos carros
        fordCarro.exibirInfo();
        chevroletCarro.exibirInfo();
    }
}
