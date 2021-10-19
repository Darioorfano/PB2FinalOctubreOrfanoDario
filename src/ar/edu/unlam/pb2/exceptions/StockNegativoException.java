package ar.edu.unlam.pb2.exceptions;

public class StockNegativoException extends Exception {

public StockNegativoException() {
	
	super("El stock no puede ser negativo");
}
}
