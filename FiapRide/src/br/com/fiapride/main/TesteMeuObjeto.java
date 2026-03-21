package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;
import br.com.fiapride.enums.MarchaCarro;

public class TesteMeuObjeto {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Vermelho");
        System.out.println("Carro: " + carro.marca + " | Cor: " + carro.cor + " | Marcha: " + carro.getMarchaCarro());
        carro.mudarMarcha(MarchaCarro.D);
        System.out.println("Carro: " + carro.marca + " | Cor: " + carro.cor + " | Marcha: " + carro.getMarchaCarro());
        carro.acelerar(50.0);
        System.out.println("Velocidade após acelerar: " + carro.getVelocidade() + " km/h" + " | Freio acionado: " + carro.getFreioAcionado());
        carro.frear();
        System.out.println("Velocidade após frear: " + carro.getVelocidade() + " km/h" + " | Freio acionado: " + carro.getFreioAcionado());
    }
}
