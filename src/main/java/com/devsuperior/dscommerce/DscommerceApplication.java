package com.devsuperior.dscommerce;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.*;

@SpringBootApplication
public class DscommerceApplication implements CommandLineRunner {
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String test = passwordEncoder.encode("123456");
		System.out.println(test);
	}
}
