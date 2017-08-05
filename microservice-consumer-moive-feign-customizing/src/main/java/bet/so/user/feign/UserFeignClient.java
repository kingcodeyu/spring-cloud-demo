package bet.so.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bet.so.config.FeignConfiguration;
import bet.so.user.entity.User;
import feign.Param;
import feign.RequestLine;

@FeignClient(name="microservice-provider-user",configuration=FeignConfiguration.class)
public interface UserFeignClient {
	
	@RequestLine("GET /{id}")
	public User findById(@Param("id") Long id);
}
