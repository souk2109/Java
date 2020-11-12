package Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ActCalculator actCalculator = new ActCalculator();
		Scanner scan = new Scanner(System.in);
		
		loof : while(true) {
			actCalculator.ResetShow();
			switch (scan.nextInt()) {
			case 1:
				System.out.print("두 수를 입력하시오 : ");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				actCalculator.add(num1, num2);
				actCalculator.minus(num1, num2);
				actCalculator.multiplication(num1, num2);
				actCalculator.division(num1, num2);
				break;
			case 2:
				System.out.println("종료합니다.");
				break loof;
			}
		}
	}
}
