package swethakarthikeyan.Program;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=9;i<=15;i++);
		{
			System.out.println("tell us the reason for visiting");
			String reason=scan.nextLine();
			switch(reason) {
			
			case "moneyOdering":System.out.println("go to 5 th counter.");break;
			case "depositeMoney":System.out.println("go to 7 th counter.");break;
			case "AadharCard":System.out.println("update Aadhar and go to 2 nd counter.");break;
			}
		}
	}

}
