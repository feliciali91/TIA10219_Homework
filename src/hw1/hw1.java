package hw1;

public class hw1 {

	public static void main(String[] args) {

		/* 1_計算和與積 */
		int num1 = 12, num2 = 6;
		int sum = num1 + num2, mul = num1 * num2;
		System.out.println(sum + " " + mul);

		/* 2_計算雞蛋幾打幾顆 */
		int egg = 200, dozen = 12;
		int totalDozen = egg / dozen, remainder = egg % dozen;
		System.out.println(totalDozen + "打" + remainder + "顆");

		/* 3_計算幾天幾小時幾分幾秒 */
		int count = 256559, hour = 24, mins = 60, sec = 60;
		int totalDay = 0, remainHr = 0, totalHr = 0, remainMin = 0, totalMin = 0, remainSec = 0;

		totalDay = count / (hour * mins * sec);
		remainHr = count % (hour * mins * sec);
		totalHr = remainHr / (mins * sec);
		remainMin = remainHr % (mins * sec);
		totalMin = remainMin / sec;
		remainSec = remainMin % sec;

		System.out.print(totalDay + "天" + totalHr + "小時" + totalMin + "分" + remainSec + "秒");
		System.out.print(totalHr + "小時");
		System.out.print(totalMin + "分");
		System.out.println(remainSec + "秒");

		/* 4_計算圓面積與圓周長 */
		double pi = 3.1415, r = 5;
		double area = r * r * pi;
		double c = (r * 2) * pi;
		System.out.println("圓面積為" + Math.round(area) + "," + "圓周長為" + Math.round(c));

		/* 5_複利計算 */
		int presentValue = 1_500_000, year = 10;
		double rate = 0.02;
		double futureValue = presentValue * Math.pow(1 + rate, year);		// 本利和 = 本金 × (1 + 年利率)^期間
		System.out.println("本金加利息為" + Math.round(futureValue));

		/* 6_運算結果分別解釋 */
		System.out.println(5 + 5);				 // 此時加號為運算子,將兩個整數5的計算相加
		System.out.println(5 + '5');			// 此時加號為運算子,先將字元'5'轉換為數字53再與前方整數5相加
		System.out.println(5 + "5");			// 此時加號為連接作用,將整數5與雙引號的字元"5"相接在一起

	}

}
