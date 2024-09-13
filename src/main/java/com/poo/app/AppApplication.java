package com.poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class AppApplication {

	public static int tentativas = 3;  
	public static Pessoa usuarioLogado;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		Gerente g = new Gerente();
		g.setNome("Thaís Santos");
		g.setLogin("thais.gerente@banco.com");
		g.setSenha("1234");
		Pessoa.listaDeUsuarios.add(g);


		// Menu incial
		// Pergunta login e senha

		while(tentativas > 0){
			Scanner sc = new Scanner(System.in);
			System.out.println(" - Login - ");
			System.out.print("Login: ");
			String loginDigitado = sc.nextLine();
			System.out.print("Senha: ");
			String senhaDigitada = sc.nextLine();
	
			if( autorizaCredenciais(loginDigitado, senhaDigitada) ){
				usuarioLogado.login();
			} else if ( tentativas > 1){
				System.out.println("Login ou senha incorretos!");
				tentativas--;
				System.out.println(tentativas + " tentativas restantes");
			} else {
				tentativas--;
				System.out.println("Cadastro bloqueado!");
			}
		}
	}

	public static boolean autorizaCredenciais(String loginDigitado, String senhaDigitada) {
		// Verificação das credenciais digitadas
		// Percorres a lista de Gerentes
		for (Pessoa p : Pessoa.listaDeUsuarios) {
			// Tenho que pegar o login e senha do g e comparar com os digitados
			if (p.getLogin().equals(loginDigitado) && p.getSenha().equals(senhaDigitada)) {
				usuarioLogado = p;
				return true;
			}
		}
		return false;
	}
}
