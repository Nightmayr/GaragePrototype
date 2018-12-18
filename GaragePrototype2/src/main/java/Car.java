
public class Car extends Vehicle{
	
	private String fuelType;
	private int numberOfDoors;
	private boolean hasLighter;
	
	public Car(String color, int numberOfWheels, int engineSize, int id, String fuelType, int numberOfDoors, boolean hasLighter) {
		super(color, numberOfWheels, engineSize, id);
		this.fuelType = fuelType;
		this.numberOfDoors = numberOfDoors;
		this.hasLighter = hasLighter;
	}
	
	
	public String getFuel() {
		return fuelType;
	}
	
	public void setFuel(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public int getDoor() {
		return numberOfDoors;
	}
	
	public void setDoor(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public boolean getLighter() {
		return hasLighter;
	}
	
	public void setLighter(boolean hasLighter) {
		this.hasLighter = hasLighter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + ": " + getColor() + ", " + getWheels() + ", " + getEngineSize() + ", " + fuelType + ", " + numberOfDoors + ", " + hasLighter;
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	// use instanceOf to check if Car is subclass of Vehicle
	
	
}
