package Calculator;

public class ActCalculator implements CalculateInterface{
	public void ResetShow() {
		System.out.println("-------------------------");
		System.out.println("계산을 하고 싶으면 1번을 입력하세요. ");
		System.out.println("그만하고 싶으면 2번을 입력하세요. ");
		System.out.print("입력 : ");
	}
	@Override
	public void add(float num1, float num2) {
		System.out.println("더하기 결과는 : "+ (num1 + num2));
	}
	
	@Override
	public void minus(float num1, float num2) {
		System.out.println("빼기 결과는 : "+ (num1 - num2));
	}

	@Override
	public void multiplication(float num1, float num2) {
		System.out.println("곱하기 결과는 : "+ (num1 * num2));
	}

	@Override
	public void division(float num1, float num2) {
		System.out.println("나누기 결과는 : "+ (num1 / num2));
	}
}
