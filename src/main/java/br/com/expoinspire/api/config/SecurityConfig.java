package br.com.expoinspire.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        // --- Regras para Avaliadores ---
                        .requestMatchers(HttpMethod.GET, "/api/avaliadores", "/api/avaliadores/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/avaliadores").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/api/avaliadores/**").permitAll()

                        // --- Regras para Mentores (ATUALIZADO) ---
                        .requestMatchers(HttpMethod.GET, "/api/mentores", "/api/mentores/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/mentores").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/api/mentores/**").permitAll()

                        // --- Regra Final: Bloquear todo o resto ---
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}