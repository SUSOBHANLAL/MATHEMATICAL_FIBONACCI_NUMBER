package practice_fribbonacci;

public class susbhan {
	public static void main(String args[]) {
		int n =0;
		int sum =0;
		
		int  a =0,b=1;
		if(n==0) {
			System.out.print(n);
		}
		else if(n==1) {
			System.out.print(a+" "+b);
		}
		else if(n>=2)
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i=2;i<n;i++) {
				sum= a+b;
				a= b;
				b= sum;
				System.out.print(sum+" ");
			}
			
			
			
		}
	}

}
