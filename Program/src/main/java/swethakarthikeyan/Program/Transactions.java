package swethakarthikeyan.Program;
import java.util.Scanner;
public class Transactions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char process= '\0';
		int DebitCount=0,CreditCount=0,FundCount=0,InterestCount=0;
		for (int each=1;each<=10;each++)
		{
			System.out.println(" Tell us transaction type  D/c/f/i :");
			process=scan.next().charAt(0);
			if(process=='c'||process=='C')
				CreditCount++;
			else if(process=='d'|| process=='D')
				DebitCount++;
			else if(process=='f'||process=='F')
				FundCount++;
			else if (process=='i'||process=='I')
				InterestCount++;
			
		}
		System.out.println("no of debit done is :"+DebitCount);
		System.out.println("no of credit done is :"+CreditCount);
		System.out.println("no of fund done is :"+FundCount);
		System.out.println("no of interest done is :"+InterestCount);
			

}
}
