package basic;

public class Pet extends Animal implements GetName{
	@Override
	void breath() {
		System.out.println("������ ���� ���ϴ�.");
	}
	void bark() {
		System.out.println("¢���ϴ�.");
	}
	@Override
	public void getName2() {
		System.out.println("�̸��� : "+this.getName());
		
	}
	
}
