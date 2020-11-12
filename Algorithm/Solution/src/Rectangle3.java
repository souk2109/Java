import java.util.Scanner;
/*
 * 예샹 출력
 * input : 3
 * 1 4 7 
 * 2 5 8 
 * 3 6 9   
 * 
 * 해결방법 : 공차가 num인 것을 이용하여 등차수열 공식 사용
 * 
 */ 
public class Rectangle3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(i + (j-1) * num + " ");
			}
			System.out.println();
		}
	}
}
