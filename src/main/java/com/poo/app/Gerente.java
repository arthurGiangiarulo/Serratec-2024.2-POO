package com.poo.app;

public class Gerente extends Funcionario implements Login {

    @Override
    public void imprimeFicha() {
        System.out.println("FICHA DO GERENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Endereço: " + getEndereco().getLogradouro());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());

        // Dados do Funcionário
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Data de Admissão: " + getDataAdminssao());
        System.out.println("Data de Promoção: " + getDataPromocao());
        System.out.println("Salário: " + getSalario());
    }

    @Override
    public boolean acessoPermitido(String login, String senha) {
        // Escopo de funcionalidades que o gerente tem acesso
        if(login.equals(getLogin()) && senha.equals(getSenha())){
            return true;
        }
        return false;
    }

}
