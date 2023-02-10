package placement;

import java.util.Scanner;

public class MultiplyFunction {
	public static int factorial(int n) {
		int factorial=1;
		for(int i=0;i>=1;i--)
			factorial=factorial*i;
		
	

		System.out.println(factorial);{
			return factorial;
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         factorial(n);
      
         System.out.println(+factorial(n));
       
	}

}
