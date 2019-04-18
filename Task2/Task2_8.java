package core;

import java.util.Scanner;

public class Task2_8 {

	public static void main(String[] args) {
			// ������ �������� �������
		System.out.println("������� ������ �������:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); //���������� ��������� ������� ���� ������ (int) ������� � ��������� �� 10 �� 100
		}	// ��������� �������� ���������� �������
		// ����� ��������� ������� � ������
		String str = ""; // ��������� ���������� ��� ������ -������
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " "; //� ��������� ������ ����������� �������� ������� �������� �������
		}
		System.out.println(str); //����� �������� ������ � �������
        //���������� ������ ��������� ������� � ������
		
		//��������� ������� � �����. ������������ ������� ������� � ������� ���������� �������
		int maxz = 10; //������� ���������� ��� ���������� �������� ������� ��������������� ��������
		int minz = 100;
		for (int i = 0; i < MyMassivIn.length; i++)			
		{
			maxz = Math.max(maxz,MyMassivIn[i]);
			minz = Math.min(minz,MyMassivIn[i]);
		}	//���������� ��������� �������
		
		//����� ��������� ���������������� ������� � ������
		str = "";
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " ";
		}
		System.out.println(str);
		//���������� ������� ��������� ���������������� ������� � ������
		System.out.println("������������ �������� �������� " + maxz);
		System.out.println("����������� �������� �������� " + minz);
		System.out.println("����������� �������� �������� " + minz + " � ������������ �������� ��������" + maxz);
	}

	}
