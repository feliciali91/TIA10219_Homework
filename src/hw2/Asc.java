package hw2;

public class Asc {

	/* 輸出正三角形英文字母排序 */

	public static void main(String[] args) {

		for (char i = 'A'; i <= 70; i++) { // A的ASCII值為65,F的ASCII值為70
			for (int j = 65; j <= i; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

	}

}
