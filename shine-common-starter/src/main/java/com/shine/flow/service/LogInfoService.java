package com.shine.flow.service;

import com.shine.flow.properties.LogInfoProperties;

public class LogInfoService {

    private LogInfoProperties logInfoProperties;

    public LogInfoService() {}

    public LogInfoService(LogInfoProperties logInfoProperties) {
        this.logInfoProperties = logInfoProperties;
    }

    public String getComponetScan() {
        System.err.println(logInfoProperties.getPackages());
        return logInfoProperties.getPackages();
    }
}
