package com.trainingbasket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.trainingbasket.BusinessService;

@Configuration
@Import(DatabaseConfig.class)
public class AppConfig {
    @Bean
    public BusinessService getBusinessService() {
        return new BusinessService();
    }
}
