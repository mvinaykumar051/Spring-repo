package annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Airtel implements Sim {

	@Override
	public String toString() {
		return " This is Airtel Sim";
	}
}
