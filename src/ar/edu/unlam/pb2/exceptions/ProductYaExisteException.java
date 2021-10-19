package ar.edu.unlam.pb2.exceptions;

public class ProductYaExisteException extends Exception {

public ProductYaExisteException() {
	
super("El producto que trata agregar ya existe");
}

}
