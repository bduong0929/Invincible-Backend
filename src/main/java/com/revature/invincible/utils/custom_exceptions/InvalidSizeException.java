package com.revature.invincible.utils.custom_exceptions;

public class InvalidSizeException extends RuntimeException {
    public InvalidSizeException(String message) {
        super(message);
    }

    public InvalidSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSizeException(Throwable cause) {
        super(cause);
    }

    protected InvalidSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
