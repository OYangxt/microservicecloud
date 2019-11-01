package com.neoway.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 20190712713
 * @date 2019/11/1 9:40
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}
