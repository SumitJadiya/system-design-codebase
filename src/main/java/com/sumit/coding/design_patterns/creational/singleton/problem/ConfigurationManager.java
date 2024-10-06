package com.sumit.coding.design_patterns.creational.singleton.problem;

import lombok.Getter;

@Getter
public class ConfigurationManager {

    private final String configuration;

    public ConfigurationManager() {
        // Load configuration from a file or database
        this.configuration = "DatabaseConfig";
    }
}
