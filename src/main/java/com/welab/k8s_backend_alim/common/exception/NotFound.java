package com.welab.k8s_backend_alim.common.exception;

public class NotFound extends ClientError{
    public NotFound(String message){
        this.errorCode = "Not Found";
        this.errorMessage = message;
    }
}
