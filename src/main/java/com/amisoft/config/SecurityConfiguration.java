package com.amisoft.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic();

        http.authorizeRequests()
                .mvcMatchers("/rootone").hasAnyAuthority("ROLE_ADMIN")
                .mvcMatchers(HttpMethod.GET,"/roottwo").hasAnyAuthority("ROLE_ADMIN")
                //.mvcMatchers(HttpMethod.GET,"/roottwo").access("@authz.check(request,principle)")
                //.mvcMatchers(HttpMethod.GET,"/users/{name}").access("#name == principle?.username")
                .anyRequest()
                .permitAll();


    }
}
