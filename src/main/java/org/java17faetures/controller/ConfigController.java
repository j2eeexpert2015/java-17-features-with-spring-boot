package org.java17faetures.controller;

import org.java17faetures.service.ConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private final ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }
    @GetMapping("/showconfig")
    public String fetchInsurances() {
        return configService.getConfigRecordInfo();
    }
}
