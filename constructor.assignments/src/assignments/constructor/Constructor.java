package assignments.constructor;

public class Constructor {
	
	Constructor(){
		System.out.println("Default Constructor");
	}
	
	Constructor(int a){
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {
		
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10);


	}

}
