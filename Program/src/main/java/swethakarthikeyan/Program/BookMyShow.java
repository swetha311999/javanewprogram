package swethakarthikeyan.Program;
import java.util.Scanner;
public class BookMyShow {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("wlecome to bookmyshow choose the movie you wish to watch :");
		String moviename=scan.nextLine();
		System.out.println("select the snacks :");
		String snacks=scan.nextLine();
		System.out.println("tell us the number of tickets :");
		short tickets= scan.nextShort();
		int netAmount=tickets*150;
		System.out.println("you have selected "+moviename+" and the snacks is "+snacks+" and the total tickets is "+tickets+" and you have to pay "+netAmount);
	}

}
