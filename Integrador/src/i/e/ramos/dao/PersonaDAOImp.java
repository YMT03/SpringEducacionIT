package i.e.ramos.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import i.e.ramos.bo.Persona;

@Repository
public class PersonaDAOImp implements PersonaDAO {
	
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addPersona(Persona persona) {
		String sql = "INSERT INTO PERSONA (nombre, apellido) VALUES (?, ?)";
		jdbcTemplate.update(sql, persona.getNombre(), persona.getApellido());
	}

	public Persona getPersona(long id) {
		String sql = "SELECT idpersona, nombre, apellido FROM PERSONA WHERE idpersona = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Persona>(){
			public Persona mapRow(ResultSet resultSet, int i) throws SQLException {
				Persona persona = new Persona();
				persona.setIdPersona(resultSet.getLong("idpersona"));
				persona.setNombre(resultSet.getString("nombre"));
				persona.setApellido(resultSet.getString("apellido"));
				return persona;
			}
		});
	}

	public List<Persona> getAllPersonas() {
		String sql = "SELECT idpersona, nombre, apellido FROM PERSONA";
		return jdbcTemplate.query(sql, new RowMapper<Persona>(){
			public Persona mapRow(ResultSet resultSet, int i) throws SQLException {
				Persona persona = new Persona();
				persona.setIdPersona(resultSet.getLong("idpersona"));
				persona.setNombre(resultSet.getString("nombre"));
				persona.setApellido(resultSet.getString("apellido"));
				return persona;
			}
		});
	}

	public void removePersona(long id) {
		String sql = "DELETE FROM PERSONA WHERE idPersona = ? ";
		jdbcTemplate.update(sql, id);
		
	}

	public void updatePersona(Persona persona) {
		String sql = "UPDATE Persona set nombre = ?, apellido = ? where idpersona = ?";
		jdbcTemplate.update(sql,persona.getNombre(), persona.getApellido(), persona.getIdPersona());
	}


}
