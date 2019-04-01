package ooptest;

public abstract class Persion {
	private String name;//抽象类可以有自己的属性
	
	public abstract void run(); //定义一个抽象方法
	
	protected abstract String getName();//抽象方法只能是public 或者protect
	
	public Persion(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("my name is:"+this.name);
	}
	
	public String getPName() {
		return this.name;
	}
}
