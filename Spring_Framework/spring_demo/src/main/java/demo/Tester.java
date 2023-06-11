package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
public static void main(String[] args) {
//	Car car=new Car();

//	System.out.println(car);
//	ClassPathResource resource=new ClassPathResource("demo/MyConfiguration.xml");
//	BeanFactory factory=new XmlBeanFactory(resource);
//	
//	Car car=(Car) factory.getBean("car");    
//	System.out.println(car);
//	
//	Bike bike=(Bike) factory.getBean("bike");
//	System.out.println(bike);   
	  
//	or
	
	ApplicationContext context=new ClassPathXmlApplicationContext("demo/MyConfiguration.xml");
	Car car=(Car) context.getBean("car");
	System.out.println(car);
	
	Bike bike=(Bike) context.getBean("bike");
	System.out.println(bike);
}
}
