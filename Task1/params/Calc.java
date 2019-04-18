package params;

public class Calc {
public static void main(String[] args)
			{
				float a = Float.parseFloat(args[0]);
				float b = Float.parseFloat(args[1]);
				
				float sum = a + b;
				float product = a * b;
				float razn = a - b;
				float chastn = a / b;
				
				System.out.println("сумма = " + sum);
				System.out.println("произведение = " + product);
				System.out.println("разность = " + razn);
				System.out.println("частное = " + chastn);
			}
}
