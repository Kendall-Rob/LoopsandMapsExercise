package Calculator;

public class JavaCalculator {
	
	//INSTANCE VARIABLES
	private int num1;
	private int num2;
	private int num;
	
	
	//SETTER
	public void setCal(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void setNum(int num3) {
		this.num = num;
	}
	
	//GETTER
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	public int add(int num1, int num2) {
		//setCal(num1, num2);
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		setCal(num1, num2);
		return num1 - num2;
	}
	
	public int multiplication(int num1, int num2) {
		setCal(num1, num2);
		return num1 * num2;
	}
	
	public int division(int num1, int num2) {
		setCal(num1, num2);
		return num1 / num2;
	}
	
	public int square(int num1, int num2) {
		setCal(num1, num2);
		return  (int) Math.pow(num1, num2);
	}
	
	public int squareRoot(int num3) {
		setNum(num3);
		return (int) Math.sqrt(num3);
	}
	
	public int sin(int num3) {
		setNum(num3);
		return (int) Math.sin(num3);
	}
	
	public double cosine(int num3) {
		setNum(num3);
		return (int) Math.cos(num3);
	}
	
	public double tangent(int num3) {
		setNum(num3);
		return (int) Math.tan(num3);
	}
	
	public int factorial(int num3) {
		setNum(num3);
		
		int sum = num3;
		
		for(int i = 1; i <= num3; i++) {
			sum *= i;
		}
		return sum;
	}
}
