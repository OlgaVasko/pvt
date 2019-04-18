package paramsvariable;

public class Varb {
	public static void main(String[] args) {
		int a = 1;
		short ds = 10;
		long dL = 1444;
		double d = 9999.25;
		float df = 9.25f;
		char e = 'x';
		boolean f = true;

		int sum = a + ds;
		double razn = dL - d;
		double prod = df * d;

		if(dL == d ){
			System.out.println("значения double и long равны");
		} else if (dL < d){
			System.out.println("значение long меньше double");
		} else {
			System.out.println("значение long больше double");
		}
		
		
		
		//if (razn == 0) {
			//System.out.println("значения double и long равны");
		//} else if (razn < 0) {
			//System.out.println("значение long меньше double");
		//} else {
			//System.out.println("значение long больше double");
		//}
		System.out.print(sum);
		System.out.print(razn);
		System.out.print(prod);
		System.out.println(" result1 " + sum + " result2 " + razn + " result3 "
				+ prod);

	}

}
