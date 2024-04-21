package hw1;

public class FutureValue {

	/* 5_複利計算 */

	public static void main(String[] args) {

		int presentValue = 1_500_000, year = 10;
		double rate = 0.02;
		double futureValue = presentValue * Math.pow(1 + rate, year);		// 本利和 = 本金 × (1 + 年利率)^期間
		System.out.println("本金加利息為$" + Math.round(futureValue));

	}

}
