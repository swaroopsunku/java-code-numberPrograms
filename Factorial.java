package standard_programs;
import java.util.*;
public class Factorial {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num =scan.nextInt();
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of '"+num+"' is : "+fact);
	}
}
