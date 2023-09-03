import java.util.*;


public class CarDealer {
	
	public static void main(String[] args) {
		HashMap<String, String> vehicles = new HashMap<>();
		Scanner custoInput = new Scanner(System.in);
		
		
		vehicles.put("G Wagon", "Brabus");
		vehicles.put("Urus", "Lamborghini");
		vehicles.put("z06", "Corvette");
		vehicles.put("650i", "BMW");
		vehicles.put("F-TYPE", "Jaguar");
		vehicles.put("911", "Porsche");
		
		System.out.println("What car are you looking for? ");
		String carInput = custoInput.nextLine();
		
		if(vehicles.containsKey(carInput)) {
			System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", carInput, vehicles.get(carInput));
		} else {
			System.out.println("Sorry! We do not have that vehicle in our inventory.");
		}
			
	}
	
}
