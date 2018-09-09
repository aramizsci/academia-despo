package br.gov.serpro;

public class Pizza {
   String sabor;
   double valor;
   
   public Pizza(String sabor) {
	   this.sabor = sabor;
   }
   
   public double cauculaTotal() {
	   if (sabor == "Mussarela") {
		   valor = 20.00;
	   }else if (sabor == "Calabresa") {
		   valor = 21.00;	   
	   }else if (sabor == "Fgo/Catupiry") {
		   valor = 25.00;
	   }
	   return valor;
   }
}
