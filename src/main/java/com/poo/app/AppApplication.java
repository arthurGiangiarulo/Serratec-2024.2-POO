package com.poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		Gerente gerente = new Gerente();
		gerente.setNome("João");
		
		Atendente atendente = new Atendente();
		atendente.setNome("Maria");

		Cliente cliente = new Cliente();
		cliente.setNome("José");

		Conta conta = new Conta();
	}

}

