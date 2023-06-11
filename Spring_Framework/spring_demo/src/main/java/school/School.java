package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotation.Mobile;
import annotation.MyConfiguration;

public class School {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Baby  baby=(Baby) context.getBean("baby");
		baby.eat();
	}
}
