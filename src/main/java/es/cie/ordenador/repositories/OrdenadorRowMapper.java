package es.cie.ordenador.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import es.cie.ordenador.negocio.Ordenador;

public class OrdenadorRowMapper implements RowMapper<Ordenador>{

    @Override
    public Ordenador mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Ordenador(rs.getInt("numero"),
        rs.getString("marca"),rs.getString("modelo"),
        rs.getInt("precio"));
    }

    
}
