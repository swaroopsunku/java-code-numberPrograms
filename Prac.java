package demo;

public class Prac {
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			int count=0;
			int temp=i;
            int j=1;
			while(j<=temp) {
				if(temp%j==0) {
					count++;
				}
				j++;
			}
			if(count==2) {
				System.out.println(i);
			}
			i++;
		}
		
	}
}
