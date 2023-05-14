package com.gl.prework;

import java.util.Scanner;

public class WhilerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,sqr;
		String ans = "yes";
		
		 while(ans.equals("yes") || ans.equals("YES")) {
		  System.out.println("Enter a Number"); 
		  num1 = sc.nextInt(); 
		  if(num1 >= 100) {
			  System.out.println("Sorry number should be less than 100");
			  //break;
			  continue;
		  }
		  sqr=num1*num1;
		  System.out.println("The square of your number is: "+sqr);
		  System.out.println("Do you wish to continue yes/no"); 
		  ans=sc.next(); 
		  }
		  System.out.println("You are out of loop");
		 
		/* do{
			System.out.println("Enter a Number");
			num1 = sc.nextInt();
			sqr=num1*num1;
			System.out.println("The square of your number is: "+sqr);
			System.out.println("Do you wish to continue yes/no");
			ans=sc.next();
		}while(ans.equals("yes") || ans.equals("YES"));
		System.out.println("You are out of loop"); */
		sc.close();
				
	}

}
