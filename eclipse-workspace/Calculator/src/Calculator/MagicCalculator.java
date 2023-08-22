package Calculator;

public class MagicCalculator {

	public static void main(String[] args) {
		
		JavaCalculator magicCalculator = new JavaCalculator();
		//magicCalculator.setCal();
		System.out.println(magicCalculator.add(6, 6));
		System.out.println(magicCalculator.subtract(10, 5));
		System.out.println(magicCalculator.multiplication(20, 10));
		System.out.println(magicCalculator.division(500, 2));
		System.out.println(magicCalculator.square(2, 2));
		System.out.println(magicCalculator.squareRoot(20));
		System.out.println(magicCalculator.sin(90));
		System.out.println(magicCalculator.cosine((int) 8.0));
		System.out.println(magicCalculator.tangent((int)4.5));
		System.out.println(magicCalculator.factorial(5));
		

	}

}
