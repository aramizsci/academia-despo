package br.gov.serpro.exercicios;

public class Principal {

	public static void main(String[] args) {
		Carros uno = new Carros();
		uno.potencia = 5;
		uno.nome = "Uno";
		uno.velocidade = 0;
		
		Carros gol = new Carros();
		gol.nome = "Gol";
		gol.potencia = 2;
		gol.velocidade = 0;
		
		uno.acelerar();
		uno.acelerar();
		uno.acelerar();
		gol.acelerar();
		gol.frear();
		
		uno.imprimir();
		gol.imprimir();
				
		
				
		
	}

}
