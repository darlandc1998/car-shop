package com.carshop.app.infrastructure.http.models;

public class HttpResponseBuilder {

    private HttpResponseImpl httpResponse;

    public static HttpResponseBuilder mount() {
        HttpResponseBuilder builder = new HttpResponseBuilder();
        builder.httpResponse = new HttpResponseImpl();
        return builder;
    }

    public HttpResponseBuilder withCode(final int code) {
        httpResponse.setCode(code);
        return this;
    }

    public HttpResponseBuilder withMessage(final String message) {
        httpResponse.setMessage(message);
        return this;
    }

    public HttpResponseBuilder withData(final Object data) {
        httpResponse.setData(data);
        return this;
    }

    public HttpResponseImpl build() {
        return this.httpResponse;
    }

}
