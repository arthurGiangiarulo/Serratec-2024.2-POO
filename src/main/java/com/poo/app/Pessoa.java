package com.poo.app;

import lombok.Data;

@Data
public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento; 
    private Endereco endereco;
    private String email;
    private String telefone;

    private String login;
    private String senha;
}
