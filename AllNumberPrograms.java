package Programs;

public class AllNumberPrograms {

	
	public static boolean prime(int num)
	{
		int count=0;
		for (int i=1;i<=num;i++) {
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}
	
	public static boolean spy(int num)
	{
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int last=num%10;
			sum=sum+last;
			product=product*last;
			num=num/10;
		}
		if(sum==product)
		{
			return true;
		}
		return false;
	}
	
	public static boolean neon(int num)
	{
		int square=num*num;
		int sum=0;
		while(square!=0)
		{
			int last=square%10;
			sum=sum+last;
			square=square/10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean palindrome(int num)
	{
		int res=0;
		int num2=num;
		while(num!=0)
		{
			int last=num%10;
			res=res*10+last;
			num=num/10;
		}
		if(res==num2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean harshad(int num)
	{
		int num2=num;
		int sum=0;
		while(num!=0)
		{
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		if(num2%sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean strong(int num)
	{
		int sum=0;
		int num2=num;
		while(num!=0)
		{
			int product=1;
			int last=num%10;
			for(int i=1;i<=last;i++)
			{
				product=product*i;
			}
			sum=sum+product;
			num=num/10;
		}
		if(num2==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean armstrong(int num)
	{
		int num2=num;
		int count=0; 
		int num3=num;
		int sum=0;
		while(num2!=0)
		{
			count++;
			num2=num2/10;
		}
		while(num3!=0)
		{
			int product=1;
			int last=num3%10;
			for(int i=1;i<=count;i++)
			{
				product=product*last;
			}
			sum=sum+product;
			num3=num3/10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int lcm(int num1, int num2)
	{
		
		for(int i=1; ;i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				return i;
			}
		}
	}
	
	public static int hcf(int num1,int num2)
	{
		int gcd=1;
		for(int i=1;i<num1 || i<num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static int binToDec(int bin)
	{
		int dec=0; int i=1;
		while(bin!=0)
		{
			int last=bin%10;
			dec=dec+last*i;
			i=i*2;
			bin=bin/10;
		}
		return dec;
	}
	
	public static int decToBin(int dec)
	{
		int bin=0;
		int i=1;
		while(dec!=0)
		{
			int last=dec%2;
			bin=bin+last*i;
			i=i*10;
			dec=dec/2;
		}
		return bin;
	}
	
	public static boolean xylem(int num)
	{
		int extsum=0;
		int minsum=0;
		int n=num;
		while(num!=0)
		{
			if(n==num || num<10)
			{
				int last=num%10;
				extsum=extsum+last;
			}
			else
			{
				int last=num%10;
				minsum=minsum+last;
			}
			num=num/10;
		}
		if(extsum==minsum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void secPrime(int first, int last)
	{
		int secMin=0;
		int max=0;
		int secMax=0;
		int count=0;
		for(int i=first; i<=last;i++)
		{
			if(prime(i))
			{
				count++;
				if(count==2)
				{
					secMin=i;
				}
				secMax=max;
				max=i;
			}
		}
		System.out.println("min Second prime number is : "+secMin);
		System.out.println("Max Second prime number is : "+secMax);
	}
	
	public static boolean happy(int num)
	{
		while(num!=1 && num!=4)
		{
			int sum=0;
			while(num!=0)
			{
				int last=num%10;
				sum=sum+last*last;
				num=num/10;
			}
			num=sum;
		}
		if(num==1) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		if(prime(7))
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		if(spy(123))
		{
			System.out.println("Number is spy");
		}
		else
		{
			System.out.println("Number is not spy");
		}
		if(neon(9))
		{
			System.out.println("Number is neon");
		}
		else
		{
			System.out.println("Number is not neon");
		}
		if(palindrome(121))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		if(perfect(6))
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
		if(harshad(12))
		{
			System.out.println("Number is harsad");
		}
		else
		{
			System.out.println("Number is not harshad");
		}
		if(strong(145))
		{
			System.out.println("Number is strong");
		}
		else
		{
			System.out.println("Number is not strong");
		}
		if(armstrong(153))
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not not armstrong");
		}
		System.out.println("Number is lcm "+lcm(6,8));
		System.out.println("Number is hcf "+hcf(2,4));
		System.out.println("Binary number "+1010+" is convert into dec : "+binToDec(1010));
		System.out.println("Dec number "+10+" is convert into bin : "+decToBin(10));
		
		if(xylem(1234))
		{
			System.out.println("Number is xylem");
		}
		else
		{
			System.out.println("Number is phloem");
		}
		secPrime(1,20);
		
		if(happy(13))
		{
			System.out.println("Number is happy number");
		}
		else
		{
			System.out.println("Number is not happy number");
		}
	}

}
