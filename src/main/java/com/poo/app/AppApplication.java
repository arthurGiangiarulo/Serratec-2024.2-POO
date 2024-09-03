package com.poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		Cliente cliente = new Cliente();
		cliente.nome = "Marina Mayumi";
		cliente.cpf = "12345678900";
		cliente.dataNascimento = "01/01/2000";
		cliente.login = "marina@gmail.com";	
		cliente.senha = "mayumi";		
		cliente.email = "marina@gmail.com";	
		cliente.telefone = "24999998888";	

		// Instanciando um novo objeto end do tipo endereco
		Endereco end = new Endereco();

		// Alimentando o objeto end antes de atribuir.
		end.cep = "20.202-202";
		end.bairro = "Cascatinha";
		end.cidade = "Petrópolis";
		// ...

		// Atribuição do end para o atributo endereco da classe
		// Cliente
		cliente.endereco = end;
		
		// cliente.endereco.cep = "20.202-202";
		// cliente.endereco.bairro = "Cascatinha";
		// cliente.endereco.cidade = "Petrópolis";

		cliente.imprimeFicha();

		// Gerente, Atendente, Agencia, Conta
	}
}

