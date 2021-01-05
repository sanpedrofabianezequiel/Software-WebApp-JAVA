package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ar.com.educacionit.dao.UsuarioDao;
import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.exeptions.InvalidUserException;
import ar.com.educacionit.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.main.AdministradorConexiones;

public class UsuarioDaoJDBCImpl implements UsuarioDao {

	@Override
	public Usuario getByUserNameAndPassword(String username, String Password) throws InvalidUserException, SQLException {
		
		String sql= "SELECT * FROM USUARIOS WHERE USERNAME = ? AND PASSWORD = ?";
		Connection con= null;
		PreparedStatement st= null;
		ResultSet rs =null;
		
		
		try {
			con= AdministradorDeConexiones.obtenerConexion();
			con.setAutoCommit(false);
			
			st = con.prepareStatement(sql);//Le preparamos el Statemt
				//Le setiamos los aprametos
			st.setString(1, username);
			st.setString(2, Password);
			
			rs = st.executeQuery();
			
			Usuario u=null;
			if (rs.next()) {
				u=new  Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
			con.commit();
			return  u;
			
		} catch (Exception e) {
			//con.rollback();
			throw new InvalidUserException("Usuario/Paswwor invalido", e);
		}finally {
			if (rs!= null && !rs.isClosed()) {
				rs.close();
			}
		}
		
		
	
	}

}
