package br.gov.serpro;

public class Principal {
public static void main(String[] args) {

		
		Carrinho carrinhoPedido1 = new Carrinho();
		carrinhoPedido1.cliente = "Marco";
		Carrinho carrinhoPedido2 = new Carrinho();
		carrinhoPedido2.cliente = "Antonio";
		Carrinho carrinhoPedido3 = new Carrinho();
		carrinhoPedido3.cliente = "Maria";
		Carrinho carrinhoPedido4 = new Carrinho();
		carrinhoPedido4.cliente = "João";

		
		System.out.println("Cliente " + carrinhoPedido1.cliente + " O valor do seu pedido eh " + carrinhoPedido1.calculaPrecoTotal("Calabresa", 5, "diaUtil")+ "\n");
		
		System.out.println("Cliente " + carrinhoPedido2.cliente + " O valor do seu pedido eh " + carrinhoPedido2.calculaPrecoTotal("Mussarela", 6, "diaUtil")+ "\n");
		
		System.out.println("Cliente " + carrinhoPedido3.cliente + " O valor do seu pedido eh " + carrinhoPedido3.calculaPrecoTotal("Calabresa", 5, "naoDiaUtil")+ "\n");
		
		System.out.println("Cliente " + carrinhoPedido4.cliente + " O valor do seu pedido eh " + carrinhoPedido4.calculaPrecoTotal("Fgo/Catupiry", 6, "naoDiaUtil")+ "\n");



	}
}
