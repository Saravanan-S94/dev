package com.dev;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class De {
	@GetMapping("/getKit")
	public String getKit() {
		return "devOpss";
	}
	

}
