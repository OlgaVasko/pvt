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
			System.out.println("�������� double � long �����");
		} else if (dL < d){
			System.out.println("�������� long ������ double");
		} else {
			System.out.println("�������� long ������ double");
		}
		
		
		
		//if (razn == 0) {
			//System.out.println("�������� double � long �����");
		//} else if (razn < 0) {
			//System.out.println("�������� long ������ double");
		//} else {
			//System.out.println("�������� long ������ double");
		//}
		System.out.print(sum);
		System.out.print(razn);
		System.out.print(prod);
		System.out.println(" result1 " + sum + " result2 " + razn + " result3 "
				+ prod);

	}

}
