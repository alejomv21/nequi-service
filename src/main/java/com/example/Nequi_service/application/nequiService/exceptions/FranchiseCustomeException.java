package com.example.Nequi_service.application.nequiService.exceptions;

public class FranchiseCustomeException extends Exception{
    public FranchiseCustomeException() {
    }

    public FranchiseCustomeException(String message) {
        super(message);
    }

    public FranchiseCustomeException(String message, Throwable cause) {
        super(message, cause);
    }
}
