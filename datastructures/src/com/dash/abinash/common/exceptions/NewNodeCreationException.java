package com.dash.abinash.common.exceptions;

public class NewNodeCreationException
        extends RuntimeException {

    private String errorMsg;

    public NewNodeCreationException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
