package hw2;

public class Lotto {

	/* 樂透數字1~49排除數字4總共有哪些和幾個 */

	public static void main(String[] args) {

		int sum = 0;
		for (int num = 1; num <= 49; num++)

			if (num % 10 != 4 && num / 10 != 4) {
				System.out.print(num + " ");
				sum++;

				if (sum % 5 == 0)
					System.out.println();
			}

		System.out.println("總共有" + sum + "個");

	}

}
