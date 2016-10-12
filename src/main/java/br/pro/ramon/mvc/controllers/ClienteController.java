package br.pro.ramon.mvc.controllers;

import br.pro.ramon.mvc.daos.ClienteDao;
import br.pro.ramon.mvc.daos.DaoException;
import br.pro.ramon.mvc.daos.DaoFactory;
import br.pro.ramon.mvc.models.Cliente;
import br.pro.ramon.mvc.views.console.ClientesView;
import br.pro.ramon.mvc.views.console.MenuView;
import java.util.List;

public class ClienteController {

    private MenuView menuView = new MenuView(this);

    public void showMenu() {
        menuView.showMenu();
    }

    public void showClientes() {
        try {
            ClienteDao dao = DaoFactory.getClienteDao();
            List<Cliente> model = dao.findAll();
            ClientesView view = new ClientesView(model, this);
            view.showClientes();
        } catch (DaoException ex) {
            menuView.showErro();
        }
    }

}
