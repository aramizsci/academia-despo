package br.gov.serpro;

public class Cofre {
	int quantMoedasUm;
	int quantMoedasCinco;
	int quantMoedasDez;
	int quantMoedasVinteCinco;
	int quantMoedasCincoenta;
	int quantMoedasUmReal;
	static int quantTotalMoedas = 0;
	static double valorTotal = 0;
	int maxMoedas = 10;
	
	public void contadorMoedas(Moeda moeda) {
		quantTotalMoedas = quantTotalMoedas + 1;
		
		if (moeda.valorMoeda == 0.01) {
			quantMoedasUm++;
		}else if (moeda.valorMoeda == 0.05) {
			quantMoedasCinco++;
		}else if (moeda.valorMoeda == 0.10) {
			quantMoedasDez++;
		}else if (moeda.valorMoeda == 0.25) {
			quantMoedasVinteCinco++;
		}else if (moeda.valorMoeda == 0.50) {
			quantMoedasCincoenta++;
		}else if (moeda.valorMoeda == 1.00) {
			quantMoedasUmReal++;
		}		
	}
	
	public String depositaMoeda(Moeda moeda) {
		if (quantTotalMoedas <= 10) {
			valorTotal = valorTotal + moeda.valorMoeda;
			contadorMoedas(moeda);			
		} else {
			return "O cofre não suporta mais moedas";
		}
		return "Deposito OK";

	}
	
	public String moedaMaiorValor() {		
		if (quantMoedasUmReal != 0) {
			return "A maior moeda depositada é de: R$ 1.00";
		}else if (quantMoedasCincoenta !=0) {
			return "A maior moeda depositada é de: R$ 0.50";
		}else if (quantMoedasVinteCinco != 0) {
			return "A maior moeda depositada é de: R$ 0.25";
		}else if (quantMoedasDez !=0) {
			return "A maior moeda depositada é de: R$ 0.10";
		}else if (quantMoedasCinco !=0) {
			return "A maior moeda depositada é de: R$ 0.05";
		}else if (quantMoedasUm !=0) {
			return "A maior moeda depositada é de: R$ 0.01";
		}else 
			return "Nenhuma moeda foi depositada";		
		
	}
	
	public int getquantTotalMoedas() {
		return quantTotalMoedas;
	}
	
	public int getquantMoedasUm() {
		return quantMoedasUm;
	}
	
	public int getquantMoedasCinco() {
		return quantMoedasCinco;
	}
		
	public int getquantMoedasDez() {
		return quantMoedasDez;
	}
	
	public int getquantMoedasVinteCinco() {
		return quantMoedasVinteCinco;
	}
	
	public int getquantMoedasCincoenta() {
		return quantMoedasCincoenta;
	}
	
	public int getquantMoedasUmReal() {
		return quantMoedasUmReal;
	}
}
