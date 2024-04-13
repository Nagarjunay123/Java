package Programs;

public class Minfreuency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,2,1};
		int min=0; int c1=a.length; 
		for (int i = 0; i < a.length; i++) {
			int c2=0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j])
				{
					c2++;
				}
			}
			if (c2<c1)
			{
				min=a[i];
				c1=c2;
			}
		}
		System.out.println(min);
		

	}

}
