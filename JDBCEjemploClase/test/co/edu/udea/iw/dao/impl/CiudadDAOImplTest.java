package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import co.edu.udea.iw.dao.CiudadDao;
import co.edu.udea.iw.dao.impl.CiudadDAOImpl;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

/**
 * @author Adriana Guzman - amarcela.guzman@udea.edu.co
 * @since Java 1.8
 * @version 1.0
 * 
 * Clase CiudadDAOImplTest implementa la clase CiudadDao.
 * mostrando el codigo y nombre de la ciudad en consola.
 */
public class CiudadDAOImplTest {

	@Test
	/**
	 * Metodo que realiza el test del proyecto.
	 */
	public void testGet() {
		
		CiudadDao ciudadDao=null;
		List<Ciudad> ciudades=null;
		
		try{
			ciudadDao=new CiudadDAOImpl();
			ciudades=ciudadDao.get();
			
			for(Ciudad ciudad: ciudades){
				System.out.println(ciudad.getCodigo() +" : " +ciudad.getNombre());
			}
			
			assertTrue(ciudades.size()>0);
			
		}catch (MyException e){
			fail(e.getMessage());
		}
	}

}
