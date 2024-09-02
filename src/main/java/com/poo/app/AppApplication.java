package com.poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		ClientePessoaFisica cliente = new ClientePessoaFisica();
		cliente.nome = "Marina Mayumi";
		cliente.cpf = "12345678900";
		cliente.dataNascimento = "01/01/2000";
		cliente.login = "marina@gmail.com";	
		cliente.senha = "mayumi";		
		cliente.email = "marina@gmail.com";	
		cliente.telefone = "24999998888";	

		cliente.imprimeFicha();

		// ClientePessoaJuridica, Gerente, Atendente, Agencia, Conta
		
	}
}

