import java.util.*;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a value\n");

			int a = scan.nextInt();

			System.out.println("Open file");
			System.out.println("open databse");
			System.out.println("............");
			if (a > 10)
				throw new RuntimeException("Throw");
			System.out.println("............");
			System.out.println("............");

		} catch (RuntimeException e) {
			System.out.println("Problme:" + e);
		}

		finally {
			System.out.println("Finally runs always");
			System.out.println("Closing database");
			System.out.println("Closing file");
		}
		scan.close();
	}

}
