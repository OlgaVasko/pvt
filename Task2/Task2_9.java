package care;

import java.util.Scanner;

public class Task2_9 {

	public static void main(String[] args) {

		System.out.println("¬ведите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); 
		}	// окончание создани€ начального массива
		
		// вывод элементов массива в строку
		String str = ""; // ќЅЏя¬Ћя≈ћ переменна€ тип строка -пуста€
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " "; // к начальной строке добавл€етс€ значение каждого элемента массива
		}
		System.out.println(str); // вывод итоговой строки в консоль
		// «авершение вывода элементов массива в строку

		int maxz = 10; 
		int minz = 100;
		for (int i = 0; i < MyMassivIn.length; i++) {
			maxz = Math.max(maxz, MyMassivIn[i]);
			minz = Math.min(minz, MyMassivIn[i]);
		}
		for (int i = 0; i < MyMassivIn.length; i++) {
			if (maxz == MyMassivIn[i]) {
				System.out.println("Ёлемент є " + (i + 1) + " имеет максимальное значение ");
			}
			if (minz == MyMassivIn[i]) {
				System.out.println("Ёлемент є " + (i + 1) + " имеет минимальное значение ");
			}
		}
	}
}
