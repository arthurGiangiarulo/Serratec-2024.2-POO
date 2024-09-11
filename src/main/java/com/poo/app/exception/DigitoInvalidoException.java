package com.poo.app.exception;

import java.util.InputMismatchException;

public class DigitoInvalidoException extends InputMismatchException{
    public DigitoInvalidoException(String mensagem) {
        super(mensagem);
    }
    public void imprimeErro(Exception e) {
        printStackTrace();
    }
}
