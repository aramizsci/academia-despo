package br.gov.serpro;

public class Principal {

	public static void main(String[] args) {
		Somador testeA = new Somador();
		testeA.nome = "SomadorA";
		Somador testeB = new Somador();
		testeB.nome = "SomadorB";
		Somador testeC = new Somador();
		testeC.nome = "SomadorC";
		
		for (int i=0; i<3; i++) {
			testeA.somar();
			testeB.somar();
			testeC.somar();
		}
		
		testeA.imprimir();
		testeB.imprimir();
		testeC.imprimir();
	}

}
