package school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("school")
public class Config {
	@Bean
public IceCream gettype(){
	return new Chocolate();
}
}
