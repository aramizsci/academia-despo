package br.gov.serpro;

public class Somador {
	String nome;
	private int valorEstatico = 0;
	private static int valorInstancia = 0;
	

	public void somar() {
		valorEstatico++;
		valorInstancia++;
	}
	
	void imprimir() {
		System.out.println("O valor estatico �: "+valorEstatico+" e o de inst�ncia: "+valorInstancia);
	}		
}
