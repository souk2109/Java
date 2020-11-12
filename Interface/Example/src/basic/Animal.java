package basic;
/*
 * 
 * �߻� Ŭ���� Ư¡
 * 1. �޼ҵ� �� �ϳ��� �߻�޼ҵ尡 ������ abstract�� �ٿ�����Ѵ�.
 * �߻�޼ҵ尡 ������ abstract ���������ϴ�.
 * 
 * 2. getter�� setter ���������ϴ�. 
 */

public abstract class Animal {
	int age;
	String name;
	
	abstract void breath();
	
	public void eat() {
		System.out.println("������ �Խ��ϴ�.");
	}
	public void print() {
		System.out.println("���� �̸��� " + this.getName() + ", ���̴� " + this.getAge());
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
