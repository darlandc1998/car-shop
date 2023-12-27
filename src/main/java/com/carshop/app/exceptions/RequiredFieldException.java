package com.carshop.app.exceptions;

public class RequiredFieldException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final String REQUIRED_FIELDS_NOT_RECEIVED = "required_fields_not_received";

    public RequiredFieldException(final String message) {
        super(message);
    }
}
