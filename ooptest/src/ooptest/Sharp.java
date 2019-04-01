package ooptest;

public interface Sharp {
	float area();
	
	default String getName() {
		return "sharp class";
	}

}
