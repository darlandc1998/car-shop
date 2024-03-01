package com.carshop.app.infrastructure.http;

public interface HttpResponse {

    int getCode();

    String getMessage();

    Object getData();

}
