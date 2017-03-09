import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * Clase creada para consultar la lista de ciudades en la BD y mostrar
 * su resultado en consola
 * 
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 */
public class PruebaCiudades {

	public static void main(String[] args) {
		
		consultarCiudades();
				
	}
	
	/*
	 * Metodo que me permite consultar las ciudades en la BD Y Mostrar su codigo y su nombre
	 * en consola
	 * */
	public static void consultarCiudades(){
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String url="jdbc:mysql://localhost:3306/clase";
		String usuario="root";
		String pws="1edison2";
		String consulta= "SELECT * FROM Ciudades";
		
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
			
			//Preparar la consulta o sentencia que voy a ejecutar contra la BD
			ps = con.prepareStatement(consulta);
			//Obtener el resultado de la consulta en consola en objeto que se pueda iterar
			rs=ps.executeQuery();
			//iterar resultado
			while(rs.next()){
				System.out.println(rs.getLong("codigo") + ": "+ rs.getString("Nombre"));
			}
			}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(rs!=null){
						rs.close();
					}
					if(ps != null){
						ps.close();
					}
					if(con !=null){
						con.close();
					}
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
	}

}
