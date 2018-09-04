package com;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.family.dto.User;
import com.family.repository.UserRepository;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args ->
			Arrays.asList("Erwan","Admin")
				.forEach(username -> {
					User user = new User(username, "password");
					userRepository.save(user);
				});
	}
    
}
