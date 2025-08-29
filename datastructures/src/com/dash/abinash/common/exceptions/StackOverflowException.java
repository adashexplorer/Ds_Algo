package com.dash.abinash.common.exceptions;

public class StackOverflowException extends RuntimeException {

    private String errorMessage;

    public StackOverflowException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
