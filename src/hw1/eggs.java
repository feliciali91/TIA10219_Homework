package hw1;

public class Eggs {
	
	/* 2_計算雞蛋幾打幾顆 */
	
	public static void main(String[] args) {
		
		int egg = 200, dozen = 12;
		int totalDozen = egg / dozen, remainder = egg % dozen;
		System.out.println(totalDozen + "打" + remainder + "顆");
	
	}
	
}
