package swethakarthikeyan.Program;
import java.util.Scanner;
public class Binaries {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("tell us the number : ");
		int number=scan.nextInt();
		StringBuffer m= new StringBuffer();
		while(number>0) {
			m.append(number%2);
			number/=2;
		}
		System.out.println(m.reverse().toString());
		
				
	}

}
