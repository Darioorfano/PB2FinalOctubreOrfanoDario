package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.pb2.exceptions.ProductYaExisteException;
import ar.edu.unlam.pb2.exceptions.ProductoInexistenteException;
import ar.edu.unlam.pb2.exceptions.StockNegativoException;

public class Stock {
	/*ATRIBUTOS*/
	private Map<Producto, Integer> stock;
	
	/*CONSTRUCTORES*/
	public Stock(){
	this.stock=new HashMap<Producto,Integer>();
	}
	
	/*GETTERS Y SETTERS*/
	public Map<Producto, Integer> getStock() {
		return stock;
	}

	public void setStock(Map<Producto, Integer> stock) {
		this.stock = stock;
	}
	
	
	/*BUSCA PRODUCTO EN EL STOCK*/
	public Boolean buscaProductoEnStock(Producto producto)throws ProductoInexistenteException{
		if(this.stock.containsKey(producto)) {
			return true;
		}else {
			throw new ProductoInexistenteException();
		}

	}
	
	
	/*ALTA DE PRODUCTO EN EL STOCK*/
	public Boolean agregarProducto(Producto producto)throws ProductYaExisteException{
		if(this.stock.containsKey(producto)){
		    throw new ProductYaExisteException();
		}
		this.stock.put(producto, 0);
		return true;
	}
	
	/*BAJA DE PRODUCTO EN STOCK*/
	public Boolean eliminarProducto(Producto producto){
		if(this.stock.containsKey(producto)) {
			this.stock.remove(producto);
			return true;
			
		}
	return false;
	}
	
	/*LISTADO DE STOCK*/
	public Map<Producto, Integer> obtenerStock(){
return this.stock;
	}
	
	/*MUESTRA CANTIDAD DEL PRODUCTO*/
	public Integer obtenerCantidad(Producto producto){
	return this.stock.get(producto);
	}
	
	/*ALTA DE STOCK A PRODUCTO*/
	public Boolean agregarStock(Producto producto, Integer cantidad){	
		if(this.stock.containsKey(producto)) {
			Integer cantidadActual=this.stock.get(producto);
			cantidadActual+=cantidad;
		this.stock.put(producto, cantidadActual);
			return true;
		}
	return false;
	}
	
	
	/*REVIERTE ALTA DE STOCK A PRODUCTO ("EL STOCK NO PUEDE SER NEGATIVO") */
	public Boolean revertirStock(Producto producto, Integer cantidad)throws StockNegativoException{
		
		if(this.stock.containsKey(producto)) {
			Integer cantidadActual=this.stock.get(producto);
			
			if(cantidadActual>=cantidad) {
				cantidadActual-=cantidad;
				this.stock.put(producto, cantidadActual);
					return true;
				
			}else {
				throw new StockNegativoException();
			}
			
	
		}
	return false;
		
	}
	
	/*CARRITO (Baja la cantidad de stock)*/
	public Boolean comprarProducto(Producto producto, Integer cantidad){

	}

}
