package core;

public class Tester {
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public int salary;

    //Task5_1
	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int exp, String english, int salary) {
		this(name, surname);
		this.expirienceInYears = exp;
		this.englishLevel = english;
		this.salary = salary;
	}

    //Task5_2	
	public Tester() {
	}
	public String itPrint(String name) {
		return ("your name: " + name);
	}

	public String itPrint(String name, String surname) {
		return ("your name: " + name + " your surname: " + surname);
	}

	public String itPrint(String name, String surname, int age) {
		return ("your name: " + name + " your surname: " + surname + " your age: " + age);
	}

	// Task5_3
	public static int staticMethod(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
