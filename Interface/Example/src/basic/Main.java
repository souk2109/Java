package basic;


public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(21);
		person.setName("ȫ�浿");
		person.print();
		person.game();
		person.programing();
		person.getName2();
		System.out.println("--------------------");
		
		Pet pet = new Pet();
		pet.setAge(2);
		pet.setName("������");
		pet.print();
		pet.bark();
		pet.getName2();
	}
}
