package com.poo.app;

// Resolver o problema das especificidades de cada tipo de conta com herança
public class Conta {

    // Atributos
    private int id; // Geração automática
    private String numero; // Geração automática
    private Agencia agencia; // Associada a agencia do Gerente
    private Cliente titular; // Gerene informa o titular
    private String dataAbertura; // Data de abertura do momento
    private String tipo; //poupança, salário, corrente // Gerente informa
    private double saldo; // Saldo = 0
    private char classificacao; // (A), B, C ou D
    private String status; // Bloqueada, (Ativa), Em Análise, Suspensa(30 dias...), Inativa

    // Construtores
    public Conta(Cliente cliente, String tipo){
        this.id = 1; // O próximo deve ser 2
        this.saldo = 0;
        this.dataAbertura = "03/09/2024";
        this.numero = "1234-0"; // A próxima deve ser 1235-0
        this.classificacao = 'A';
        this.status = "Ativa";
        this.titular = cliente;
        this.tipo = tipo;
    }
    public Conta(){
        
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        // Determinar como eu posso alterar o atributo saldo
        // Dupla autenticacao (Gerente geral e mais um gerente)
        this.saldo = saldo;
    }

    public char getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // Outros Métodos
    public void exibeSaldo(){
        System.out.println("Conta: " + this.numero);
		System.out.println("Titular: " + this.titular.nome);
		System.out.println("Saldo : R$" + this.saldo);
    }

    public void exibeDadosDaConta(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Saldo : R$" + this.saldo);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Classificação: " + this.classificacao);
        System.out.println("Status: " + this.status);
    }
}
