package com.gl.docportaldrivergateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests().
                antMatchers("/patient-service/**").
                authenticated().
                anyRequest().
                denyAll();
    }
}
