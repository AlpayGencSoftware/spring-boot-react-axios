package com.libertytech.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.libertytech.app.model.User;
import com.libertytech.app.repository.UserRepository;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		 this.userRepository.save(new User("Alpay", "Genc", "genc_alpay@hotmail.com"));
		 this.userRepository.save(new User("Can", "Genc", "genc_alpay@hotmail.com"));
		   
	}

}
