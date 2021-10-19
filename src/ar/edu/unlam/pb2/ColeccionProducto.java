package ar.edu.unlam.pb2;

import java.util.Set;

public class ColeccionProducto {
	/*ATRIBUTOS*/
	private Set<Producto> productos;

	/*CONSTRUCTORES*/
	private ColeccionProducto(){}
	
	/*BUSCAR PRODUCTO*/
	public Boolean buscaProducto(Producto producto) throws ProductoInexistenteException{
	}
	
	/*GUARDAR PRODUCTO EXISTENTE*/
	public void guardaProductoExistente(Producto producto){

	}
	
	/*ALTA DE PRODUCTO*/
	public Boolean altaProducto(Producto producto)throws ProductYaExisteException{

     } 
	
	/*LISTADO DE PRODUCTOS*/
	public Set<Producto> verProductos(){

	}
	
	/*BAJA DE PRODUCTO*/
	public Boolean bajaProducto(Producto producto)throws ProductoInexistenteException{

    }

	/*MODIFICACION DE PRODUCTO*/
	public void modificacionProducto(Producto producto){

    }
	
	/*LISTADO DE PRODUCTOS POR CATEGORIA*/
	public Set<Producto> verProductosPorCategoria(Producto producto, String categoria){

	}
	
	/*LISTADO DE NOVEDADES*/
	public Set<Producto> verProductosNovedades(Producto producto){

	}
	
	/*GETTERS Y SETERS*/


	/*EQUALS Y HASHCODE*/
}
