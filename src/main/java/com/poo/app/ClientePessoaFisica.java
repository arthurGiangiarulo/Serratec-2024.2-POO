package com.poo.app;

public class ClientePessoaFisica {

    String nome;
    String cpf;
    String dataNascimento; 
    String login;
    String senha;
    String endereco;
    String email;
    String telefone;

    // Método
    void imprimeFicha(){
        System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println(this.login);
		System.out.println(this.senha);
		System.out.println(this.email);
		System.out.println(this.telefone);
    }

}
