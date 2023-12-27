package com.carshop.app.http;

public interface HttpResponse {

    int getCode();

    String getMessage();

    Object getData();

}
