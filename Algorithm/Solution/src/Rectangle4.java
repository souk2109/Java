import java.util.Scanner;
/*
 * 예샹 출력
 * input : 4
 * 1 2 3 4 
 * 2 4 6 8 
 * 3 6 9 12 
 * 4 8 12 16 
 * 
 */ 
public class Rectangle4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
	}
}
