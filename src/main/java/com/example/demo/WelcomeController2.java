package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WelcomeController2 {

	@GetMapping("/welcome2")
	public ResponseEntity<Void> welcome(@RequestBody @Valid Company company) {

		log.info(company.toString());

		return ResponseEntity.ok().body(null);
	}

}
