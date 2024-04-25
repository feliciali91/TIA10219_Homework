package hw2;

public class Sum {

	public static void main(String[] args) {

		/* 計算1到1000的偶數和 */
		int sum = 0;
		int num = 1;
		while ((2 * num) <= 1000) {
			sum += 2 * num;
			num++;
		}
		System.out.println("1~1000的偶數和為" + sum);

		/* 使用for迴圈計算1到10的連乘積 */
		int sum2 = 1;
		for (int num2 = 2; num2 <= 10; num2++) {
			sum2 = sum2 * num2;
		}
		System.out.println("1~10的連乘積為" + sum2);

		/* 使用while迴圈計算1到10的連乘積 */
		int sum3 = 1;
		int num3 = 2;
		while (num3 <= 10) {
			sum3 = sum3 * num3;
			num3++;
		}
		System.out.println("1~10的連乘積為" + sum3);

		/* 輸出數字結果 */
		int num4 = 1;
		while (num4 <= 10) {
			System.out.print((int) Math.pow(num4, 2) + " ");
			num4++;
		}

	}

}
