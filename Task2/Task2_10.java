package core;

import java.util.Scanner;

public class Task2_10 {
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

		String str = "";
		for (int i = 0; i < MyMassivIn.length; i++) {
		}
		System.out.println(str);

		boolean flagvozr = true;
		boolean flagubyv = true;

		for (int i = 0; i < MyMassivIn.length - 1; i++) {
			if (MyMassivIn[i] < MyMassivIn[i + 1]) {
				flagvozr = true;
			} else {
				flagvozr = false;
				break;
			}
		}
		for (int i = 0; i < MyMassivIn.length - 1; i++) {
			if (MyMassivIn[i] > MyMassivIn[i + 1]) {
				flagubyv = true;
			} else {
				flagubyv = false;
				break;
			}
		}
		System.out.println("flagvozr = " + flagvozr);
		System.out.println("flagubyv = " + flagubyv);
		if ((flagvozr == true) & (flagubyv == false)) {
			System.out.println("������������������ �������� ������������ ");
		}
		if ((flagubyv == true) & (flagvozr == false)) {
			System.out.println("������������������ �������� ��������� ");
		}
		if ((flagvozr == false) & (flagubyv == false)) {
			System.out.println("������������������ �� ��������� ��������� � ������������ ");
		}
	}
}
