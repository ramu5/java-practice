// 구의 반지름을 입력받아 구의 부피를 계산하여 출력하는 프로그램
import java.util.Scanner;

public class Prog03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius, volume;
		System.out.print("구의 반지름 : ");
		radius = input.nextDouble();
		volume = 4.0 / 3 * 3.14 * radius * radius * radius;
		System.out.print("구의 부피 : " + volume);
	}

}
