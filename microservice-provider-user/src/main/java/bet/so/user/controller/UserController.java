package bet.so.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;

import bet.so.user.entity.User;

@RestController
public class UserController {
	@GetMapping(value="/{id}",produces="application/json;charset=UTF-8")
	public User findById(@PathVariable Long id) {
		System.out.println("test");
		User u = new User();
		u.setUserName("小红");
		u.setAge(18);
		return u;
	}
}
