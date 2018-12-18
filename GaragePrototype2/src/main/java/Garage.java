import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage implements Cloneable{

	List<Vehicle> vehicleList;
	
	Car bmw = new Car("Black", 4, 200, 1561, "Diesel", 4, true);
	Motorbike suzuki = new Motorbike("Yellow", 2, 100, 12576, 2018, false, "Sports");
	Aeroplane boeing = new Aeroplane("Red", 10, 1000, 34566, 120, true, 2);
		
	public Garage()
	{
		vehicleList = new ArrayList<Vehicle>();
	}
	
	public void buildGarage()
	{
		addToList(bmw);
		addToList(suzuki);
		addToList(boeing);
	}
	
	public Garage(List<Vehicle> list)
	{
		this.vehicleList = list;
	}

	public void addToList(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	public void printList() {
		vehicleList.stream().forEach(System.out::println);
	}

	public void billCalcAll() {

		int total = 0;

		for (Vehicle vehicle : vehicleList) {
			if (vehicle instanceof Car) {
				total = vehicle.getWheels() * vehicle.getEngineSize();
				System.out.println("Bill to be payed: £" + total);
			} else if (vehicle instanceof Motorbike) {
				total = vehicle.getWheels() * vehicle.getEngineSize();
				System.out.println("Bill to be payed: £" + total);
			} else if (vehicle instanceof Aeroplane) {
				total = vehicle.getWheels() * vehicle.getEngineSize();
				System.out.println("Bill to be payed: £" + total);
			}
		}
		// System.out.println("Bill to be payed: £" + total);
	}

	public void addVehicle() {
		
	}

	public void removeById(int id) {
		vehicleList.removeAll(vehicleList.stream().filter(n -> n.getId() == id).collect(Collectors.toList()));
	}

	public void emptyList() {
		this.vehicleList.clear();
	}
	
	public List<Vehicle> getVehicleList()
	{
		return vehicleList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<Vehicle> temp = new ArrayList<Vehicle>();
		for(Vehicle i : this.getVehicleList())
		{
			temp.add(i);
		}
		return new Garage(temp);
	}

}
