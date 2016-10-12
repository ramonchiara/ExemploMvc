package br.pro.ramon.mvc.views.console;

import br.pro.ramon.mvc.controllers.ClienteController;
import br.pro.ramon.mvc.models.Cliente;
import java.util.List;

public class ClientesView {

    private List<Cliente> model;
    private ClienteController controller;

    public ClientesView(List<Cliente> model, ClienteController controller) {
        this.model = model;
        this.controller = controller;
    }

    public void showClientes() {
        for (Cliente cliente : model) {
            System.out.printf("%04d - %s%n", cliente.getId(), cliente.getNome());
        }
    }

}
