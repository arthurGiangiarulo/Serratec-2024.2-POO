package com.poo.app;

// Resolver o problema das especificidades de cada tipo de conta com herança
public abstract class Conta {
    public static int contadorId = 1;
    public static int contadorNumero = 1000;

    // Atributos
    private int id; // Geração automática
    private String numero; // Geração automática
    private Agencia agencia; // Associada a agencia do Gerente
    private Cliente titular; // Gerene informa o titular
    private String dataAbertura; // Data de abertura do momento
    private double saldo; // Saldo = 0
    private String status; // Bloqueada, (Ativa), Em Análise, Suspensa(30 dias...), Inativa

    // Construtores
    public Conta(Cliente cliente){
        this.id = contadorId;
        contadorId++;
        this.saldo = 0;
        // this.dataAbertura; // Rode um comando que busque a data daquele momento
        this.numero = (contadorNumero + "-0"); // A próxima deve ser 1001-0
        contadorNumero++;
        this.status = "Ativa";
        // As informações que são passadas no momento em que o objeto é instanciado
        this.titular = cliente;
    }

    public Conta(){
        this.id = contadorId;
        contadorId++;

        this.numero = (contadorNumero + "-0");
        contadorNumero++;
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

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        // Determinar como eu posso alterar o atributo saldo
        // Dupla autenticacao (Gerente geral e mais um gerente)
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // Outros Métodos
    public void exibeDadosDaConta(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Saldo : R$" + this.saldo);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Status: " + this.status);
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }
    }
}
