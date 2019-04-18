package core;

import java.util.Scanner;

public class Task2_3_2 {

	public static void main(String[] args) {
		// начало создани€ массива
		int left = 10;
		int right = 100;

		System.out.println("¬ведите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = left + (int) (Math.random() * (right + 1 - left));
		}
		// конец создани€ массива
		// обработка массива согласно задани€

		String str = ""; // ќЅЏя¬Ћя≈ћ переменна€ тип строка -пуста€
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " ";
		}
		System.out.println(str);

		for (int i = 2; i < MyMassivIn.length; i = i + 3) {
			MyMassivIn[i] = MyMassivIn[i] * 2;
		}

		str = "";
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " ";
		}
		System.out.println(str);
	}
}
