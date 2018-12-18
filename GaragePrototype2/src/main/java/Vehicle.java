
public abstract class Vehicle {
	
	private String color;
	private int numberOfWheels;
	private int engineSize;
	private int id;
	
	public abstract void move();
	
	public Vehicle(String color, int numberOfWheels, int engineSize, int id) {
		this.setColor(color);
		this.setWheels(numberOfWheels);
		this.engineSize = engineSize;
		this.id = id;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return numberOfWheels;
	}

	public void setWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	

	
}
