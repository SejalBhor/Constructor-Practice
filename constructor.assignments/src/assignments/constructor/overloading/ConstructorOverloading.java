package assignments.constructor.overloading;

public class ConstructorOverloading {
	 
	private int rollNo;
	
	ConstructorOverloading(){
		rollNo =100;
	}
	
	ConstructorOverloading(int num){
		this();   //this() is used to call default Constructor
		rollNo = rollNo + num ;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
