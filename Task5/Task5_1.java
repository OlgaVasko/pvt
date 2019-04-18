package core;

public class Task5_1 {

	public static void main(String[] args) {
		Tester inf = new Tester();
		System.out.println(inf.itPrint("Olga"));
		System.out.println(inf.itPrint("Olga", "Vas"));
		System.out.println(inf.itPrint("Olga", "Vas", 39));

		System.out.println("sum = " + Tester.staticMethod(2, 3, 2, 14));

	}

}