package co.edu.udea.iw.dto;
/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * 
 * La clase Ciudad corresponde al DTO Para la tabla ciudad
 */
public class Ciudad {
	
	//codigo de la ciudad en la BD
	private long codigo;
	//Nombre completo de la ciudad
	private String nombre;
	//Codigo o indicativo para llamadas
	private String codigoArea;
	
	/**
	 * Metodo get para obtener el codigo de la tabla ciudad
	 * @return un atributo long del codigo de la tabla ciudad
	 */
	public long getCodigo() {
		return codigo;
	}
	/**
	 * Metodo set para modificar el codigo de la tabla ciudad
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	/**
	 * Metodo get para obtener el nombre de la tabla ciudad
	 * @return retorna un String nombre de la tabla ciudad
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo set para modificar el atributo nombre de la tabla ciudad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo get para obtener el codigo de area de una ciudad de la tabla ciudad
	 * @return retorna un String correspondiente al codigo de area de una ciudad
	 */
	public String getCodigoArea() {
		return codigoArea;
	}
	/**
	 * Metodo set para modificar el codigo de area de la tabla ciudad
	 */
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

}
