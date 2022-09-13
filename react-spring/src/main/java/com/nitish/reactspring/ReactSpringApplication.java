package com.nitish.reactspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nitish.reactspring.model.User;
import com.nitish.reactspring.repository.UserRepository;

@SpringBootApplication
public class ReactSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringApplication.class, args);
	}

	@Autowired
	private UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User("Nitish"));
		repo.save(new User("Rahul"));
		repo.save(new User("Krishna"));


	}



}
