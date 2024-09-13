package com.poo.app;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class Pessoa implements Login{

    public static ArrayList<Pessoa> listaDeUsuarios = new ArrayList<>();

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
