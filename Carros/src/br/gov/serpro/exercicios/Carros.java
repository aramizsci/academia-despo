package br.gov.serpro.exercicios;

public class Carros {
	int potencia;
<<<<<<< HEAD
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
=======
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade = velocidade + potencia;
	}
	
	void frear() {
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " +nome+ "esta a uma velocidade de " +velocidade+ "KM/h");
>>>>>>> branch 'master' of https://github.com/aramizsci/academia-despo
	}

}
