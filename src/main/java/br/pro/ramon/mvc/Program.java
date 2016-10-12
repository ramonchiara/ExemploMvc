package br.pro.ramon.mvc;

import br.pro.ramon.mvc.controllers.ClienteController;

public class Program {

    public static void main(String[] args) {
        ClienteController controller = new ClienteController();
        controller.showMenu();
    }

}
