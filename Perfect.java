package standard_programs;
import java.util.*;
public class Perfect {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
	System.out.print("Enter the Number :");
	int n=scan.nextInt();
	if(isPerfect(n))
		System.out.println(n+" : is a Perfect number");
	else
		System.out.println(n+" : is not a Perfect number");
	
	}
	
	static boolean isPerfect(int n){
        if (n == 1)
            return false;
        int sum=0;
        for (int i = 1; i < n; i++) { 
            if (n % i == 0) {
                sum += i;
            }
        }
            if (sum == n) {
                return true;
            }
            else {
            	return false;
            }
	}
}
