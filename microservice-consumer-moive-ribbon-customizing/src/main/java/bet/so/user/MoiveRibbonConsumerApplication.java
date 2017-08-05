package bet.so.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MoiveRibbonConsumerApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate rest1Template(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(MoiveRibbonConsumerApplication.class).web(true).run(args);
	}
}
