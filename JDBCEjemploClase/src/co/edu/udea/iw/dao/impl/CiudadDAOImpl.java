package co.edu.udea.iw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.udea.iw.dao.CiudadDao;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.dao.DataSource;

/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * Implementacion de la interface (@link CiudadDao)
 * Clase CiudadDaoImple que hereda atributos y metodos de la clase DataSource,
 * esta clase es la que permite tener la información de la base de datos y 
 * mostrarla de forma organizada - alfabeticamente.
 */
public class CiudadDAOImpl extends DataSource implements CiudadDao {

	@Override
	/**
	 * Metodo que se conecta a la base de datos, realiza la consulta sobre la tabla
	 * ciudades y las almacena en un arreglo de listas.
	 * @return retorna la lista de ciudades organizada alfabeticamente.
	 */
	public List<Ciudad> get() throws MyException {
		//el objeto ciudades es un ArrayList con la lista de ciudades que se encuentran en
		//la base de datos.
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try{
			//Se establece la conexion con la base de datos, se asigna y se ejecuta
			//la respectiva instrucción sql.
			con=getConnection();
			ps=con.prepareStatement("SELECT * FROM ciudades ORDER BY Nombre");
			rs=ps.executeQuery();
			
			//se pregunta en la base de datos si existe un elemento siguiente a analizar
			while(rs.next()){
				//objeto de la clase Ciudad
				Ciudad ciudad=new Ciudad();
				//se obtienen los atributos de la tabla ciudades, que posteriormente
				//serán almacenados en el arrayList.
				ciudad.setCodigo(rs.getLong("Codigo"));
				ciudad.setNombre(rs.getString("Nombre"));
				ciudad.setCodigoArea(rs.getString("CodigoArea"));
				ciudades.add(ciudad);
			}
		}catch(SQLException e){
			throw new MyException("Ocurrio un error obteniendo la informacion de ciudades");
		}finally{
			//se cierran los recursos.
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
				throw new MyException("Ocurrio un error cerrando la conexion a la BD",e);
			}
		}
		return ciudades; 
	}

}
