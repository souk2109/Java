import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num = scan.nextInt();
		int result = 1;
		
		for(int i=num; i>0; i-- ) 
		{
			result *= i;
		}
		System.out.print("결과 : " + result);
	}

}
