
public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Begin main");
		Calculator c = new Calculator();
		int a = c.divide(10, 4);
		System.out.println("a= " + a);
		int b = c.divide(25, 0);
		System.out.println("b= " + b);
		int d = c.divide(90, 3);
		System.out.println("d= " + d);
		System.out.println("End main");

	}

}

class Calculator {
	int divide(int num, int deno) {
		System.out.println("Numerator is " + num);
		System.out.println("Denominator is " + deno);
		System.out.println("Dividing.....");
		int div = 0, k = 0;
		try {
			div = num / deno;
		} catch (ArithmeticException e) {

			System.out.println("You should not divide a number by zero");
			k = -1;
		}
		if (k == -1) 
			System.out.println("Division not Done!!\n");
		else
				System.out.println("Done!!\n");
		
		return div;
	}
}