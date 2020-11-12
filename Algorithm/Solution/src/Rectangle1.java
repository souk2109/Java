import java.util.Scanner;

/*
 * 예샹 출력
 * input : 3
 * 1 2 3
 * 4 5 6
 * 7 8 9 
 * 
 * 해결방법 : 1 4 7 간의 공차를 활용
 * 공식 : 1 + (n-1) * d
 * 변형 : 1 + (i-1) * num
 * 
 */ 

public class Rectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		for(int i=1;i<=num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(1 + (i-1) * num + j + " ");
			}
			System.out.println();
		}
	}
}
