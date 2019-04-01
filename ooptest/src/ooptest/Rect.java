package ooptest;

public class Rect implements Sharp {
	private float hight;
	private float wight;

	public Rect(float h, float w) {
		this.hight = h;
		this.wight = w;
	}

	@Override
	public float area() {
		System.out.println("compute sharp area");
		return this.hight * this.wight;
	}
	
	@Override
	public String getName() {
		return "Rect class";
	}
}
