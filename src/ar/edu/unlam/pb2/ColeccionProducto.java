package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.exceptions.ProductYaExisteException;
import ar.edu.unlam.pb2.exceptions.ProductoInexistenteException;

public class ColeccionProducto {
	/*ATRIBUTOS*/
	private Set<Producto> productos;

	/*CONSTRUCTORES*/
	public ColeccionProducto(){
		this.productos=new HashSet<>();
	}
	
	/*BUSCAR PRODUCTO*/
	public Boolean buscaProducto(Producto producto) throws ProductoInexistenteException{
		if(this.productos.contains(producto)){
			return true;
		}else {
			throw new ProductoInexistenteException();
		}

	}
	
	/*GUARDAR PRODUCTO EXISTENTE*/
	public void guardaProductoExistente(Producto producto){
		if(this.productos.contains(producto)) {
			this.productos.add(producto);
		}
	}
	
	/*ALTA DE PRODUCTO*/
	public Boolean altaProducto(Producto producto)throws ProductYaExisteException{
		if(this.productos.contains(productos)) {
			throw new ProductYaExisteException();
		}
		this.productos.add(producto);
    return true; 
	} 
	
	/*LISTADO DE PRODUCTOS*/
	public Set<Producto> verProductos(){

	return this.productos;
	}
	
	/*BAJA DE PRODUCTO*/
	public Boolean bajaProducto(Producto producto)throws ProductoInexistenteException{
		if(this.productos.contains(producto)) {
			this.productos.remove(producto);
			return true;	
		}else {
			throw new ProductoInexistenteException();
		}

    }

	/*MODIFICACION DE PRODUCTO*/
	public void modificacionProducto(Producto producto){

    setProductos(productos);
	}
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA*/
	public Set<Producto> verProductosPorCategoria(Producto producto, String categoria){

	}
	
	/*LISTADO DE NOVEDADES*/
	public Set<Producto> verProductosNovedades(Producto producto){

	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productos == null) ? 0 : productos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColeccionProducto other = (ColeccionProducto) obj;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		return true;
	}
	
	/*GETTERS Y SETERS*/


	/*EQUALS Y HASHCODE*/
}
