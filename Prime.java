package standard_programs;
import java.util.*;
public class Prime {
	static Scanner scan=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("please enter the number: ");
		int m=scan.nextInt();
		
		int count=0;
		for (int i =1; i<=m/2; i++) {
			if(m%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(m+" is a Prime number. ");
		}
		else {
			System.out.println(+m+" is not a Prime number. ");
		}
	}
}
