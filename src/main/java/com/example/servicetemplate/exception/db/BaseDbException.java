package com.example.servicetemplate.exception.db;

public class BaseDbException extends RuntimeException{

    public BaseDbException() {
    }

    public BaseDbException(String message) {
        super(message);
    }

    public BaseDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseDbException(Throwable cause) {
        super(cause);
    }
}
