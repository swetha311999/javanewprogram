package swethakarthikeyan.Program;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("tell the table number:");
		int num=scan.nextInt();
		System.out.println("tell the staring range:");
		int start=scan.nextInt();
		System.out.println("tell the ending range:");
		int end=scan.nextInt();
		do
		{
			System.out.println(start+"*"+num+"="+(start*num));
			start++ ;
		}
		while(start<=end);
		
	}

}
