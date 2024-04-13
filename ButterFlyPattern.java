package Programs;

public class ButterFlyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for (int i=1; i<n*2; i++) 
		{
			for (int j=1;j<n*2;j++)
			{
				if((i>=j && i+j<=n*2) || (i+j>=n*2 && j-i>=0)) // n=5; ((i>=j && i+j<=n+1) || (i+j>=n+1 && j-i>=0))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}

	}

}
