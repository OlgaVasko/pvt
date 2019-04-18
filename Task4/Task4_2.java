package core;

public class Task4_2 {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5 };
		Massive massive = new Massive();
		massive.printMassiveAsLine(array);
		massive.PrintReverseMassiveAsLine(array);
		massive.getSumOfElements(array);
		massive.multiptyBy3(array);
		massive.printMassiveAsLine(array);
		massive.PrintReverseMassiveAsLine(array);
	}

}