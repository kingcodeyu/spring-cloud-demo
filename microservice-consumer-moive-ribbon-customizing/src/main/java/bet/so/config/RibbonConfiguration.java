package bet.so.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class RibbonConfiguration {
	//默认byType查找
	@Bean
	public IRule ribbonRule(){
		return new RandomRule();
	}
}
