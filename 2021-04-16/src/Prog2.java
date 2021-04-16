// 금액의 부가세와 잔돈을 출력하는 프로그램
import java.util.Scanner;

public class Prog2 {
	public static void main(String[] args) {
		double won, sum, tax, remain;		
		Scanner input = new Scanner(System.in);

		System.out.print("받은 돈 : ");
		won = input.nextInt();
		System.out.print("상품의 총액 : ");
		sum = input.nextInt();
		
		tax = sum * 0.1;
		remain = won - sum;
		System.out.printf("부가세 : %.0f\n", tax);
		System.out.printf("잔돈 : %.0f\n", remain);
	}
}
