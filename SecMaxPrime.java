package Programs;

public class SecMaxPrime {
	
	public static void main(String[] args) {
		int [] a= {11,11,5,8,3,2,4,6,9};
		int secMax=0;
		int last=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>last) {
				secMax=last;
				last=a[i];
			}
			else if(a[i]>secMax && a[i]!=last)
			{
				secMax=a[i];
			}
		}
		System.out.println("maximum number in a given array is :  "+last);
		System.out.println("Second maximum number in a given array is :  "+secMax);
	}

}
