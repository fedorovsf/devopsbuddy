package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by sergei on 30/11/2018.
 */
@Configuration
public class I18nConfig {

    @Bean
    ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        reloadableResourceBundleMessageSource.setBasename("classpath:i18n/messages");

        //Checks for new messages every 30 minutes
        reloadableResourceBundleMessageSource.setCacheSeconds(1800);
        return reloadableResourceBundleMessageSource;
    }
}
