package org.uni.hms.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class Config {

    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
    @Bean
    public SimpleDateFormat getDate(){
        return new SimpleDateFormat();
    }
}
