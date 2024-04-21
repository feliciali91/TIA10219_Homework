package hw1;

public class AreaC {

	/* 4_計算圓面積與圓周長 */
	
	public static void main(String[] args) {

		double pi = 3.1415, r = 5;
		double area = r * r * pi;
		double c = (r * 2) * pi;
		System.out.println("圓面積為" + Math.round(area) + " , " + "圓周長為" + Math.round(c));

	}

}