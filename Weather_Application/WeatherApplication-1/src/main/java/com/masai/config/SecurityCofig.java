package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityCofig {
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeHttpRequests((authorize)->authorize.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}
	
	
	@Bean
	public UserDetailsService userlogin() {
		UserDetails user  = User.builder()
				.username("user")
				.password(passwordEncoder().encode("user@123"))
				.roles("USER")
				.build();
		//return new InMemoryUserDetailsManager(user);
		
		
		UserDetails admin  = User.builder()
				.username("admin")
				.password(passwordEncoder().encode("admin@123"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
		
	}
	

}
