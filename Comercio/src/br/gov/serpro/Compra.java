package br.gov.serpro;

import java.awt.font.NumericShaper;

public class Compra {
	int valorTotal;
	int nroParcelas;
	
	//a vista
	public Compra(int valorTotal) {
		this.valorTotal = valorTotal;
		nroParcelas = 1;				
	}
	
	//a prazo
	public Compra(int nroParcelas, int valorTotal) {
		this.nroParcelas = nroParcelas;
		this.valorTotal = valorTotal;
	}
	
	public int getValorTotal() {
		return valorTotal;
	}
	
	public int getNroParcelas() {
		return nroParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/nroParcelas;
				
	}

}
