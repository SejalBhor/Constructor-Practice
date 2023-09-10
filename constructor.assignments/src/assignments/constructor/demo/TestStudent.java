package assignments.constructor.demo;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("Default Constructor Calling");
		System.out.println("Student Name is : "+s.getName());
		System.out.println("Student Age is : "+s.getAge());
		System.out.println("Student Id is : "+s.getId());
		
		System.out.println();
		System.out.println("Parameterized Constructor Calling");
		Student s1 = new Student(11,"Tejal",21);
		System.out.println("Student Name is : "+s1.getName());
		System.out.println("Student Age is : "+s1.getAge());
		System.out.println("Student Id is : "+s1.getId());

	}

}
