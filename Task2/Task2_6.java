package core;

import java.util.Scanner;

public class Task2_6 {

	public static void main(String[] args) {
		// ������ �������� �������
		System.out.println("������� ������ �������:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); //���������� ��������� ������� ���� ������ (int) ������� � ��������� �� 10 �� 100
		}
		// ��������� �������� ���������� ������� 
		// ����� ��������� ������� � ������
				String str = ""; // ��������� ���������� ��� ������ -������
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " "; //� ��������� ������ ����������� �������� ������� �������� �������
		}
		System.out.println(str); //����� �������� ������ � �������
        //���������� ������ ��������� ������� � ������
				
		//��������� ������� � �����. ������������ ������� ������� � ������� ���������� �������
		int a = 0; //������� ���������� ��� ���������� �������� ������� ��������������� ��������
		int k = 0; //���������� ������������ ���������� ������ �� ������������ ���������
		k = (int)(MyMassivIn.length / 2)*2;
		//System.out.println(k);
		for (int i = 0; i < k; i = i+2) {
			a = MyMassivIn[i];
			MyMassivIn[i] = MyMassivIn[i+1];
			MyMassivIn[i+1] = a;
			a = 0;
		}		//���������� ��������� �������
		
		//����� ��������� ���������������� ������� � ������
		str = "";
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " ";
		}
		System.out.println(str); //���������� ������� ��������� ���������������� ������� � ������
	}
}
