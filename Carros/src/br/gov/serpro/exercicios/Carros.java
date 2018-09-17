package br.gov.serpro.exercicios;

public class Carros {
	int potencia;
	float velocidade;
	String nome;
	
	void acelerar() {
		velocidade = velocidade + potencia;
	}
	
	void frear() {
		velocidade = velocidade / 2;
	}
	
	float getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " +nome+ " esta a uma velocidade de " +velocidade+ "KM/h");
	}

}
