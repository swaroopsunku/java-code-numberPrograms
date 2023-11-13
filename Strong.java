package standard_programs;
import java.util.*;
public class Strong {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num =scan.nextInt();
		
		int sum=0,n=num;
		while(num!=0){
			int rem=num%10;
			sum=sum+fact(rem);
			num=num/10;
		}
		if(sum==n){
			System.out.println(n+" is a strong number.");
		}
		else{
			System.out.println(n+" is not a strong number.");
		}
	}
	public static int fact(int rem){
		int f=1;
		for(int i=1;i<=rem;i++){
			f=f*i;
		}
		return f;
	}
}
