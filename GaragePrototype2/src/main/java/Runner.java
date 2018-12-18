import java.util.List;

public class Runner {

	public static void main(String[] args)  throws CloneNotSupportedException{
		// TODO Auto-generated method stub

		// Car: Color, NumberWheels, engineSize, id, Fuel, Doors, Lighter
		// Motorbike: Color, NumberWheels, engineSize, id, Year, Boot, Category
		// Plane: Color, NumberWheels, engineSize, id, Wingspan, parachutes, decks

/*		

		// Printing out objects
		System.out.println(bmw);
		System.out.println(suzuki);
		System.out.println(boeing);*/

		// Create Garage object
		Garage garage1 = new Garage();
		garage1.buildGarage();
		
		Garage garageNew = (Garage) garage1.clone();
		Garage garageNew2 = (Garage) garage1.clone();
		
		List<Vehicle> list = garageNew.getVehicleList();
		Car lambo = new Car("Yellow", 4, 150, 1, "Super Fuel", 2, false);
		list.add(lambo);
		
		List<Vehicle> list2 = garageNew2.getVehicleList();
		
		list2.remove(2);
		
		System.out.println("Garage List: ");
		garage1.printList();
		
		System.out.println("First clone List added lambo: " + list);
		
		System.out.println("Second clone List removed plane: " + list2);
		

/*		System.out.println("LIST PRINTED");
		garage1.printList();
		System.out.println("BILLS");
		garage1.billCalcAll();
		garage1.removeById(34566);
		System.out.println("LIST PRINT 2");
		garage1.printList();*/
		
		
		
		
//		garage1.emptyList();
//		garage1.printList();
		
		
//		garage1.billCalc(suzuki);
//		garage1.billCalc(boeing);

	}

}
