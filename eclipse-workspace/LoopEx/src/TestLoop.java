import java.util.*;


public class TestLoop {
	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		int sum = 0;
		int product = 1;
		int largest = 0;
		int smallest = 0;
		
		
		for(int i = 0; nums.size() < 5; i++) {
			System.out.println("Enter 5 Numbers: ");
			int input = userInput.nextInt();
			userInput.nextLine();
			nums.add(input);
		}
		
		for(int i : nums) {
			nums.get(0);
			nums.get(0);
			
			
			sum += i;
			product *= i;
			
			
			
			
			if (i > largest) {
				 largest = i;
			}
			
			if (i < smallest) {
				smallest = i;
				
			
			}
		}
		
		System.out.println(sum);
		System.out.println(product);
		System.out.println(largest);
		System.out.println(smallest);
		
	

	
	}
}

