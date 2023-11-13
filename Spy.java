package standard_programs;
import java.util.*;
public class Spy {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num=scan.nextInt();
		int n=num,sum=0,mul=1;
		while(num!=0) {
			int r=num%10;
			sum=sum+r;
			mul=mul*r;
			num/=10;
		}
		if(sum==mul)
			System.out.println(n + " is a Spy number");
		else
			System.out.println(n + " is not a Spy number");
	}
}
