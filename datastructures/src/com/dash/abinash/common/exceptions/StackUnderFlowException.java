package com.dash.abinash.common.exceptions;

public class StackUnderFlowException extends RuntimeException {

    private String errorMessage;

    public StackUnderFlowException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
