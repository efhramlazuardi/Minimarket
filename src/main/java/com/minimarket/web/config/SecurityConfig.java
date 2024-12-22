package com.minimarket.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/login", "/register", "/css/**", "/js/**").permitAll() // URL yang diizinkan tanpa autentikasi
                .anyRequest().authenticated() // Semua URL lainnya harus diautentikasi
            )
            .formLogin(form -> form
                .loginPage("/login") // Custom login page
                .permitAll()
                .defaultSuccessUrl("/", true) // Ganti defaultSuccessURL yang deprecated
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            );

        return http.build();
    }
}
