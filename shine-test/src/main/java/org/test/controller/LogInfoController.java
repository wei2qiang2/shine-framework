package org.test.controller;

import com.shine.flow.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogInfoController {

    @Autowired
    private LogInfoService logInfoService;

    @GetMapping
    public String log() {
        return logInfoService.getComponetScan();
    }
}
