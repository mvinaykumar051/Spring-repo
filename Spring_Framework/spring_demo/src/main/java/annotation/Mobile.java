package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value("OnePlus")
     String brand;
	
	@Value("8")
     int ram;
	
    @Autowired
//    @Qualifier("jio")
    Sim sim;
//     Jio sim;

@Override
public String toString() {
	return "Mobile [brand=" + brand + ", ram=" + ram + ", airtel=" + sim + "]";
}

}
