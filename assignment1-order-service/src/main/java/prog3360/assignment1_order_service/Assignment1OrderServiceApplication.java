package prog3360.assignment1_order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Assignment1OrderServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(Assignment1OrderServiceApplication.class, args);
	}
}
