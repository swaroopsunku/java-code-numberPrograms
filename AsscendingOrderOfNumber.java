package number;

import java.util.Iterator;

public class AsscendingOrderOfNumber {
	public static void main(String[] args) {
		long a=4183415351363387l;
		long rev=0;
		for (int i = 1; i < 10; i++) {
			long temp=a;
			
			while(temp!=0) {
				long rem=temp%10;
				if (rem==i) {
					rev=rev*10+rem;
				}
				temp/=10;
			}
			
		}
		System.out.println(rev);
	}
}
