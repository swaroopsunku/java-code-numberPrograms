package grooming;

public class P2 {
	public static void main(String[] args) {
		for (int i = 1; i <=35; i++) {
			int num=i;
			while (num>0) {
				if (num%10==2) {
					System.out.println(i);
				}
				num/=10;
			}
		}
	}
}
