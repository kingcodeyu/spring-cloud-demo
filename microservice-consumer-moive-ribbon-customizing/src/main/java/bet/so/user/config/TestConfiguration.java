package bet.so.user.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

import bet.so.config.RibbonConfiguration;

@Configuration
@RibbonClient(name="microservice-provider-user",configuration=RibbonConfiguration.class)
public class TestConfiguration {
	
}
