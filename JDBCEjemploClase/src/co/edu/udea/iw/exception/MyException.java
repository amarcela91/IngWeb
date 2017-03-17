package co.edu.udea.iw.exception;

/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * Clase MyException que hereda de la clase Exception y manejar� las excepciones del
 * proyecto
 */
public class MyException extends Exception {
	
	/**
	 * Metodo MyExcepti�n maneja excepciones con null como mensaje de detalle
	 */
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo MyExcepti�n(String arg0) maneja excepciones con mensaje especificado
	 * @param String con el mensaje del posible error
	 */	
	public MyException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo MyExcepti�n(Throwable arg0) maneja excepciones que muestra la causa y 
	 * el mensaje de la excepci�n.
	 * @param arg0 indica la causa del posible error
	 */
	public MyException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo MyExcepti�n(String arg0, Throwable arg1) construye una nueva excepci�n  
	 * con el mensaje indicado en el string y la causa en el arg1
	 * @param arg0 El mensaje detallado del posible error. 
	 * @param arg1 indica la causa del posible error.
	 */
	public MyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo MyExcepti�n(String arg0, Throwable arg1, boolean arg2, boolean arg3)   
	 * crea una nueva excepci�n con los paremetros enviados.
	 * @param arg0 El mensaje detallado del posible error. 
	 * @param arg1 indica la causa del posible error.
	 * @param arg2 indica si la supresi�n esta activada o desactivada
	 * @param arg3 indica si el seguimiento de la pila debe ser modificada o no
	 */
	public MyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
