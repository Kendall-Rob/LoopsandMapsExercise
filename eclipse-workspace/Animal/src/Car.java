
public class Car {
	
	//INSTANCE VARIABLES
	
	private String name;
	private String color;
	private int milage;
	private String location;
	
	
	public  Car() {}
	
	public  Car(String name, int milage) {
		this.name = name;
		this.milage = milage;
		
	}
	
	//SET METHOD
	
	public void setCar(String name, String color, int milage, String location) {
		this.name = name;
		this.color = color;
		this.milage = milage;
		this.location = location;
	}
	
	//GET MOTHOD
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getMilage() {
		return milage;
	}
	public String getlocation() {
		return location;
	}
	public boolean hachBack() {
		return true;
	}
	
	public String yourCar() {
		return "I hope you enjoy your new car!";
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.setCar("BMW HachBack", "Red", 28, "NewYork");
		System.out.println(car.getName());
		System.out.println(car.getColor());
		System.out.println(car.getMilage());
		System.out.println(car.getlocation());
		System.out.println(car.yourCar());

	}

}
