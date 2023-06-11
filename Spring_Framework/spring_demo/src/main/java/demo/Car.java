package demo;

public class Car {
	
	String brand;
	int topSpeed;
	MusicSystem musicSystem;
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", topSpeed=" + topSpeed + ", musicSystem=" + musicSystem + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	
	
	
	
	
}
