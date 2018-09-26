package pl.artur.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MicroserviceApplication {


	public static void main(String[] args) {
		System.out.println("Microservice has started.");
		SpringApplication.run(MicroserviceApplication.class, args);
	}
}
