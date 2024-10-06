package com.sumit.coding.design_patterns.creational.singleton.solution;

import lombok.Getter;

/**
 * Class that implements Singleton design Pattern
 */
@Getter
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final String configuration;

    // Private constructor prevents instantiation from outside the class
    private ConfigurationManager() {
        // Load configuration from a file or database
        this.configuration = "DatabaseConfig";
    }

    /**
     * @return object using lazy initialization
     */
    static ConfigurationManager getInstance() {

        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}
