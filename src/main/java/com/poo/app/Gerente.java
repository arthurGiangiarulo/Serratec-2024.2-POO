package com.poo.app;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

	// Cria lista de gerente
	public static List<Gerente> listaDeGerentes = new ArrayList<Gerente>();

    public boolean acessoPermitido(String login, String senha) {
        // Escopo de funcionalidades que o gerente tem acesso
        if(login.equals(getLogin()) && senha.equals(getSenha())){
            return true;
        }
        return false;
    }
	public void login(){
		Menu.gerente();
	}
}
