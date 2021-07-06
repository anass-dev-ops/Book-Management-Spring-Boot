package org.anassdev.book.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/")
	public String getHello() {
		return "Hello";
	}
}
