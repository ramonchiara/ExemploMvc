package br.pro.ramon.mvc.daos.memory;

import br.pro.ramon.mvc.daos.ClienteDao;
import br.pro.ramon.mvc.daos.DaoException;
import br.pro.ramon.mvc.models.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoMemory implements ClienteDao {

    private static List<Cliente> db = new ArrayList<>();

    public ClienteDaoMemory() {
        db.add(new Cliente(1, "Armando"));
        db.add(new Cliente(2, "Bruna"));
        db.add(new Cliente(3, "Carlos"));
        db.add(new Cliente(4, "Daniela"));
        db.add(new Cliente(5, "Ernesto"));
    }

    @Override
    public List<Cliente> findAll() throws DaoException {
        return db;
    }

}
