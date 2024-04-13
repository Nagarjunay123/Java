package Programs;

public class SecPrimeLastSecPrime {
	
	public static boolean isprime(int n)
	{
		int count=0;
		for (int i=1; i<=n; i++) 
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int last=10; int count=0;
		int secprime=0;
		int max=0;
		int secmax=0;
		for (int i=start;i<=last;i++)
		{
			if(isprime(i))
			{
				count++;
				if (count==2)
				{
					secprime=i;
				}
				secmax=max;
				max=i;
				System.out.println(i);
			}
		}
		System.out.println("Minimum Second Prime number is : "+secprime);
		System.out.println("Maximum Second Prime number is : "+secmax);

	}

}
