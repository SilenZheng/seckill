package com.silen.seckill.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zero on 2018/9/21.
 */

@Data
@ConfigurationProperties(prefix = "audience")
@Component
public class Audience {
    private String clientId;
    private String base64Secret;
    private String name;
    private int expiresSecond;
}
