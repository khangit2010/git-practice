package com.Encapsulation2;

public class Person {//class categorized as Person
	
		private String name;//name is a string(data) type of variable//access modifier as 
		                                                                 //private
		private int age;  // age is an integer type of variable//
		
		
public String getName() {
			return name;
		}

public void setName(String name) {
			this.name = name;
		}


public int getAge() {
			return age;
		}


public void setAge(int age) {
			this.age = age;
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person obj = new Person();
     obj.setName("Khan");
     obj.setAge(40);
     System.out.println(obj.getName());
     System.out.println(obj.getAge());
     
     
	}//Data hiding for security//to reuse data//cod can be modified without breaking the cod

}