package br.gov.serpro;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CompraTest {

	@Test
	public void compraAVista() {
		Compra compraV = new Compra(460);
		assertEquals(1, compraV.getNroParcelas());
		assertEquals(460, compraV.getValorTotal());
		assertEquals(460, compraV.getValorParcela());		
	}

	@Test
	public void compraAPrazo() {
		Compra compraV = new Compra(10, 460);
		assertEquals(10, compraV.getNroParcelas());
		assertEquals(460, compraV.getValorTotal() );
		assertEquals(46, compraV.getValorParcela());		
	}
}
