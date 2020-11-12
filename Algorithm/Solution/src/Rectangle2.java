import java.util.Scanner;

/*
 * 예샹 출력
 * input : 3
 * 1 2 3
 * 6 5 4
 * 7 8 9 
 * 
 * 해결방법 : 짝수 행과 홀수 행을 나눠서 생각해본다.
 * 홀수행은 순차적으로 숫자를 채우고, 짝수행은 역순으로 숫자를 채운다.
 * 채우는 값은 등차수열의 공식을 사용해서 큰 변화없이 채웠다. 
 * 
 */ 
public class Rectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			// 홀수 행일 경우
			if(i%2 == 1) {
				for(int j=0; j<num; j++) {
					System.out.print(1 + (i-1)*num + j + " ");
				}
				System.out.println();
			}
			// 짝수 행일 경우
			else {
				for(int j=num; j>0; j--) {
					System.out.print(1 + (i-1)*num + j-1 + " ");
				}
				System.out.println();
			}
		}
	}

}
