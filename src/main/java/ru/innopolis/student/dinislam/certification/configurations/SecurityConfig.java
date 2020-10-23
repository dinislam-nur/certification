package ru.innopolis.student.dinislam.certification.configurations;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthenticationProvider authenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        val handler = new SimpleUrlAuthenticationSuccessHandler("/api/students");
        http.cors().disable()
                .csrf().disable()
                .httpBasic().disable()
                .authenticationProvider(authenticationProvider)
                .formLogin()
                .loginPage("/login")
                .successHandler(handler)
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .permitAll()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
