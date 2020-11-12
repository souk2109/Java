package basic;


public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(21);
		person.setName("홍길동");
		person.print();
		person.game();
		person.programing();
		person.getName2();
		System.out.println("--------------------");
		
		Pet pet = new Pet();
		pet.setAge(2);
		pet.setName("강아지");
		pet.print();
		pet.bark();
		pet.getName2();
	}
}
