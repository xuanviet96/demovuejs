package com.example.vuejs;

import com.example.vuejs.entity.User;
import com.example.vuejs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VuejsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VuejsApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user1 = User.builder()
			.firstName("Nguyen")
			.lastName("Thao")
			.email("thao.nguyen@email.com")
			.build();
		User user2 = User.builder()
				.firstName("Nguyen")
				.lastName("Xuan")
				.email("xuan.nguyen@email.com")
				.build();
		User user3 = User.builder()
				.firstName("Hoang")
				.lastName("Tu")
				.email("tu.hoang@email.com")
				.build();
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
	}
}
