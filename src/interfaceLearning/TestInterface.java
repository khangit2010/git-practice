package interfaceLearning;

interface Animal{
	 
	 void display1();//
	 
	 }	 
	 
	interface Dog{
		 void display2();
		 
	}
	interface Cat{
		void display3();
			
		}
	 
 class TestInterface implements Animal,Dog,Cat {
	 
	
	public void display1() {
		 System.out.println("Animal has their own language");
	 }
	public void display2() {
		 System.out.println("Dog says 'Woof' 'Woof'");
	 }
	public void display3() {
		 System.out.println("Cat says 'Meow' 'Meow");
	 }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestInterface obj = new TestInterface();
		obj.display1();
		obj.display2();
		obj.display3();
	}
	
		
	}


