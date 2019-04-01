package ooptest;

public class Student extends Persion {

	public Student(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Student ins Running....");
		
	}

	@Override
	// 抽象父类是protected,子类可以是protected，也可以是public
	public String getName() {
		return this.getPName();
	}
	
	

}
