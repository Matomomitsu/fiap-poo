package br.com.fiapride.model;

enum MarchaCarro{
	P,
	N,
	D,
	R
}

public class Carro {
	public String marca;
	public double velocidade;
	public double rpm;
	public String cor;
	public boolean isFreioMaoAcionado;
	public MarchaCarro marcha;
	
	public Carro(String marca, String cor) 
	{
		this.marca = marca;
		this.cor = cor;
		this.velocidade = 0.0;
		this.rpm = 0.0;
		this.isFreioMaoAcionado = false;
		this.marcha = MarchaCarro.P;
	}
	
	public Andar()
}
