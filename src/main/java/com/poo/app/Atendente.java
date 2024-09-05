package com.poo.app;

public class Atendente extends Funcionario {

    @Override
    public void imprimeFicha() {
        System.out.println("FICHA DO ATENDENTE");
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

}
