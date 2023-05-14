package com.gl.prework;

public class Tables {
	
	public void printTables(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"X"+i+"="+num*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables tab1 = new Tables();
		tab1.printTables(5);
	}

}
