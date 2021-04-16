// 마일을 킬로미터로 변환하는 프로그램 작성
import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		double mile;
		double km;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오. : ");
		mile = input.nextDouble();
		km = 1.609 * mile;
		
		System.out.print(mile + "마일은 " + km + "킬로미터입니다.");
	}
}
