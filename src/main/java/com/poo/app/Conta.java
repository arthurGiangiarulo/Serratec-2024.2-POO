package com.poo.app;

// Resolver o problema das especificidades com herança
public class Conta {
    int id;
    String numero;
    Agencia agencia;
    Cliente titular; 
    String dataAbertura;
    String tipo; //poupança, salário, corrente
    double saldo;
    char classificacao; // A, B, C ou D
    String status; // Bloqueada, Ativa, Em Análise, Suspensa(30 dias...), Inativa

    // Métodos
    void exibeSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }
}
