package core;

import java.util.Scanner;

public class Task2_1 {
	public static void main(String[] args) {

		//int left = 10;
		//int right = 100;

		System.out.println("¬ведите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10));
		}

		int i = 0;
		while (i < MyMassivIn.length) {
			System.out.println((i + 1) + "-_ element= " + MyMassivIn[i]);
			i++;
		}
		int j = MyMassivIn.length - 1;
		while (j >= 0) {
			System.out.println("" + (j + 1) + "-_ element = " + MyMassivIn[j]);
			j--;
		} 
	}
 
}
