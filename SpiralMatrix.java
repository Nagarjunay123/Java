package Programs;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class SpiralMatrix {
	
	public static int [][] spiralmatrix(int size)
	{
		int [][] arr=new int[size][size];
		int col=-1;
		int row=0;
		char mov='r';
		for (int i=1;i<=size*size;i++)
		{
			switch (mov)
			{
				case 'r':
				{
					col++;
					arr[row][col]=i;
					if(col==size-1 || arr[row][col+1]!=0)
					{
						mov='d';
					}
					break;
				}
				case 'd':
				{
					row++;
					arr[row][col]=i;
					if(row==size-1 || arr[row+1][col]!=0)
					{
						mov='l';
					}
					break;
				}
				case 'l':
				{
					col--;
					arr[row][col]=i;
					if(col==0 || arr[row][col-1]!=0)
					{
						mov='u';
					}
					break;
				}
				case 'u':
				{
					row--;
					arr[row][col]=i;
					if(row==0 || arr[row-1][col]!=0)
					{
						mov='r';
					}
					break;
				}
			}
			
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=spiralmatrix(5);
		for(int [] a : arr)
		{
			for(int b : a)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
