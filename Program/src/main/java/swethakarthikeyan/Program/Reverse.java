package swethakarthikeyan.Program;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int reverse=0;
		while(number>0) {
			reverse =reverse*10+(number%10);
			number/= 10;
		}
		System.out.println("the reverse of the given number is : "+reverse);
	}

}
