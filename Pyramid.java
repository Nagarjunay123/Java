package Programs;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for (int i=1; i<n*2; i++) 
		{
			for (int j=1;j<n*2;j++)
			{
				if(i+j>n && i-j<n && j-i<n && j+i<n*3) //((i+j>n && j-i<n && i<=n) || (i>n && i-j<n && j+i<n*3))
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

