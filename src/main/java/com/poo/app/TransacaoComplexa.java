package com.poo.app;

public interface TransacaoComplexa {

    void pix(double valor, String chavePix);

    void transferir(double valor, TransacaoComplexa contaDestino);

    void depositar(double valor);

}
