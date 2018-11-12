package uk.gergely.kiss.data.provider.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutController {

	@GetMapping(value = "/")
	public String home() {
		return "Hello";
	}
	
	@GetMapping(value = "/private")
	public String privateArea() {
		return "private";
	}
	
}
