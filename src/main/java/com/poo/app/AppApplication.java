package com.poo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

		// // Criando um novo cliente
		// Cliente cliente1 = new Cliente();
		// cliente1.nome = "Marina Mayumi";
		// cliente1.cpf = "12345678900";
		// cliente1.dataNascimento = "01/01/2000";
		// cliente1.login = "marina@gmail.com";	
		// cliente1.senha = "mayumi";		
		// cliente1.email = "marina@gmail.com";	
		// cliente1.telefone = "24999998888";	

		// // Instanciando um novo objeto end do tipo endereco
		// Endereco end = new Endereco();

		// // Alimentando o objeto end antes de atribuir.
		// end.cep = "20.202-202";
		// end.bairro = "Cascatinha";
		// end.cidade = "Petrópolis";
		// // ...

		// // Atribuição do end para o atributo endereco da classe
		// // cliente1
		// cliente1.endereco = end;

		// // Instanciar uma conta
		// Conta conta1 = new Conta(cliente1, "corrente");
		// Conta conta2 = new Conta();

		// conta1.setClassificacao('B');

		// conta1.exibeDadosDaConta();
		// conta2.exibeDadosDaConta();

		// System.out.println(cliente1.nome);
		// System.out.println(Conta.contadorId);


		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();

		System.out.println(Conta.contadorId);
		System.out.println(conta1.getId());
		System.out.println(conta2.getId());
		System.out.println(conta3.getId());
		System.out.println();
		System.out.println(Conta.contadorNumero);
		System.out.println(conta1.getNumero());
		System.out.println(conta2.getNumero());
		System.out.println(conta3.getNumero());
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// 1) Escrever as classes do projeto
		// 2) Os atributos das classes privados e escrever os Gets e Sets
		// 3) Escreve os construtores
		// 4) As particularidades de cada classe
	}
}

