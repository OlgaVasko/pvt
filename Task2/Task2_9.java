package care;

import java.util.Scanner;

public class Task2_9 {

	public static void main(String[] args) {

		System.out.println("������� ������ �������:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); 
		}	// ��������� �������� ���������� �������
		
		// ����� ��������� ������� � ������
		String str = ""; // ��������� ���������� ��� ������ -������
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " "; // � ��������� ������ ����������� �������� ������� �������� �������
		}
		System.out.println(str); // ����� �������� ������ � �������
		// ���������� ������ ��������� ������� � ������

		int maxz = 10; 
		int minz = 100;
		for (int i = 0; i < MyMassivIn.length; i++) {
			maxz = Math.max(maxz, MyMassivIn[i]);
			minz = Math.min(minz, MyMassivIn[i]);
		}
		for (int i = 0; i < MyMassivIn.length; i++) {
			if (maxz == MyMassivIn[i]) {
				System.out.println("������� � " + (i + 1) + " ����� ������������ �������� ");
			}
			if (minz == MyMassivIn[i]) {
				System.out.println("������� � " + (i + 1) + " ����� ����������� �������� ");
			}
		}
	}
}
