// 직사각형의 둘레와 면적 구하는 프로그램 작성
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		double w, h, parameter, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로 : ");
		w = input.nextDouble();
		
		System.out.print("세로 : ");
		h = input.nextDouble();
		
		parameter = 2 * (w + h);
		area = w * h;
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.print("사각형의 둘레 : " + parameter);
	}

}
