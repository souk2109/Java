import java.util.Scanner;

public class findGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		int max_num, min_num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input two number : ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 > num2) 
		{
			max_num = num1;
			min_num = num2;
		}
		else 
		{
			max_num = num2;
			min_num = num1;
		}
		
		while(true) 
		{
			int remainder = max_num % min_num;
			if(remainder != 0 ) 
			{
				max_num = min_num;
				min_num = remainder;
			}
			else 
			{
				System.out.println("GCD is " + min_num);
				break;
			}
			
		}
	}

}
