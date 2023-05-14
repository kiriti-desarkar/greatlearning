package com.gl.prework;

public class TriangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i = rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
