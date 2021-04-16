// 화씨온도를 입력받아 섭씨온도로 변환하여 출력하는 프로그램 작성
import java.util.Scanner;

public class Prog04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double f, c;
		
		System.out.print("화씨온도 : ");
		f = input.nextDouble();
		c = 5.0 / 9 * (f - 32);
		
		System.out.print("섭씨온도 : " + c);
	}

}
