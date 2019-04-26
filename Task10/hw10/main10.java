package hw10;

import java.util.Scanner;

public class main10 {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Vvedite:");
		int n = scanner1.nextInt();
		scanner1.nextLine();

		System.out.print("Vvedite: ");
		int number = scanner1.nextInt();
		scanner1.nextLine();

		String str = new String();
		for (int i = 0; i < n; i++) {
			str = str + scanner1.nextLine();
		}
		String[] array = str.split("\\t");

		Paragraph[] paragraphs = new Paragraph[array.length];
		for (int i = 0; i < array.length; i++) {
			paragraphs[i] = new Paragraph(array[i]);
		}

		for (Paragraph p : paragraphs) {
			p.print(number);
		}

	}
}