package com.gl.prework;

public class Factorial {
	
	public int findFactorial(int num) {
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factor = new Factorial();
		int result = factor.findFactorial(6);
		System.out.println("The Factorial is: "+result);
	}

}
