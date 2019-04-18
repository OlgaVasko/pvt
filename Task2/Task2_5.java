package core;

import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {

		System.out.println("¬ведите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();

		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			System.out.println("¬ведите " + (i + 1) + "-й элемент массива: ");

			MyMassivIn[i] = MyScanner.nextInt();
		}
		MyScanner.close();

		int schet = 0;
		for (int i = 0; i < MyMassivIn.length; i++) {
		
			if (MyMassivIn[i] == 0) {
				schet = schet + 1;
				System.out.println("Ёлемент є " + (i+1) + " равен нулю");}
		}
		if (schet == 0) {
			System.out.println(" не найдено нулевых элементов");
		} else {
			System.out.println(" найдено " + schet + " элементов");
			
			//System.out.println("Ёлемент " + schet + " равен нулю ");
			}

	}
}
