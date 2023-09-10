package assignments.constructor;

public class ConstOverloading {
	
	int value1;
	int value2;
	
	ConstOverloading(){
		value1 = 10;
		value2 = 20;
		System.out.println("Inside 1st Constructor");
	}

	ConstOverloading(int a){
		value1 = a;
		System.out.println("Inside 2nd Constructor");
	}
	
	ConstOverloading(int a , int b){
		value1 = a; 
		value2 = b;
		System.out.println("Inside 3rd Constructor");
	}
	
	public void display() {
		System.out.println("Value 1 == "+value1);
		System.out.println("Value 2 == "+value2);
	}
	
	
	public static void main(String[] args) {
		ConstOverloading c1 = new ConstOverloading();
		c1.display();
		ConstOverloading c2 = new ConstOverloading(30);
		c2.display();
		ConstOverloading c3 = new ConstOverloading(50,60);
		c3.display();

	}

}
