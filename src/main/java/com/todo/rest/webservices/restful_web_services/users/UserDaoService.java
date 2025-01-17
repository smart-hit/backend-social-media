package com.todo.rest.webservices.restful_web_services.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.*;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {
    private static int userCount=0;
	private static List<User> users=new ArrayList<>();
	static {
		users.add(new User(userCount++,"Adam",LocalDate.now().minusYears(30)));
		users.add(new User(userCount++,"Eve",LocalDate.now().minusYears(25)));
		users.add(new User(userCount++,"Jim",LocalDate.now().minusYears(20)));
	}
	public List<User> findAll(){
		return users;
	}
	public User addUser(User user){
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		users.removeIf(predicate);
		
	}
	
}
