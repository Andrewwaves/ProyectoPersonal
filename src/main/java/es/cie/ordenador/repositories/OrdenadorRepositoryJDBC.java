package es.cie.ordenador.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.cie.ordenador.negocio.Ordenador;

@Repository
@Qualifier("jdbc")
public class OrdenadorRepositoryJDBC implements OrdenadorRepository {

    @Autowired
    private JdbcTemplate plantilla;

    @Override
    public List<Ordenador> buscarTodos() {
        return plantilla.query("select * from ordenadores", new OrdenadorRowMapper());
    }

    @Override
    public void insertar(Ordenador ordenador) {
       plantilla.update("insert into ordenadores values (?,?,?,?)",ordenador.getNumero(),ordenador.getMarca()
       ,ordenador.getModelo(),ordenador.getPrecio());
    }

    @Override
    public void borrar(Ordenador ordenador) {
        plantilla.update("delete from ordenadores where numero=?",ordenador.getNumero());
    }

    public List<Ordenador> filtrar(@Param("campo") String campo, @Param("valor") String valor) {
    return plantilla.query("SELECT o FROM Ordenador o WHERE o.:campo = :valor",new OrdenadorRowMapper());
    }
}
