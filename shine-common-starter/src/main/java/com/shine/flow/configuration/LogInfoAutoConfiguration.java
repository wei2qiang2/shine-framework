package com.shine.flow.configuration;

import com.shine.flow.properties.LogInfoProperties;
import com.shine.flow.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(LogInfoService.class)
@EnableConfigurationProperties(LogInfoProperties.class)
//@ConditionalOnProperty(prefix = "log", value = "enabled", matchIfMissing = true)
public class LogInfoAutoConfiguration {

    @Autowired
    private LogInfoProperties logInfoProperties;

    @Bean
    @ConditionalOnMissingBean(LogInfoService.class)
    public LogInfoService initLogInfoService() {
        return new LogInfoService(logInfoProperties);
    }
}
