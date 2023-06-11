package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("annotation")
public class MyConfiguration {
@Bean
	public Sim getSim(){
		return new Airtel();
	}
}