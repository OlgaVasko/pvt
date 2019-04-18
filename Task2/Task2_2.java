package core;

import java.util.Scanner;

public class Task2_2 {
	public static void main(String[] args) {

		System.out.println("¬ведите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();

		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			System.out.println("¬ведите " + (i + 1) + "-_ array elements: ");

			MyMassivIn[i] = MyScanner.nextInt();
		}
		MyScanner.close();

		int pr = 1; 
		int i = 0;
		while (i < MyMassivIn.length)
			{		
			pr = pr * MyMassivIn[i];
			i++;
		}
		System.out.println("Product of array elements = " + pr);
	}

}
