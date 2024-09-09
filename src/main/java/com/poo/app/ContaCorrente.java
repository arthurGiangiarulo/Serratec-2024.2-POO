package com.poo.app;

public class ContaCorrente extends Conta implements TransacaoComplexa{

    private char classificacao; // (A), B, C ou D

    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public void pix(double valor, String chavePix){
        System.out.println("Pix de R$ " + valor + " para " + chavePix + " realizado com sucesso!");
    }

    public void transferir(double valor, TransacaoComplexa contaDestino){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            // contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
        }
    }
}
