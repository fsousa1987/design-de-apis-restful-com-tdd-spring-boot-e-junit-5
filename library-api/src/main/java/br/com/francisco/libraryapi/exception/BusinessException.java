package br.com.francisco.libraryapi.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String s) {
        super(s);
    }
}
