package com.api_factura.api_factura;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_factura.api_factura.models.MessageDto;

@RestController
@SpringBootApplication
public class ApiFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFacturaApplication.class, args);
	}

	@GetMapping("/api/message")
	public MessageDto messageView(){
		return new MessageDto(LocalDateTime.now(), "Mi primero hola mundo es spring");
	}

	

}
