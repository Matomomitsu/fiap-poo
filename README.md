# Classe Carro

A classe `Carro` representa um veículo automotivo, simulando atributos e comportamentos básicos de um carro no mundo real. Ela permite controlar a marca, cor, velocidade, estado do freio e a marcha do veículo.

## Funcionamento

- **marca**: identifica o fabricante do carro.
- **cor**: define a cor do veículo.
- **velocidade**: indica a velocidade atual em km/h.
- **freioAcionado**: informa se o freio está acionado.
- **marcha**: representa a marcha atual do carro.

## Métodos

- `acelerar(double velocidade)`: aumenta a velocidade do carro, caso o freio não esteja acionado e a marcha permita.
- `frear()`: aciona o freio e reduz a velocidade para zero.
- `mudarMarcha(MarchaCarro novaMarcha)`: altera a marcha do carro, se for diferente da atual.

## Exemplo de uso

```java
Carro carro = new Carro("Fiat", "Vermelho");
carro.mudarMarcha(MarchaCarro.D);
carro.acelerar(50.0);
carro.frear();
```

---

O objeto `Carro` simula ações como acelerar, frear e trocar de marcha, refletindo o funcionamento de um carro real.

