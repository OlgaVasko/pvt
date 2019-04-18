package core;

public class Task3_3 {

	

	static int namber() {
		int min = 10;
		int max = 100;
		int resalt = min * (int) (Math.random() * max);
		return resalt;
	}

	static int square(int a) {
		return (a * a);
	}
	
	public static void main(String[] args) {

		int a = namber();
		System.out.println("a = " + a + ", square = " + square(a));

	}
}
