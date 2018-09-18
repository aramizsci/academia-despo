package br.gov.serpro;

public class Principal {

	public static void main(String[] args) {
				
		Moeda umReal = new Moeda();
		umReal.valorMoeda = 1.00;
		
		Moeda cincoenta = new Moeda();
		cincoenta.valorMoeda = 0.50;
		
		Moeda vinteCinco = new Moeda();
		vinteCinco.valorMoeda = 0.25;
		
		Moeda dez = new Moeda();
		dez.valorMoeda = 0.10;
		
		Moeda cinco = new Moeda();
		cinco.valorMoeda = 0.05;
		
		Moeda um = new Moeda();
		um.valorMoeda = 0.01;	

		Cofre meuCofre = new Cofre();
		
		meuCofre.depositaMoeda(umReal);
		meuCofre.depositaMoeda(vinteCinco);
		meuCofre.depositaMoeda(um);
		meuCofre.depositaMoeda(cinco);
		meuCofre.depositaMoeda(umReal);
		meuCofre.depositaMoeda(vinteCinco);
		meuCofre.depositaMoeda(cinco);
		meuCofre.depositaMoeda(dez);
		meuCofre.depositaMoeda(umReal);
		meuCofre.depositaMoeda(vinteCinco);
		meuCofre.depositaMoeda(umReal);
		meuCofre.depositaMoeda(vinteCinco);
		meuCofre.depositaMoeda(umReal);
		meuCofre.depositaMoeda(vinteCinco);
		
		System.out.println(meuCofre.moedaMaiorValor());
		System.out.println("O total depositado é de:  " +meuCofre.valorTotal);
		System.out.println("Foram colocadas "+ meuCofre.getquantTotalMoedas()+" moedas no Cofre");
	}

}
