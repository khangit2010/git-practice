package EncapsulationLearning;

public class Account {
	private String Name;

	private int age;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();

		obj.setName("Salim M Khan");
		obj.setAge(40);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

		obj.setName("Khan");
		obj.setAge(40);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}
