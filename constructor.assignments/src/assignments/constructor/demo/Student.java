package assignments.constructor.demo;

public class Student {
	private int id;
	private String name;
	private int age;
	
	Student(){
		id = 100;
		name = "Sejal";
		age = 22;
	}
	
	Student(int a, String b, int c){
		id = a;
		name = b;
		age = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
}
