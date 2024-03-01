package com.carshop.app.infrastructure.authentication.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    public void setPrefix(final String prefix) {
        PREFIX = prefix;
    }

    public void setKey(final String key) {
        KEY = key;
    }

    public void setExpiration(final Long expiration) {
        EXPIRATION = expiration;
    }
}
