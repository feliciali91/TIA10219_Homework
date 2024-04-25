package hw2;

/* 九九乘法表_for + do_while迴圈 */

public class TestNineNineTwo {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
}
