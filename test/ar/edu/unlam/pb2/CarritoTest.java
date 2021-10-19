package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.exceptions.ProductYaExisteException;
import ar.edu.unlam.pb2.exceptions.ProductoInexistenteException;
import ar.edu.unlam.pb2.exceptions.StockNegativoException;

public class CarritoTest {

	@Test (expected= StockNegativoException.class)
	public void testQueVerificaQueElStockNoPuedeSerNegativo() throws ProductYaExisteException, StockNegativoException {
		Stock stock=new Stock();
		Color color=new Color("Rojo");
		Talle talle=new Talle("M");
		Categoria categoria=new Categoria("Invierno");
		Producto producto=new Producto(1,"Campera","Rompeviento",color,talle,170.0F,categoria,false);
	
		stock.agregarProducto(producto);
		stock.agregarStock(producto, 10);
		stock.revertirStock(producto, 15);
	}

	@Test (expected= ProductYaExisteException.class)
	public void testQueVerificaQueElProductoYaExiste() throws ProductYaExisteException, StockNegativoException {
		Stock stock=new Stock();
		Color color=new Color("Rojo");
		Talle talle=new Talle("M");
		Categoria categoria=new Categoria("Invierno");
		Producto producto=new Producto(1,"Campera","Rompeviento",color,talle,170.0F,categoria,false);
		Producto producto2=new Producto(1,"Campera","Rompeviento",color,talle,170.0F,categoria,false);
	
		stock.agregarProducto(producto);
		stock.agregarProducto(producto2);
	
	}
	
	@Test (expected=ProductoInexistenteException.class)	
	public void testQueVerificaQueElProductoEsInexistente() throws ProductoInexistenteException {
		Stock stock=new Stock();
		Color color=new Color("Rojo");
		Talle talle=new Talle("M");
		Categoria categoria=new Categoria("Invierno");
		Producto producto=new Producto(1,"Campera","Rompeviento",color,talle,170.0F,categoria,false);
	
		stock.buscaProductoEnStock(producto);
	
}
	@Test
	public void testQueVerificaQueElStockFueSumadoCorrectamente() throws ProductYaExisteException{
		Stock stock=new Stock();
		Color color=new Color("Rojo");
		Talle talle=new Talle("M");
		Categoria categoria=new Categoria("Invierno");
		Producto producto=new Producto(1,"Campera","Rompeviento",color,talle,170.0F,categoria,false);
		stock.agregarProducto(producto);
		stock.agregarStock(producto, 10);
		Integer valorEsperado=10;
		assertEquals(valorEsperado,stock.obtenerCantidad(producto));
	}
}
