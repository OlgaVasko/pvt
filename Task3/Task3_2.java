package core;

public class Task3_2 {

	
	static int namber() {
		
	int min = 10;
	int max = 100;
	int resalt = min + (int)(Math.random()*max);
	return resalt;
	}
	static boolean again(int a) {
		return(a % 2 == 0);
		
	}
	
	public static void main(String[] args) {
		
		int a = namber();
		System.out.println( "a = " + a + ", again = " + again(a));
	}
	
}
