package org.java17faetures.service;

import org.java17faetures.config.ConfigRecord;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    private final ConfigRecord configRecord;

    public ConfigService(ConfigRecord configRecord) {
        this.configRecord = configRecord;
    }
    public String getConfigRecordInfo() {
        return configRecord.message1() + " | " + configRecord.message2();
    }
}
