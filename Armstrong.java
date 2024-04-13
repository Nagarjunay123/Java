package Programs;

public class Armstrong {
	
	public static int count(int a)
	{
		int count=0;
		while(a!=0)
		{
			count++;
			a/=10;
		}
		return count;
	}
	public static int power(int n,int count)
	{
		int power=1;
		for (int i = 1; i<=count; i++) 
		{
			power=power*n;
		}
		return power;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int n=num;
		int count=count(num);
		int sum=0;
		while (num!=0)
		{
			int last=num%10;
			sum=sum+power(last,count);
			num/=10;
		}
		
		if (sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		

	}

}
