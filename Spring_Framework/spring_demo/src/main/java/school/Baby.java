package school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	IceCream icecream;

	public  void eat()
	{
		System.out.println("Baby opened the Packet");
		icecream.eat();
	}
	
}
