package hw1;

public class Day {
	
	/* 3_計算幾天幾小時幾分幾秒 */
	
	public static void main(String[] args) {
					
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
		
	}
	
}
