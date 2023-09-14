package grooming;

public class P3 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int extreme=0,mean=0;
		for (int i = 0; i < a.length; i++) {
			if (i==0||i==a.length-1) {
				extreme+=a[i];
			} else {
				mean+=a[i];
			}
		}
		System.out.println(extreme);
		System.out.println(mean);
		
	}
}
