package com.poo.app;

public class ContaPoupanca extends Conta implements TransacaoComplexa{

    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public void pix(double valor, String chavePix){
        System.out.println("Pix de R$ " + valor + " para " + chavePix + " realizado com sucesso!");
    }

    public void transferir(double valor, Conta contaDestino){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
        }
    }
}
