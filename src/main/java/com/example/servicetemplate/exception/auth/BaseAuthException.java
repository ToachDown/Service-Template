package com.example.servicetemplate.exception.auth;

public class BaseAuthException extends RuntimeException{

    public BaseAuthException() {
        super();
    }

    public BaseAuthException(String message) {
        super(message);
    }

    public BaseAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseAuthException(Throwable cause) {
        super(cause);
    }
}
