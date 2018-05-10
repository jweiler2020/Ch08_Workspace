public class Bonus2
{
	public static void main(String[] args)
	{
		double fraction = (double)9/29;

		int x = 0;
		for(double den = 1; den <= 100; den++)
		{
			for(double num = 0; num <= den; num++)
			{
				x++;
				if(num/den == fraction)
				{
					System.out.format("%d/%d\n", (int)num, (int)den);
				}
			}
		}
		System.out.println(x);
	}
}
