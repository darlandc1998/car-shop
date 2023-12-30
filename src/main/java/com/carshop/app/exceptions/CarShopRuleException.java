package com.carshop.app.exceptions;

public class CarShopRuleException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final String BRAND_NOT_FOUND = "brand_not_found";
    public static final String COLOR_NOT_FOUND = "color_not_found";
    public static final String MODEL_NOT_FOUND = "model_not_found";
    public static final String PERMISSION_NOT_FOUND = "permission_not_found";
    public static final String PROFILE_NOT_FOUND = "profile_not_found";
    public static final String VEHICLE_NOT_FOUND = "vehicle_not_found";
    public static final String PASSWORD_OUT_OF_RULES = "password_out_of_rules";
    public static final String PASSWORDS_DONT_MATCH = "passwords_dont_match";
    public static final String USERNAME_ALREADY_USED = "username_already_used";
    public static final String EMAIL_ALREADY_USED = "email_already_used";
    public static final String USER_NOT_FOUND = "user_not_found";

    public CarShopRuleException(final String message) {
        super(message);
    }
}
