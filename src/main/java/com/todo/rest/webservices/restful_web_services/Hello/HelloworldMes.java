package com.todo.rest.webservices.restful_web_services.Hello;

public class HelloworldMes {
	String message;
	public HelloworldMes(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "HelloworldMes [message=" + message + "]";
	}
    
	
	
}
