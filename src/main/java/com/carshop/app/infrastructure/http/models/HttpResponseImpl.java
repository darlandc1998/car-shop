package com.carshop.app.infrastructure.http.models;

import com.carshop.app.infrastructure.http.HttpResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class HttpResponseImpl implements HttpResponse {

    private int code;
    private String message;
    private Object data;

    public HttpResponseImpl() {

    }

    public HttpResponseImpl(final int code, final Object data) {
        this.code = code;
        this.data = data;
    }

    public HttpResponseImpl(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public HttpResponseImpl(final int code, final String message, final Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(final int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public Object getData() {
        return data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

}
