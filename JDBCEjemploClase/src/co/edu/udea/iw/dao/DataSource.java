package co.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.udea.iw.exception.MyException;

/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * Clase DataSource Encargada de realizar conexiones a la BD.
 * 
 */
public class DataSource {
	/**
	 * Metodo getConnection del tipo Connection que permite realizar la conexión a la
	 * base de datos.
	 * @throws ClassNotFoundException Error al no encontrar el driver de la base de datos
	 * @throws SQLException Error relacionado con el servidor de base de datos
	 * @return este metodo retorna un objeto Connection que indica
	 * la conexión a la base de datos.
	 */
	public Connection getConnection() throws MyException{
		
		//URL conexion a la BD
		String url="jdbc:mysql://localhost:3306/clase";
		//Usuario de la BD con que se va a conectar
		String usuario="root";
		//Contraseña del usuario
		String pws="1edison2";
		//consulta que permite seleccionar todos los elementos de la tabla ciudades
		String consulta= "SELECT * FROM Ciudades";
		Connection con=null;

		try{
				// Carga en el class Loader de la aplicacion el driver 
				//de la BD que vamos a acceder
				Class.forName("com.mysql.jdbc.Driver");									
						
				//Establece conexion con la BD y solicita tres atributos
				con= DriverManager.getConnection(url, usuario, pws);
		}catch(ClassNotFoundException e){
			throw new MyException("El driver de conexion a la BD no ha sido encontrado",e);
		}catch(SQLException e){
			throw new MyException("Ha ocurrido un error estableciendo conexion con la BD",e);
		}
		
		return con;
		
	}

}
