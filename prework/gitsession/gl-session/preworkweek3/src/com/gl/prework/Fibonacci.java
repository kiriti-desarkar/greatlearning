package com.gl.prework;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for which you"+
		"want fibonacci number");
		num1 = sc.nextInt();
		
		int tot1 =0;
		int tot2 = 1;
		int tot3 =0;
		for(int i=0; i<num1;i++) {
			if(i<=1) {
			System.out.print(tot3+" ");
			tot3 = tot1+tot2;
			} else if(i==2) {
				System.out.print(tot3+" ");
			}else {
				tot1 = tot2;
				tot2 = tot3;
				tot3 = tot1+tot2;
			System.out.print(tot3+ " ");
			}
		}
		
		sc.close();
	}

}
