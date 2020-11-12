package basic;
/*
 * 
 * 추상 클래스 특징
 * 1. 메소드 중 하나라도 추상메소드가 있으면 abstract를 붙여줘야한다.
 * 추상메소드가 없으면 abstract 생략가능하다.
 * 
 * 2. getter와 setter 생성가능하다. 
 */

public abstract class Animal {
	int age;
	String name;
	
	abstract void breath();
	
	public void eat() {
		System.out.println("음식을 먹습니다.");
	}
	public void print() {
		System.out.println("저의 이름은 " + this.getName() + ", 나이는 " + this.getAge());
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
