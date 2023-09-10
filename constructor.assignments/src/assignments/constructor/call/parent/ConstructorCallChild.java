package assignments.constructor.call.parent;

public class ConstructorCallChild extends ConstructorCallParent {

	public ConstructorCallChild() {
		//Compiler adds super() here at the first line of this constructor implicitly.
		System.out.println("Child Class Constructor");
	}
	
	public ConstructorCallChild(int num) {
		//Compiler adds super() here at the first line of this constructor implicitly.
		System.out.println("Constructor with Argument");
	}
	void display() {
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		ConstructorCallChild c = new ConstructorCallChild();
		c.display();
		
		ConstructorCallChild c1 = new ConstructorCallChild(10);
		c1.display();

	}

}
