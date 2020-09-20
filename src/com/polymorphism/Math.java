package com.polymorphism;//also called overloading

public class Math {
	
	
	public void add(int a, int b) {//method name must be same and parameter must be different
		System.out.println(a+b);
	}
public void add(int a, int b, int c ) {
	System.out.println(a+b+c);
	}
public void add() {
	System.out.println("Nothing to add");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math m = new Math();
		m.add(5, 10);
		m.add(5, 10, 20);
		m.add();
		
		

	}

}//creating multiple method with same name// to perform single action in different way
