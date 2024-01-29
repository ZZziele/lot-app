package com.sda.lot.excepiton;

public class WrongPlaneIdException extends RuntimeException{
    public WrongPlaneIdException() {
    }

    public WrongPlaneIdException(String message) {
        super(message);
    }

    public WrongPlaneIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPlaneIdException(Throwable cause) {
        super(cause);
    }

    public WrongPlaneIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
