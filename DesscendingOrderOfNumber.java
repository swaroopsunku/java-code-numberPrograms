package number;

public class DesscendingOrderOfNumber {
	public static void main(String[] args) {
		long a=4186417351363987l;
		long rev=0;
		for (int i = 9; i > 0; i--) {
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
