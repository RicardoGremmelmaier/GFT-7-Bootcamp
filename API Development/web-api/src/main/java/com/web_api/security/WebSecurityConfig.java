package com.web_api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    public SecurityDatabaseService sds;

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(sds).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    // To-Do this doesnt work in new spring security versions, need to understand how to
    // make this work
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers("/").permitAll()
                .requestMatchers(HttpMethod.POST, "/login").permitAll()
                .requestMatchers("/managers").hasAnyRole("MANAGER")
                .requestMatchers("users").hasAnyRole("MANAGER", "USER")
                .anyRequest().authenticated().and().httpBasic();
    }
    // In memory
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user1 = User.builder()
//                .username("user")
//                .password("{noop}user123")
//                .roles("USER")
//                .build();
//
//        UserDetails user2 = User.builder()
//                .username("admin")
//                .password("{noop}master123")
//                .roles("MANAGER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
}
