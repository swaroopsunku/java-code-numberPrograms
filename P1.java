package grooming;

public class P1 {
	public static void main(String[] args) {
		int num=5461,sum=0;
		while(num>0||sum>9) {
			if (num==0) {
				num=sum;
				sum=0;
			}
			sum+=num%10;
			System.out.println(sum);
			num/=10;
		}
		System.out.println(sum);
	}
	
}
