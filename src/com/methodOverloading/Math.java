package com.methodOverloading;

public class Math {
	
	
	
	public void multiply(int a, int b) {
		System.out.println((a+b));
		
	}
public void multiply(int a, int b, int c) {
		System.out.println(((a*b)*c));
	}
public void multiply() {
	System.out.println("Nothing to multiply");
	
}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Math m = new Math();
		m.multiply(2, 3);
		m.multiply(2, 3, 4);
		m.multiply();

	}

}
