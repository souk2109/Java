package basic;

public class Person extends Animal implements GetName{
	@Override
	void breath() {
		System.out.println("����� ���� ���ϴ�.");
	}	
	void game() {
		System.out.println("������ �մϴ�.");
	}
	
	void programing() {
		System.out.println("������ �մϴ�.");
	}
	@Override
	public void getName2() {
		System.out.println("�̸��� : "+ this.getName());
	}
}
