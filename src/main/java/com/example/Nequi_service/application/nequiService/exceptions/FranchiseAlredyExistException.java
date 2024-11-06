package com.example.Nequi_service.application.nequiService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FranchiseAlredyExistException extends FranchiseCustomeException{
    public FranchiseAlredyExistException(String message) {
        super(message);
    }
}
