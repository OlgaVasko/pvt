package core2;

import core.Tester;

//из другого пакета доступно только то, что private , все что вне зоны видимости закоментированно

public class AnotherTaster3 {
		
			public static void main(String[] args) {
			// Создаем объект
			Tester tester1 = new Tester("Иван", "Иванов", 3, "B2", 1300.00);
			tester1.printAll();

			// Доп. задание: так создать нельзя, тк Private конструктор вне зоны видимости
			// Tester tester2 = new Tester("Константин", "Рыбаков");

			// Доп. задание: создание экземпляра клаcса через вызов статического метода с private конструктором
			Tester tester3 = Tester.newTester("Елена", "Еленова");
			//tester3.setName("Михаил"); - недоступен, тк френдли не виден для другого пакета
			//tester3.setSurname("Сидоров"); - недоступен, тк френдли не виден для другого пакета 
			//tester3.printNameSurname(); - не доступен, протектед из других пакетов доступен только наследникам класса
			//tester3.setEnglishLevel("B1");  - недоступен, тк френдли не виден для другого пакета
			//tester3.setExperienceInYears(1);  - недоступен, тк френдли не виден для другого пакета
			//tester3.setSalary(600.00);  - недоступен, тк френдли не виден для другого пакета
			
			String C = " "; 
			//System.out.println(tester3.getName()+C+tester3.getSurname()+C+tester3.getEnglishLevel()+C+tester3.getExperienceInYears()+C+tester3.getSalary());
//	          Здесь все геттеры френдли и поэтому не доступны из другого пакета
			
			// метод doubleSalary() не может быть вызван , тк он приватный
			// double new_salary = tester3.doubleSalary();
			
			//int exp_in_month = tester3.experienceInMonths(); - френдли метод не виден из другого пакета
			
		}
	}


