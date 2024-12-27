package com.todo.rest.webservices.restful_web_services.Hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping("/hello")
	public String helloworld() {
		return "rohith";
	}
	@RequestMapping("/hello/{name}")
	public String helloworld(@PathVariable String name) {
		return name;
	}
	@RequestMapping("/helo/{name}")
	public HelloworldMes helloworld1(@PathVariable String name) {
		return new HelloworldMes(name);
	}
}
