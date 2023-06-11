package school;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Chocolate implements IceCream{
	
public void eat(){
	System.out.println("Baby eating Chocolate");
}
}
