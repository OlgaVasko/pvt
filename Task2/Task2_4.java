package core;

import java.util.Scanner;

public class Task2_4 {

	public static void main(String[] args) {

		System.out.println("������� ������ �������:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();

		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			System.out.println("������� " + (i + 1) + "-� ������� �������: ");

			MyMassivIn[i] = MyScanner.nextInt();
		}
		MyScanner.close();

		int schet = 0;
		for (int i = 0; i < MyMassivIn.length; i++) {
			if (MyMassivIn[i] == 0) {
				schet = schet + 1;
			}
		}
		if (schet == 0) {
			System.out.println(" �� ������� ������� ���������");
		} else {

			System.out.println(" ������� " + schet + " ���������");
		}
	}
}
