package Programs;

public class Anagram {

	public static boolean anagram(String str1,String str2)
	{
		int count=0;
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				char ch1=str1.charAt(i);
				for(int j=0;j<str2.length();j++)
				{
					char ch2=str2.charAt(j);
					if(ch1==ch2)
					{
						str2=str2.replaceFirst(ch2+"","*");
						count++;
						//System.out.println(str2);
						break;
					}
				}
			}
			
			if(count==str1.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str1="banana";
		String str2="banana";
		if(anagram(str1,str2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("NOt anagram");
		}
		
	}

}
