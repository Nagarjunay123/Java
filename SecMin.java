package Programs;

public class SecMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {6,5,3,1};
		int secMin=a[0];
		int min=a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]<min) {
//				secMin=min;
//				min=a[i];
//			}
//			else if((a[i]<secMin || secMin==min)&& min!=a[i])
//			{
//					secMin=a[i];							
//			}
//		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				secMin=min;
				min=a[i];
			} 
			else if((a[i]!=min && a[i]<secMin) || secMin==min)
			{
				secMin=a[i];
			}
		}
		System.out.println("minimum number in a given array is :  "+min);
		System.out.println("Second manimum number in a given array is :  "+secMin);
	}

}
