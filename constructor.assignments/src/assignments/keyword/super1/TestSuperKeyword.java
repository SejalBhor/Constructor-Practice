package assignments.keyword.super1;

public class TestSuperKeyword extends SuperKeyword {

	int num = 20;
	
	public void print() {
		System.out.println(super.num);           //It will give value of num from parent class because of super keyword
	}
	
	public void display() {
		System.out.println("Child class method");
	}
	
	public void msg() {
		super.display();        //because of super keyword it will print parent class method.
	}
	
	public static void main(String[] args) {
		TestSuperKeyword t = new TestSuperKeyword();
		t.print();
		t.msg();
		
		

	}

}
