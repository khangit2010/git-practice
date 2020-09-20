package methodOverriding;//ability to define a behavior that's specific to the subclass type, 
//which means a subclass can implement a parent class method based on its requirement.

class Person{
	
  String Name ;
  int Age;
  
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("Age :"+Age);
		}
}


class Student extends Person{
	int Roll;
	@Override
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("Age :"+Age);
		System.out.println("Roll :"+Roll);
				
		}
}
	
public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj = new Student();
obj.Name = "Khan";
obj.Age = 40;
obj.Roll = 10;
obj.display();
	}

}
