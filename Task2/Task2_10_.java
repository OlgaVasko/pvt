package core;

public class Task2_10_ {

	public static void main(String[] args) {
		int a = 100;
		int size = 20;
		int mas[] = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * a);
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		boolean result = true;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= mas[i + 1]) {
				result = false;
				break;

			}
		}
		if (result == true) {
			System.out.println("Массив возрастающий");
		} else {
			System.out.println("Массив не является возрастающим");
		}
	}

}
