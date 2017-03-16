package co.edu.udea.iw.dto;
/*
 * DTO Para la tabla ciudad
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 */
public class Ciudad {
	
	//codigo de la ciudad en la BD
	private long codigo;
	//Nombre completo de la ciudad
	private String nombre;
	//Codigo o indicativo para llamadas
	private String codigoArea;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

}
