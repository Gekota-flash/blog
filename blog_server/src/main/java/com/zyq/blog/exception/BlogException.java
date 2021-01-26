package com.zyq.blog.exception;

public class BlogException extends RuntimeException {

    private final ErrorAndMsg response;

    public BlogException(String code) {
        this.response = new ErrorAndMsg(code);
    }
    public BlogException(ErrorAndMsg response) {
        this.response = response;
    }
    public ErrorAndMsg getResponse() {
        return response;
    }

}
