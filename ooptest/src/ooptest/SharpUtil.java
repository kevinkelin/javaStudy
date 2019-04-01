package ooptest;

public class SharpUtil {
	
	public double sum(Sharp[] sharps) {		
		/**
		 * 求面积的和
		 */
		double sum = 0;
		for(Sharp s:sharps) {
			sum += s.area();
		}
		return sum;
	}
	
	public boolean islarger(Sharp a,Sharp b) {
		/**
		 * 比较a的面积是否大于b的面积
		 */
		return a.area() > b.area();
		
	}

}
