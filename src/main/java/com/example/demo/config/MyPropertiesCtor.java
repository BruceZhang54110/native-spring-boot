package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;


@ConfigurationProperties(prefix = "my.properties")
public class MyPropertiesCtor {

    private final String name;

    @NestedConfigurationProperty
    private final Nested nested;

    public MyPropertiesCtor(String name, Nested nested) {
        this.name = name;
        this.nested = nested;
    }

    @Override
    public String toString() {
        return "MyPropertiesCtor{" +
                "name='" + name + '\'' +
                ", nested=" + nested +
                '}';
    }
}
