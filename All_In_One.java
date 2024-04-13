package Programs;


public class All_In_One {

	public String duplicate(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (!(res.contains(ch+"")))
			{
				res=res+ch;
			}
		}
		return res;
	}
	public char minChar(String str,String result)
	{
		char minchar=' ';
		int count1=str.length();
		for (int i=0;i<result.length();i++)
		{
			int count=0;
			char ch1=result.charAt(i);
			for (int j=0;j<str.length();j++)
			{
				char ch2=str.charAt(j);
				if (ch1==ch2)
				{
					count++;
				}
			}
			if (count<count1)
			{
				minchar=ch1;
				count1=count;
			}
		}
		return minchar;
	}
	public char maxchar(String str,String result)
	{
		int count=0;
		char maxchar=' ';
		for(int i=0;i<result.length();i++)
		{
			int count2=0;
			char ch1=result.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				char ch2=str.charAt(j);
				if (ch1==ch2)
				{
					count2++;
				}		
			}
			if (count2>count)
			{
				maxchar=ch1;
				count=count2;
				
			}
		}
		return maxchar;
	}
	public String FinalString(String str,String minchar,String minreplace,String maxchar,String maxreplace)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			String ch=String.valueOf(str.charAt(i));
			if (ch.equals(minchar))
			{
				ch=minreplace;
			}
			else if(ch.equals(maxchar))
			{
				ch=maxreplace;
			}
			result=result+ch;
		}
		return result;
	}
	
	
	
}
