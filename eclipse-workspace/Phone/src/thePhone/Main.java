package thePhone;

public class Main {

	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone("Apple", "Iphone 14", 7702310021l, 250);
		phone.makeCall(4042346678l);
		phone.installApp("TextNow");
		phone.displayInfo();

	}

}
