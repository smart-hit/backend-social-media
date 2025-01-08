package com.todo.rest.webservices.restful_web_services.Hello;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
   private MessageSource messageSource;

   public HelloWorld(MessageSource messageSource) {
	   this.messageSource=messageSource;
   }
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
	@RequestMapping("/hello-int")
	public String helloworldint() {
		Locale locale=LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
	}
}
