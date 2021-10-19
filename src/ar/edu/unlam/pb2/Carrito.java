package ar.edu.unlam.pb2;
import java.util.Map;

public class Carrito {
	/*ATRIBUTOS*/
	private Map<Producto, Integer> carrito;
	
	/* CONSTRUCTORES*/
	private Carrito(){
		this.carrito=new HashMap<Producto,Integer>();
		
	}

	/*AGREGAR PRODUCTOS AL CARRITO*/
	public void agregarProductosAlcarrito(Producto producto, Integer unidades){
		
	}
	
	/*LISTADO DE CARRITO*/
	public Map<Producto, Integer> listadoDeCarrito(){
		
	}
	
	/*MUESTRA CANTIDAD DEL PRODUCTO EN EL CARRITO*/
	public Integer obtenerCantidadDeProductoEnCarrito(Producto producto){
		
	}

	/*ELIMINAR DE PRODUCTO DEL CARRITO*/
	public void eliminarProductosDelCarrito(Producto producto, Integer cantidad){
		
	}
}
