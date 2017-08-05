package bet.so.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import bet.so.user.entity.User;
import bet.so.user.feign.UserFeignClient;

@RestController
public class MovieController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/user/{id}")
	@ResponseBody
	public User findById(@PathVariable Long id) {
		User u = userFeignClient.findById(id);
		return u;
	}
}
