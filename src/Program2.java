import java.util.Scanner;

public class Program2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a value:");
		int lines = kb.nextInt();
		kb.nextLine();
		System.out.println();

		for(int i = lines; i >= 1; i--)
		{
			int stars = 2*i - 1;
			int spaces = lines - i;

			for(int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			for(int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
