package basic;

public class Pet extends Animal implements GetName{
	@Override
	void breath() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	void bark() {
		System.out.println("짖습니다.");
	}
	@Override
	public void getName2() {
		System.out.println("이름은 : "+this.getName());
		
	}
	
}
