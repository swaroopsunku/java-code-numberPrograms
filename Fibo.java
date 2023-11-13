package standard_programs;

public class Fibo {
public static void main(String[] args) {
	int a=0,b=1,res;
	System.out.print(a+" ");
	System.out.print(b+" ");
	while(true) {
		res=a+b;
		if(res<=100) {
			System.out.print(res+" ");
		}
		else {
			break;
		}
		a=b;
		b=res;
	}

	}
}
