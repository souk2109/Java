import java.util.Scanner;

public class findPrimenumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number : ");
		int num = scan.nextInt();
		
		boolean IsPrimeNumber = true;
		
		if(num == 1 ) 
		{
			System.out.println("it is not primeNumber.");
			IsPrimeNumber = false;
		}
		else if(num == 2)
		{
			System.out.println("it is primeNumber.");
		}
		else 
		{
			for(int i=2; i<=num/2; i++) 
			{
				int remainder = num % i;
				if(remainder == 0) 
				{
					IsPrimeNumber = false;
					break;
				}
			}

			if(IsPrimeNumber == true)
				System.out.println("it is primeNumber.");
			else
				System.out.print("it is not primeNumber.");	
		}
	}

}
