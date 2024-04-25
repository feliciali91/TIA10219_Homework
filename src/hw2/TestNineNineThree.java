package hw2;

/* 九九乘法表_while + do_while迴圈 */

public class TestNineNineThree {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
