package com.revature.invincible.utils.custom_exceptions;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException() {
        super();
    }

    public InvalidProductException(String message) {
        super(message);
    }

    public InvalidProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidProductException(Throwable cause) {
        super(cause);
    }

    protected InvalidProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
