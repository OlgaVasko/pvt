package core;

public class Task4_1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Igor");
		person.setSurname("Ivanov");
		person.setAge(25);
		person.setPhone(7654321);
		person.printAllInformation();
		person.printName();
		System.out.println(person.isAdult());
	}

}
