public class Program1
{
	public static void main(String[] args)
	{
		int year = 2017;
		for (double pop = 321400000; pop < 400000000; pop *= 1.008)
		{
			year++;
		}

		System.out.format("The population in the year %d exceeds 400 million.\n", year);
	}
}
