package br.pro.ramon.mvc.daos;

import br.pro.ramon.mvc.models.Cliente;
import java.util.List;

public interface ClienteDao {

    public List<Cliente> findAll() throws DaoException;

}
