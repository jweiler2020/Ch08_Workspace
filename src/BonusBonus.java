import java.util.Scanner;

public class BonusBonus
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number to sum the digits of: ");
		int n = kb.nextInt();
		kb.nextLine();

		System.out.format("The sum of the digits of %d is %d\n", n, sumDigits(n));
	}

	private static int sumDigits(int n)
	{
		int sum = 0;
		int i = 10;

		while(true)
		{
			int add = modulo(n, i);
			if(add == n)
				break;
			sum += modulo(n, i);
			i = multiply(i, 10);
		}

		return sum;
	}

	private static int multiply(int a, int b)
	{
		int prod = 0;

		for(int i = 0; i < a; i++)
		{
			prod += b;
		}

		return prod;
	}

	private static int modulo(int a, int b)
	{
		while(a > 0)
		{
			a -= b;
		}
		return a + b;
	}
}
