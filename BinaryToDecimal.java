package Programs;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int bin=1010;
//		int dec=0;
//		int i=1;
//		while(bin!=0)
//		{
//			int last=bin%10;
//			dec=dec+last*i;
//			i=i*2;
//			bin/=10;
//		}
//		System.out.println(dec);
		
		//Decimal to Binary
		int bin=0;
		int dec=10;
		int i=1;
		while(dec!=0)
		{
			int last=dec%2;
			bin=bin+last*i;
			i=i*10;
			dec/=2;
		}
		System.out.println(bin);
	}

}
