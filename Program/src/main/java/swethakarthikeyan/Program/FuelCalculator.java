package swethakarthikeyan.Program;
import java.util.Scanner;
public class FuelCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("tell us fuel in liters :");
		double liters=scan.nextDouble();
		System.out.println("how many kms have travelled :`");
		double kms=scan.nextDouble();
		System.out.printf("Fuel is used in 100 kms is: %.2f ",((liters/kms)*100));
		System.out.printf("\nFuel used in 50 kms is : %.2f ",((liters/kms)*50));
	}

}
