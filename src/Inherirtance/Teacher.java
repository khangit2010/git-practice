package Inherirtance;

public class Teacher extends Person {//here, person is parent class and Teacher is the 
	//child class//extends is the key for inherit

//all properties of person class already here in hidden

	Long Phone = 7167481082L;

	public void display2() {
		System.out.println("Print name phone number :" + Phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher obj = new Teacher();

		obj.display();
		obj.display2();
	}

}
//to inherit data from parent class//cod reusability//to implement parent-child 
//relationship
//for method overridding
//save time