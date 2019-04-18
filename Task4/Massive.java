package core;

public class Massive {

	public void printMassiveAsLine(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "];");
		}
		System.out.println();
	}

	public void PrintReverseMassiveAsLine(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print("[" + array[i] + "];");
		}
		System.out.println();
	}

	public void getSumOfElements(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		//{System.out.println(sum);}
		
		return;
	}

	public void multiptyBy3(int[] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 3;
		}
	
		return;
	}
}