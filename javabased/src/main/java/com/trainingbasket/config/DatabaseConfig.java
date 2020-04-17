package com.trainingbasket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import com.trainingbasket.DatabaseManager;

public class DatabaseConfig {
    @Bean(name = "production")
    @Lazy
    public DatabaseManager getProductionDatabaseManager() {
        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.setDatabaseName("production");
        return databaseManager;
    }

    @Bean(name = "test")
    @Lazy
    public DatabaseManager getTestDatabaseManager() {
        DatabaseManager databaseManager = new DatabaseManager();
        databaseManager.setDatabaseName("test");
        return databaseManager;
    }
}
