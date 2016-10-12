package br.pro.ramon.mvc.views.console;

import br.pro.ramon.mvc.controllers.ClienteController;
import java.util.Scanner;

public class MenuView {

    private ClienteController controller;

    public MenuView(ClienteController controller) {
        this.controller = controller;
    }

    public void showMenu() {
        Scanner console = new Scanner(System.in);

        boolean sair = false;
        do {
            System.out.println("Menu Principal");
            System.out.println("--------------");
            System.out.println("1 - Listar Clientes");
            System.out.println("2 - Sair");
            System.out.println();
            System.out.print("Sua opção: ");
            String opcao = console.nextLine();
            System.out.println();

            switch (opcao) {
                case "1":
                    controller.showClientes();
                    break;
                case "2":
                    sair = true;
                    break;
            }
            
            System.out.println();
        } while (!sair);
    }

    public void showErro() {
        System.out.println("Erro!");
    }

}
