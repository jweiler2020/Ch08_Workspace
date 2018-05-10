import java.util.Scanner;

public class Bonus1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number to factorial: ");
		long num = kb.nextLong();
		kb.nextLine();

		System.out.format("%d! = %s = %s", num, factorialString(num), Long.toUnsignedString(factorial(num)));
	}

	private static long factorial(long num)
	{
		if(num <= 1)
			return 1;
		return num*factorial(num-1);
	}

	private static String factorialString(long num)
	{
		if(num <= 1)
			return "1";
		return String.format("%d*%s", num, factorialString(num-1));
	}
}
