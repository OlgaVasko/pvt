package core2;

import core.Tester;

//�� ������� ������ �������� ������ ��, ��� private , ��� ��� ��� ���� ��������� ����������������

public class AnotherTaster3 {
		
			public static void main(String[] args) {
			// ������� ������
			Tester tester1 = new Tester("����", "������", 3, "B2", 1300.00);
			tester1.printAll();

			// ���. �������: ��� ������� ������, �� Private ����������� ��� ���� ���������
			// Tester tester2 = new Tester("����������", "�������");

			// ���. �������: �������� ���������� ���c�� ����� ����� ������������ ������ � private �������������
			Tester tester3 = Tester.newTester("�����", "�������");
			//tester3.setName("������"); - ����������, �� ������� �� ����� ��� ������� ������
			//tester3.setSurname("�������"); - ����������, �� ������� �� ����� ��� ������� ������ 
			//tester3.printNameSurname(); - �� ��������, ��������� �� ������ ������� �������� ������ ����������� ������
			//tester3.setEnglishLevel("B1");  - ����������, �� ������� �� ����� ��� ������� ������
			//tester3.setExperienceInYears(1);  - ����������, �� ������� �� ����� ��� ������� ������
			//tester3.setSalary(600.00);  - ����������, �� ������� �� ����� ��� ������� ������
			
			String C = " "; 
			//System.out.println(tester3.getName()+C+tester3.getSurname()+C+tester3.getEnglishLevel()+C+tester3.getExperienceInYears()+C+tester3.getSalary());
//	          ����� ��� ������� ������� � ������� �� �������� �� ������� ������
			
			// ����� doubleSalary() �� ����� ���� ������ , �� �� ���������
			// double new_salary = tester3.doubleSalary();
			
			//int exp_in_month = tester3.experienceInMonths(); - ������� ����� �� ����� �� ������� ������
			
		}
	}


