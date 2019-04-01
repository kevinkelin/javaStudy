package ooptest;

/**
  *  可以在类中再定义一个类
 * @author Yang
 *
 */
class Animal{
	public String name;
	public int age;
	
	public Animal(String name,int age) {
		this.name = "inner class:"+name;
		this.age = age;
	}
}

public class Main {	
	public static void main(String[] args) {
		Student s = new Student("杨彦星");//可以实例化Student
		s.say();
		s.run();
		
		//Persion p = new Persion("fan"); //不能实例化一个抽象类
		//要想实例化，除非定义它的抽象方法run
		Persion p = new Persion("fan") {
			
			@Override
			public void run() {
				System.out.println("Persion is running....");
				
			}

			@Override 
			protected String getName() {
				return "tem name";
			}
		};
		p.run();
		
		//多态
		Persion ss = new Student("yang"); //抽象类指向子类引用
		ss.run();
		ss.say();
		System.out.println(ss.getName());
		
		// 接口类的使用
		Sharp r = new Rect(3, 4);
		System.out.printf("Rect r's area:%f\n", r.area());
		Sharp c = new Circle(4);
		System.out.printf("Circle c's ares:%f\n",c.area());
		System.out.println(r.getName());
		System.out.println(c.getName());
		SharpUtil su = new SharpUtil();
		System.out.println(su.islarger(r, c));	
		Animal aaa = new Animal("dog", 12);
		System.out.println(aaa.age);
	}
}
