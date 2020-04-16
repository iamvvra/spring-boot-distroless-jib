package com.example.distro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class SpringBootDistrolessMultistageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDistrolessMultistageApplication.class, args);
	}

}

@RestController
class HelloController {

	@Value("${app.message}")
	String message;
	@GetMapping(value="/hello")
	public String getMethodName() {
		return "hello world";
	}

	@GetMapping(value="/hai")
	public String getMethodName2() {
		return "hei";
	}

	@GetMapping(value="/sayehello")
	public String getMethodName3() {
		return "hello there";
	}

	@GetMapping(value="/onemoretimepls")
	public String getMethodName4() {
		return "okkay, hello there";
	}

	@GetMapping(value="/jib")
	public String jib() {
		return message;
	}

	@GetMapping(value = "/newapi/{name}")
	public String api1(@PathVariable String name) {
		return "hello "+name;
	}
	
	
}