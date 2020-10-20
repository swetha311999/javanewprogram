package swethakarthikeyan.Program;
import java.util.Scanner;
public class BitwiseOperator {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String PackName=""; short PackValue=0;
		long CustomerId=0L; int PackDays=0;
		System.out.println("tell the package name :");
		PackName =scan.nextLine();
		System.out.println(" tell pack value :");
		PackValue = scan.nextShort();
		System.out.println("tell customer id :");
		CustomerId = scan.nextLong();
		System.out.println("tell no of pack days :");
		PackDays= scan.nextInt();
		System.out.println("Your package is "+PackName+" with the customer id "+CustomerId+" and the value is "+PackValue+" and validate for "+PackDays);
	}

}
