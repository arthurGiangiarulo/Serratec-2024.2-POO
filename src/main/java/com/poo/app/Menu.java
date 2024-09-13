package com.poo.app;

import java.util.Scanner;

public class Menu {
    // Menu Gerente
    public static void gerente() {
        System.out.println("Olá, " + AppApplication.usuarioLogado.getNome() + ".\n\n");

        int opcao = 8;
        do {
            System.out.println("\n- MENU -");
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastrar novo cliente");
            System.out.println("2- Atualizar cliente");
            System.out.println("3- Deletar cliente");
            System.out.println("4- Listar clientes");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            Scanner sc = new Scanner(System.in);

            // try {
            opcao = sc.nextInt();
            System.out.println("\n");

            switch (opcao) {
                case 1:
                    Cliente.cadastraNovoCliente();
                    break;
                case 2:
                    // Atualizar cliente
                    System.out.println("Atualizando cliente...");
                    break;
                case 3:
                    // Deletar cliente
                    System.out.println("Deletando cliente...");
                    break;
                case 4:
                    Cliente.imprimeListaDeClientes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            // } catch (DigitoInvalidoException e) {
            // System.out.println("Opção inválida! Digite um número inteiro");
            // e.imprimeErro(e);
            // }
        } while (opcao != 0);
    }
    // Menu Cliente
    public static void cliente(){
        System.out.println("Olá, " + AppApplication.usuarioLogado.getNome() + ".\n\n");
        
        System.out.println("\n- MENU -");
            System.out.println("O que deseja fazer?");
            System.out.println("1- Acessar saldo");
            System.out.println("2- Visualiza extrato");
            System.out.println("3- Pix");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
    }
}
