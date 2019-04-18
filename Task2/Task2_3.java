package core;

import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {
		// начало создания массива
		int left = 10;
		int right = 100;

		System.out.println("Введите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = left + (int) (Math.random() * (right + 1 - left));
		}
		// конец создания массива
		// обработка массива отобрать значения

		// Вывод в консоль всех элементов массива в порядке возрастания индекса

		for (int i = 0; i < MyMassivIn.length; i++) {
			System.out.println(MyMassivIn[i]);
		}// ВЫВОД ЗАВЕРШЕН в консоль всех элементов массива в порядке возрастания
		// индекса

		// каждый 3-й элемент массива * на 2

		for (int i = 2; i < MyMassivIn.length; i = i + 3) {
			MyMassivIn[i] = MyMassivIn[i] * 2;
		}
		// завершено умножение (* ) каждого элемента на 2

		// ВЫВОД В КОНСОЛЬ МАССИВА с новыми значениями
		for (int i = 0; i < MyMassivIn.length; i++) {
			System.out.println(MyMassivIn[i]);
		}

	}
}
