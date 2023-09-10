package assignments.constructor.chaining;

public class ConstructorChaining {
	public ConstructorChaining() {
		System.out.println("Default Constructor");
	}
	public ConstructorChaining(String str) {
		this();
		System.out.println("Parameterized Constructor with Single Parameter");
	}
	public ConstructorChaining(String str, int num) {
		this("Hello");
		System.out.println("Parameterized Constructor with two Parameter");
	}
	public ConstructorChaining(int num1, int num2, int num3) {
		this("Hii",5);
		System.out.println("Parameterized Constructor with three Parameter");
	}

	public static void main(String[] args) {
	
		ConstructorChaining c = new ConstructorChaining(6,7,8);
	}

}
