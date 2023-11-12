package imp_loops;
import java.util.*;
public class Palandrome {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Number :");
		int num=scan.nextInt();
		int rev=0, n=num;
		while(num!=0) {
			int r=num%10;
			rev=(rev*10)+r;
			num/=10;
		}
		if (rev==n) {
			System.out.println(n+" is a palandrome");
		} 
		else {
			System.out.println(n+" is not a palandrome");
		}

	}
}
