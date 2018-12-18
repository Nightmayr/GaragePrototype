
public class Aeroplane extends Vehicle {
	private int wingSpan;
	private boolean hasParachute;
	private int decks;
	
	public Aeroplane(String color, int numberOfWheels, int engineSize, int id,int wingSpin, boolean hasParachutes, int decks) {
		super(color, numberOfWheels, engineSize, id);
		this.wingSpan = wingSpin;
		this.hasParachute = hasParachutes;
		this.decks = decks;
	}
	
	public int getWingSpan() {
		return wingSpan;
	}
	
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	public boolean getParachute() {
		return hasParachute;
	}
	
	public void setParachute(boolean parachute) {
		this.hasParachute = parachute;
	}
	
	public int getDecks() {
		return decks;
	}
	
	public void setDecks(int decks) {
		this.decks = decks;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + ": " + getColor() + ", " + getWheels() + ", " + getEngineSize() + ", " + wingSpan + ", " + hasParachute + ", " + decks;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
