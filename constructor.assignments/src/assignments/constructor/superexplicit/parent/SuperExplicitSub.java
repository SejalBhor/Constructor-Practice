package assignments.constructor.superexplicit.parent;

public class SuperExplicitSub extends SuperExplicitParent{
	
	SuperExplicitSub(){
		super(); //super() : it will call parent class constructor. 
		//super() must be added to  the First line of constructor  
		System.out.println("Sub Class Constructor");
	}
	
	void display() {
		System.out.println("Hii");
	}

	public static void main(String[] args) {
		SuperExplicitSub s = new SuperExplicitSub();
		s.display();

	}

}
