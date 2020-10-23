package swethakarthikeyan.Program;
import java.util.Scanner;
public class Series {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int sum=0;
	System.out.println("to find the series of the given number");
	int number=scan.nextInt();
	for(int i=1;i<=10;i++) {
		
		sum+=number*i;
		
	}
	System.out.println(sum+" is the series of "+number);
}
}
