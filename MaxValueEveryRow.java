package Programs;

public class MaxValueEveryRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{100,122,111,115},{512,521,421,213},{333,388,415,400}};
		int [] res=new int[arr.length];
		for (int i=0;i<arr.length;i++)
		{
			int num=arr[i][0];
			for (int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>num)
				{
					num=arr[i][j];
				}
			}
			res[i]=num;
		}
		for(int x:res)
		{
			System.out.println(x);
		}

	}

}
