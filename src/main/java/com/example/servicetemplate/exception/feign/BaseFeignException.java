package com.example.servicetemplate.exception.feign;

public class BaseFeignException extends RuntimeException{

    public BaseFeignException() {
        super();
    }

    public BaseFeignException(String message) {
        super(message);
    }

    public BaseFeignException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseFeignException(Throwable cause) {
        super(cause);
    }
}
