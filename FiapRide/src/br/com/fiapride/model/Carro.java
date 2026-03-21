package br.com.fiapride.model;

import br.com.fiapride.enums.MarchaCarro;

public class Carro {
    public String marca;
    public String cor;
    private double velocidade;
    private boolean freioAcionado;
    private MarchaCarro marcha;

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.velocidade = 0.0;
        this.freioAcionado = false;
        this.marcha = MarchaCarro.P;
    }

    public double getVelocidade(){
        return (this.velocidade);
    }

    public void setVelocidade(double velocidade){
        if ((getMarchaCarro() == MarchaCarro.P || getMarchaCarro() == MarchaCarro.N) && velocidade > 0){
            System.out.println("Não é possível aumentar a velocidade se está na marcha" + this.marcha);
        }

        this.velocidade = velocidade;
    }

    public MarchaCarro getMarchaCarro(){
        return (this.marcha);
    }

    public boolean getFreioAcionado() {return (this.freioAcionado);}

    public void setMarchaCarro(MarchaCarro marcha)
    {
        if (getVelocidade() > 0){
            System.out.println("Não é possível mudar de marcha enquanto sua velocidade for maior que 0");
        }

        this.marcha = marcha;
    }

    public void acelerar(double velocidade) {
        if (this.freioAcionado) {
            System.out.println("Freio acionado. Não é possível acelerar.");
            return;
        }

        if (this.marcha == MarchaCarro.P || this.marcha == MarchaCarro.N) {
            System.out.println("Carro está na marcha " + this.marcha + " e não pode acelerar.");
            return;
        }

        this.velocidade += velocidade;
        System.out.println("Carro acelerando. Velocidade atual: " + this.velocidade + " km/h");
    }

    public void frear() {
        if (this.freioAcionado) {
            System.out.println("Freio já acionado");
            return;
        }

        this.freioAcionado = true;
        this.velocidade = 0.0;
        System.out.println("Freiando carro. Velocidade atual: " + this.velocidade + " km/h");
    }

    public void mudarMarcha(MarchaCarro novaMarcha) {
        if (this.marcha == novaMarcha) {
            System.out.println("Carro já está na marcha " + this.marcha);
            return;
        }

        this.marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + this.marcha);
    }
}
