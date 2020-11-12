import java.util.Scanner;
/*
 * 예샹 출력
 * input : 12231
 * 0: 0
 * 1: 2
 * 2: 2
 * 3: 1
 * 4: 0
 * 5: 0
 * 6: 0
 * 7: 0
 * 8: 0
 * 9: 0
 * 
 */ 
public class CountEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		int remainder = 0;

		// input으로부터 0~9 까지 나온 횟수를 저장하는 배열
		int [] num_arr = new int[10];
		
		while(num>0) {
			remainder = num % 10;
			num_arr[remainder] ++;
			num = num/10;
		}
		for(int i=0;i<10;i++)
			System.out.println(i + ": " + num_arr[i]);
	}
}
