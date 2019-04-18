package core;

public class Task3_4 {

	
	static int namber() {
		int min = 1;
		int max = 10;
		int resalt = min * (int)(Math.random()*max);
		return resalt;
	}
	static int cube(int a) {
		return (a * a * a);
	}
	
	public static void main(String[] args) {
		int a = namber();
		System.out.println( "a = " + a + ", cube = " + cube(a));
		
	}
	
}
	


