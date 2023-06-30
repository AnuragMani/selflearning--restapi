package com.selflearning.selflearning.restapi.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

import com.selflearning.selflearning.restapi.user.User;

@Component
public class UserDaoService {

	/*
	 * public static List<User> userList = new ArrayList<>(); public static int
	 * usercount =0; static { userList.add(new User(++usercount, "Anurag",
	 * LocalDate.now().minusYears(36))); userList.add(new User(++usercount, "Papa",
	 * LocalDate.now().minusYears(70))); userList.add(new User(++usercount, "Saroj",
	 * LocalDate.now().minusYears(60))); userList.add(new User(++usercount, "Rinku",
	 * LocalDate.now().minusYears(40))); userList.add(new User(++usercount, "Simpy",
	 * LocalDate.now().minusYears(30))); userList.add(new User(++usercount, "Pinky",
	 * LocalDate.now().minusYears(50)));
	 * 
	 * }
	 * 
	 * public List<User> getAllList(){ return userList; } public User getUserId(int
	 * id) { Predicate<? super User> predicate= user -> (user.getId()==id); //return
	 * userList.stream().filter(predicate).findFirst().get(); return
	 * userList.stream().filter(predicate).findFirst().orElse(null); } public User
	 * saveUser(User user) { user.setId(++usercount); userList.add(user); return
	 * user; }
	 * 
	 * public void deleteByUserId(int id) { Predicate<? super User> predicate= user
	 * -> (user.getId()==id); userList.removeIf(predicate); }
	 */
}
