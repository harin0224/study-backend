package com.multi.test.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Configuration
public class SpringSecurityConfiguration {
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().disable()
//                .csrf().disable()
//                .formLogin().disable()
//                .headers().frameOptions().disable();
//
//    }



    @Bean
    public BCryptPasswordEncoder encodePassword() {
        return new BCryptPasswordEncoder();
    }
}

