package com.andersenlab.rmtbanking.depositservice.service.exeption;

public class AgreementNotFoundException extends RuntimeException {

    public AgreementNotFoundException(String massage) {
        super(massage);
    }
}