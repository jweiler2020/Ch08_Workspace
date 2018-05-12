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
		int i = 1;
		int j = 10;
		while(n > 0)
		{
			if(modulo(n, j) == 0)
			{
				i = mult(i, 10);
				j = mult(j, 10);
			}
			else
			{
				sum++;
				n -= i;
			}
		}
		return sum;
	}

	private static int modulo(int a, int b)
	{
		while(a >= 0)
		{
			a -= b;
		}
		return a + b;
	}

	private static int mult(int a, int b)
	{
		int sum = 0;
		for(int i = 0; i < b; i++)
		{
			sum += a;
		}
		return sum;
	}
}
