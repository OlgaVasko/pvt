package core;

import java.util.Scanner;

public class Task2_6 {

	public static void main(String[] args) {
		// начало создания массива
		System.out.println("Введите размер массива:");
		Scanner MyScanner = new Scanner(System.in);
		int SizeMassiv = MyScanner.nextInt();
		MyScanner.close();
		int[] MyMassivIn = new int[SizeMassiv];

		for (int i = 0; i < MyMassivIn.length; i++) {
			MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); //заполнение элементов массива случ целыми (int) числами в диапазоне от 10 до 100
		}
		// окончание создания начального массива 
		// вывод элементов массива в строку
				String str = ""; // ОБЪЯВЛЯЕМ переменная тип строка -пустая
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " "; //к начальной строке добавляется значение каждого элемента массива
		}
		System.out.println(str); //вывод итоговой строки в консоль
        //Завершение вывода элементов массива в строку
				
		//обработка массива в цикле. перестановка местами первого и второго эелементов массива
		int a = 0; //создаем переменную для временного хранения первого обрабатываемого элемента
		int k = 0; //переменная определяющая количество циклов по перестановке элементов
		k = (int)(MyMassivIn.length / 2)*2;
		//System.out.println(k);
		for (int i = 0; i < k; i = i+2) {
			a = MyMassivIn[i];
			MyMassivIn[i] = MyMassivIn[i+1];
			MyMassivIn[i+1] = a;
			a = 0;
		}		//Завершение обработки массива
		
		//вывод элементов преобразованного массива в строку
		str = "";
		for (int i = 0; i < MyMassivIn.length; i++) {
			str = str + MyMassivIn[i] + " ";
		}
		System.out.println(str); //завершение ввывода элементов преобразованного массива в строку
	}
}
