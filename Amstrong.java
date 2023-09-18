package standard_programs;
import java.util.*;
public class Amstrong {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the number : ");
		int num =scan.nextInt();
		
		int n=num,sum=0,rem,count=0;
		while(num!=0) {
			rem=num%10;
			count++;
			num/=10;
		}
		num=n;
		while(num!=0){
			rem=num%10;
			sum=sum+power(rem,count);
			num=num/10;
		}
		
		if(sum==n){
			System.out.println(n+" is an Armstrong number.");
		}
		else{
			System.out.println(n+" is not an Armstrong number.");
		}
	}
	private static int power(int m,int n) {
		int pro=1;
		for (int i =1; i <=n; i++) {
			pro=pro*m;
		}
		return pro;
	}
}
