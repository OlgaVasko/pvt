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
				
				System.out.println("����� = " + sum);
				System.out.println("������������ = " + product);
				System.out.println("�������� = " + razn);
				System.out.println("������� = " + chastn);
			}
}
