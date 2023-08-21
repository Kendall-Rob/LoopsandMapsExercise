public class Pet {

	 //INSTANCE VARIABLES
	
		private String name;
		private int age;
		private String location;
		private String type;
		
		
	    public  Pet() {
	     	System.out.println("What pet would you like?");
		}
	    
	    //SET METHOD
		
		public void setPet(String name, int age, String location, String type) {
			
			this.name = name;
			this.age = age;
			this.location = location;
			
		}
		
		//GET MEETHOD
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getLocation() {
			return location;
		}
		
		public static void main(String[] args) {
			
			Pet d = new Pet();
			d.setPet("Lokey", 7, "Macon", null);
			System.out.println(d.getName());
			System.out.println(d.getAge());
			System.out.println(d.getLocation());
		}
		
	}




