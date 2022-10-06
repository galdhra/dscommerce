package com.devsuperior.dscommerce;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.*;

@SpringBootApplication
public class DscommerceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
	}


}
