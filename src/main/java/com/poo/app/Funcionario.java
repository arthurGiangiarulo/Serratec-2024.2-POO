package com.poo.app;

public abstract class Funcionario extends Pessoa{
    private String matricula;
    private String dataAdminssao;
    private String dataPromocao;
    private double salario;
    private Agencia agenciaAlocado;

    private String login;
    private String senha;

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataAdminssao() {
        return dataAdminssao;
    }
    public void setDataAdminssao(String dataAdminssao) {
        this.dataAdminssao = dataAdminssao;
    }
    public String getDataPromocao() {
        return dataPromocao;
    }
    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Agencia getAgenciaAlocado() {
        return agenciaAlocado;
    }
    public void setAgenciaAlocado(Agencia agenciaAlocado) {
        this.agenciaAlocado = agenciaAlocado;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }   
}
