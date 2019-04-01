package ooptest;

public class Circle implements Sharp {
	private float rudis;
	
	public Circle(float r) {
		this.rudis = r;
	}

	@Override
	public float area() {
		System.out.println("compute circle area ....");
		return (float) (Math.PI * this.rudis * this.rudis);
	}

}
