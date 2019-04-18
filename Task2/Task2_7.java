package core;

import java.util.Scanner;

public class Task2_7 {

	public static void main(String[] args) {
		// начало создани€ массива
						System.out.println("¬ведите размер массива:");
				Scanner MyScanner = new Scanner(System.in);
				int SizeMassiv = MyScanner.nextInt();
				MyScanner.close();
				int[] MyMassivIn = new int[SizeMassiv];

				for (int i = 0; i < MyMassivIn.length; i++) {
					MyMassivIn[i] = 10 + (int) (Math.random() * (100 + 1 - 10)); //заполнение элементов массива случ целыми (int) числами в диапазоне от 10 до 100
				}	// окончание создани€ начального массива
				
				// вывод элементов массива в строку
				String str = ""; // ќЅЏя¬Ћя≈ћ переменна€ тип строка -пуста€
				for (int i = 0; i < MyMassivIn.length; i++) {
					str = str + MyMassivIn[i] + " "; //к начальной строке добавл€етс€ значение каждого элемента массива
				}
				System.out.println(str); //вывод итоговой строки в консоль
		        //«авершение вывода элементов массива в строку
				
				//обработка массива в цикле. перестановка местами первого и второго эелементов массива
				
				int a = 0; //создаем переменную дл€ временного хранени€ первого обрабатываемого элемента
				//int k = 0; //переменна€ определ€юща€ количество циклов по перестановке элементов
				//k = (int)(MyMassivIn.length / 2)*2;
				//System.out.println(k);
				for (int i = 0; i < MyMassivIn.length / 2; i++)  //т.к. элементы массива мен€ютс€ парами, то перебераем последовательно элементы первой половины массива
					//обща€ длинна массива делим на 2
				{
					a = MyMassivIn[MyMassivIn.length - 1 - i]; //выбираем на  нулевом цикле (i = 0) самый последний элемент массива, затем предпоследний i = 1 и т.д.
					MyMassivIn[MyMassivIn.length - 1 - i] = MyMassivIn[i]; 
					MyMassivIn[i] = a;
					a = 0;
				}	//«авершение обработки массива
				
				//вывод элементов преобразованного массива в строку
				str = "";
				for (int i = 0; i < MyMassivIn.length; i++) {
					str = str + MyMassivIn[i] + " ";
				}
				System.out.println(str);
				//завершение ввывода элементов преобразованного массива в строку
			}
		

		
		
	}


