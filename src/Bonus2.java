public class Bonus2
{
	public static void main(String[] args)
	{
		double frac = (double)9/29;

		int[] bot = fromBottom(frac);
		int[] top = fromTop(frac);

		System.out.format("Goal: %d/%d - %f\n", 9, 29, frac);
		System.out.println();
		System.out.format("From the Top: %d/%d - %f\n", top[0], top[1], (double)top[0]/top[1]);
		System.out.format("From the Bottom: %d/%d - %f\n", bot[0], bot[1], (double)bot[0]/bot[1]);
	}

	private static int[] fromBottom(double frac)
	{
		double bestDiff = 1;

		int numer = 0;
		int denom = 1;

		for(double den = 1; den <= 100; den++)
		{
			for(double num = 0; num <= den; num++)
			{
				double guess = num/den;
				double diff = frac - guess;
				if(diff <= 0)
					break;
				else if(diff < bestDiff)
				{
					bestDiff = diff;
					numer = (int)num;
					denom = (int)den;
				}
			}
		}

		return new int[] {numer, denom};
	}

	private static int[] fromTop(double frac)
	{
		double bestDiff = 1;

		int numer = 0;
		int denom = 1;

		for(double den = 100; den >= 1; den--)
		{
			for(double num = den; num >= 0; num--)
			{
				double guess = num/den;
				double diff = guess - frac;
				if(diff <= 0)
					break;
				else if(diff < bestDiff)
				{
					bestDiff = diff;
					numer = (int)num;
					denom = (int)den;
				}
			}
		}

		return new int[] {numer, denom};
	}
}
