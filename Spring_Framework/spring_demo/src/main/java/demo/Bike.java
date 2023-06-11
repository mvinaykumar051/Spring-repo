package demo;

public class Bike {
	
	String brand;
	int cc;
	MusicSystem musicSystem;
	
	public Bike(String brand, int cc, MusicSystem musicSystem) {
		super();
		this.brand = brand;
		this.cc = cc;
		this.musicSystem = musicSystem;
	}
	
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", cc=" + cc + ", musicSystem=" + musicSystem + "]";
	}
}
