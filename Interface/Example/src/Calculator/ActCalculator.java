package Calculator;

public class ActCalculator implements CalculateInterface{
	public void ResetShow() {
		System.out.println("-------------------------");
		System.out.println("����� �ϰ� ������ 1���� �Է��ϼ���. ");
		System.out.println("�׸��ϰ� ������ 2���� �Է��ϼ���. ");
		System.out.print("�Է� : ");
	}
	@Override
	public void add(float num1, float num2) {
		System.out.println("���ϱ� ����� : "+ (num1 + num2));
	}
	
	@Override
	public void minus(float num1, float num2) {
		System.out.println("���� ����� : "+ (num1 - num2));
	}

	@Override
	public void multiplication(float num1, float num2) {
		System.out.println("���ϱ� ����� : "+ (num1 * num2));
	}

	@Override
	public void division(float num1, float num2) {
		System.out.println("������ ����� : "+ (num1 / num2));
	}
}
