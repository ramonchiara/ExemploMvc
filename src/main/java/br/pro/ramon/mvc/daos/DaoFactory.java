package br.pro.ramon.mvc.daos;

import br.pro.ramon.mvc.daos.memory.ClienteDaoMemory;

public abstract class DaoFactory {

    public static ClienteDao getClienteDao() {
        return new ClienteDaoMemory();
    }

}
