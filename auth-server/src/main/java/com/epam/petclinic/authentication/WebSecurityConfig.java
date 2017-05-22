package com.epam.petclinic.authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /*
        Method configures users in authentication server memory to authenticate and authorize clients of application
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //TODO find the way to pass encrypted values as passwords
        auth.inMemoryAuthentication()
                .withUser("reader").password("reader").authorities("user")
                .and()
                .withUser("writer").password("writer").authorities("admin");
    }
}
