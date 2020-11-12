package basic;

public class Person extends Animal implements GetName{
	@Override
	void breath() {
		System.out.println("사람이 숨을 쉽니다.");
	}	
	void game() {
		System.out.println("게임을 합니다.");
	}
	
	void programing() {
		System.out.println("개발을 합니다.");
	}
	@Override
	public void getName2() {
		System.out.println("이름은 : "+ this.getName());
	}
}
