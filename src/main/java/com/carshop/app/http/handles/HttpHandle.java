package com.carshop.app.http.handles;

import org.springframework.http.HttpStatus;

import com.carshop.app.http.HttpResponse;
import com.carshop.app.http.models.HttpResponseBuilder;

public final class HttpHandle {

    public static HttpResponse badRequest(final String error) {
        return HttpResponseBuilder
                .mount()
                .withCode(HttpStatus.BAD_REQUEST.value())
                .withMessage(error)
                .build();
    }

    public static HttpResponse created(final Object data) {
        return HttpResponseBuilder
                .mount()
                .withCode(HttpStatus.CREATED.value())
                .withData(data)
                .build();
    }

    public static HttpResponse success(final Object data) {
        return HttpResponseBuilder
                .mount()
                .withCode(HttpStatus.OK.value())
                .withData(data)
                .build();
    }

}
