import java.util.Scanner;

// 입력된 수의 각 자릿수 합 구하기
public class SumNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		int result = 0;
		while(num>0) {
			result += num %10;
			num = num/10;
		}
		System.out.print("결과는 " + result);
	}

}
