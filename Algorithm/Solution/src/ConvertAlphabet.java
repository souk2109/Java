import java.util.Scanner;

// 대문자 -> 소문자, 소문자 -> 대문자 변환 프로그램

public class ConvertAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하시오 :");
		String str = scan.nextLine();
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] >= 'a' && arr[i] <='z') 
			{
				arr[i] = (char) (arr[i] + ('A' - 'a'));
			}
			else if(arr[i] >= 'A' && arr[i] <='Z') 
			{
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		System.out.print(arr);
	}

}
