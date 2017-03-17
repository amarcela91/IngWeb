
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.edu.udea.iw.exception.MyException;

/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @version1.0
 * 
 * Clase PruebaCiudades creada para consultar la lista de ciudades en la BD y mostrar
 * su resultado en consola
 */
public class PruebaCiudades {

	public static void main(String[] args) throws MyException {

		consultarCiudades();

	}

	/**
	 * Metodo que me permite consultar las ciudades en la BD Y Mostrar su codigo
	 * y su nombre en consola
	 * @throws ClassNotFoundException Error al no encontrar el driver de la base de datos
	 * @throws SQLException Error relacionado con el servidor de base de datos
	 */
	public static void consultarCiudades() throws MyException {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// URL conexion a la BD
		String url = "jdbc:mysql://localhost:3306/clase";
		// Usuario de la BD con que se va a conectar
		String usuario = "root";
		// Contraseña del usuario
		String pws = "1edison2";
		//consulta que permite seleccionar todos los elementos de la tabla ciudades
		String consulta = "SELECT * FROM Ciudades";

		try {
			// Va a cargar en el class Loader de la aplicacion el
			// driver de la BD que vamos a acceder
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			// Establece conexion con la BD, solicita 3 atributos
			con = DriverManager.getConnection(url, usuario, pws);

			// Preparar la consulta o sentencia que voy a ejecutar contra la BD
			ps = con.prepareStatement(consulta);
			// Obtener el resultado de la consulta en consola en objeto que se pueda iterar
			rs = ps.executeQuery();
			// iterar resultado
			while (rs.next()) {
				System.out.println(rs.getLong("codigo") + ": " + rs.getString("Nombre"));
			}
		} catch (ClassNotFoundException e) {
			throw new MyException("No se encontro el driver de la BD", e);
		} catch (SQLException e) {
			throw new MyException("Error en la conexion a la BD", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				throw new MyException("Error al intentar cerrar los recursos", e);
			}
		}
	}

}
