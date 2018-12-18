
public class Motorbike extends Vehicle{
	
	private int regYear;
	private boolean hasBoot;
	private String category;
	
	public Motorbike(String color, int numberOfWheels, int engineSize, int id,int regYear, boolean hasBoot, String category) {
		super(color, numberOfWheels, engineSize, id);
		this.regYear = regYear;
		this.hasBoot = hasBoot;
		this.category = category;
	}
	
	
	public int getDate() {
		return regYear;
	}
	
	public void setDate(int regYear) {
		this.regYear = regYear;
	}
	
	public boolean getBoot() {
		return hasBoot;
	}
	
	public void setBoot(boolean hasBoot) {
		this.hasBoot = hasBoot;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + ": " + getColor() + ", " + getWheels() + ", " + getEngineSize() + ", " + regYear + ", " + hasBoot + ", " + category;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}
