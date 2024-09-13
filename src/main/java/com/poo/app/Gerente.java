package com.poo.app;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

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
