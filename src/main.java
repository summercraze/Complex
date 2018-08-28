
public class main 
{
	public static void main(String[] args)
	{
		Complex number1 = new Complex(3.5,5.5);
		Complex number2 = new Complex(-3.5,1);
		System.out.println(number1.add(number2).toString());
		System.out.println(number1.subtract(number2).toString());
		System.out.println(number1.multiplication(number2).toString());
		System.out.println(number1.division(number2).toString());
		System.out.println(number1.abs());
	}

}
