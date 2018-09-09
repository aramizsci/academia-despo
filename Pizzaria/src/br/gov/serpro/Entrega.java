package br.gov.serpro;

public class Entrega {
	double totalEntrega;
	String diaSemana;
	
	public double calculaTotal(double distancia, String diaSemana) {
		this.diaSemana = diaSemana;
		
		if (diaSemana == "diaUtil" && distancia <= 5 ) {
			totalEntrega = 1.0;
		}else if (diaSemana == "diaUtil" && distancia > 5) {
				totalEntrega = 5.0;
		}else if (diaSemana == "naoDiaUtil" && distancia <= 5) {
			totalEntrega = 10.0;
			
		}else if (diaSemana == "naoDiaUtil" && distancia > 5) {
			totalEntrega = 15.0;
		
		}
		
		return totalEntrega;
	}
}
