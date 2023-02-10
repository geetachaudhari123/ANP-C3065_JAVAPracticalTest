package placement;//package

import java.util.Scanner;

public class Functions //*********class********//
{
      public static  int calulatesum(int a,int b) {//**********method*******//
           int  sum=a+b;
            return sum;
       }
{

}
public static void main(String[] args) {//main method
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int sum=calulatesum(a, b);
         System.out.println("adddition"+sum);
	}

}
