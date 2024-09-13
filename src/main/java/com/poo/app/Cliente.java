package com.poo.app;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    //Lista de clientes
    public static List<Cliente> listaDeClientes = new ArrayList<Cliente>();

    public boolean acessoPermitido(String login, String senha) {
        // Escopo de funcionalidades que o cliente tem acesso
        if(login.equals(getLogin()) && senha.equals(getSenha())){
            return true;
        }
        return false;
    }

    public static void imprimeListaDeClientes(){
        // Se a lista está vazia
        if(!Cliente.listaDeClientes.isEmpty()){
            System.out.println("Lista de clientes:");
            for(int i=0; i<Cliente.listaDeClientes.size(); i++) {
                System.out.println( (i+1) + "- " + Cliente.listaDeClientes.get(i).getNome());
            }
        } else {
            System.out.println("Não há clientes cadastrados.\n\n");
        }

    }

    public static void cadastraNovoCliente(){
        // Menu para cadastrar novo cliente
		System.out.println("- CADASTRANDO NOVO CLIENTE -");
		System.out.print("Nome: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		Cliente.listaDeClientes.add(cliente);
        System.out.println("\n");
    }
    public void login(){
        Menu.cliente();
    }
}
