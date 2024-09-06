package com.poo.app;

public class Cliente extends Pessoa implements Login{

    @Override
    public void imprimeFicha() {
        System.out.println("FICHA DO CLIENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Endereço: " + getEndereco().getLogradouro());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }

    @Override
    public boolean acessoPermitido(String login, String senha) {
        // Escopo de funcionalidades que o cliente tem acesso
        if(login.equals(getLogin()) && senha.equals(getSenha())){
            return true;
        }
        return false;
    }
}
