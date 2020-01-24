package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingsController {

	@GetMapping(path = "/greetings/{name}")
	public Mono<String> getGreetings(@PathVariable("name") String name) {
		return Mono.just("Hello " + name + "!");
	}
}
