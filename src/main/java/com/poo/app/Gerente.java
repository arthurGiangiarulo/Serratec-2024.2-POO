package com.poo.app;

import java.util.Scanner;

public class Gerente extends Funcionario implements Login {

    @Override
    public boolean acessoPermitido(String login, String senha) {
        // Escopo de funcionalidades que o gerente tem acesso
        if(login.equals(getLogin()) && senha.equals(getSenha())){
            return true;
        }
        return false;
    }

    public static void menuGerente(){
        int opcao;
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
			opcao = sc.nextInt();
            System.out.println("\n");

			switch(opcao){
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
		} while(opcao != 0);
    }
}
