package core;

public class Task3_1 {

	static int namber() {
		int min = 10;
		int max = 100;
		int resalt = min + (int) (Math.random() * max);
		return resalt;

	}

	static int min(int a, int b) {
		if (a < b) {
			return a;

		} else {
			return b;

		}

	}
	
	public static void main(String[] args) {

		int a = namber();
		int b = namber();
		System.out.println("a = " + a + ", b = " + b + " min namber = " + min(a, b));
	}
}