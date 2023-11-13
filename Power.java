package standard_programs;
import java.util.*;
public class Power {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Enter the Base number : ");
		int m =scan.nextInt();
		System.out.print("Enter the Power number : ");
		int n =scan.nextInt();
		
		int res=1;
		for(int i=1;i<=n;i++){
			res=res*m;
		}
		System.out.println(m+" power "+n+" is : "+res);
	}
}
