package com.amisoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AuthorizationApplication {

	@Bean
	PasswordEncoder noOpPasswordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationApplication.class, args);
	}

}
