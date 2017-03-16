package co.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.udea.iw.exception.MyException;

/*
 * Encargada de realizar conexiones a la BD
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * */
public class DataSource {
	
	public Connection getConnection() throws MyException{
		String url="jdbc:mysql://localhost:3306/clase";
		String usuario="root";
		String pws="1edison2";
		String consulta= "SELECT * FROM Ciudades";
		Connection con=null;

		try{
			// Va a cargar en el class Loader de la aplicacion el 
						//driver de la BD que vamos a acceder
						Class.forName("com.mysql.jdbc.Driver");
						//Establece conexion con la BD
						//Solicita 3 atributos
						//URL conexion a la BD
						//Usuario de la BD con que se va a conectar
						//Contraseña del usuario
						con= DriverManager.getConnection(url, usuario, pws);
		}catch(ClassNotFoundException e){
			throw new MyException("El driver de conexion a la BD no ha sido encontrado",e);
		}catch(SQLException e){
			throw new MyException("Ha ocurrido un error estableciendo conexion con la BD",e);
		}
		
		return con;
		
	}

}
