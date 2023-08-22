package thePhone;

//INSTANCE VARIABLES

public class MobilePhone {
	private String brand;
	private String model;
	private long number;
	private int storage;
	
	//CONSTRUCTOR
	
	public MobilePhone(String brand, String model, long number, int storage ) {
			this.brand = brand;
			this.model = model;
			this.number = number;
			this.storage = storage;
	
	//SETTERS AND GETTERS
			
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	//METHODS
	
	public void makeCall(long number) {
		System.out.println("We are calling " + number + " from our " + brand + " " + model + " phone");
	}
	
	public void installApp(String appName) {
		System.out.println("Installing " + appName + " on our " + brand + " " + model + " phone");
	}
	
	public void displayInfo() {
		System.out.println("Brand:" + brand + "\n" +
		"Model:" + model + "\n" +
		"Phone Number:" + number + "\n" +
		"Storage Capacity:" + storage + "GB" + "\n");
	}
	
}
