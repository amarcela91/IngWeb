package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.dto.Ciudad;

/**
 * Interface que me define los metodos permitidos para las ciudades
 * en el sistema
 *  @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
*/
public interface CiudadDao {
	/**Obtiene las listas de Ciudades que existen en el sistema
	 * ordenadas alfabeticamente por el nombre
	 * @return Lista de ciudades ordenadas
	 * @throws MyException ocurre cuando hay problemas con la conexion a la BD
	 */
	public List<Ciudad> get() throws MyException;

}
