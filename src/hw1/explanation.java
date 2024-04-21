package hw1;

public class explanation {

	/* 6_運算結果分別解釋 */

	public static void main(String[] args) {

		System.out.println(5 + 5);			// 此時加號為運算子,將兩個整數5的計算相加
		System.out.println(5 + '5');		// 此時加號為運算子,先將字元'5'轉換為數字53再與前方整數5相加
		System.out.println(5 + "5"); 		// 此時加號為連接作用,將整數5與雙引號的字元"5"相接在一起

	}

}