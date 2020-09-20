package com.MethodOverriding2;



public class Student extends Person{
	
	int roll;
	
	@Override
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Roll :"+roll);
		}

		
	
		
		

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.name = "Khan";
		obj.age = 30;
		obj.roll = 10;
		obj.display();
			}


}
