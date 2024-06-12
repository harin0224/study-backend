package com.multi.chap03security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

public class SpringSecurityConfiguration {



    @Bean
    public WebSecurityCustomizer configure() {

        return (web) -> web.ignoring().requestMatchers(
                "/css/**", "/js/**", "/images/**"
        );
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)       // 이게 뭐지?   토근 위조 방지 안쓰겠다
                .formLogin(form -> form
                        .loginPage("/member/login")
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/",true)  // 성공했을 때 디폴트로 가는 url(루트 페이지로 가게)
                        .failureForwardUrl("/error/login") // 실패했을 때
                        );
        return http.build();    // 위를 리턴해서 빌드하겠다


    }
}
