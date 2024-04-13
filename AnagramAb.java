package Programs;

public class AnagramAb {

	public static boolean Anagram(String str1, String str2)
	{
		while(str1!="" && str2!="" || str1.length()!=0)
		{
			char ch=str1.charAt(0);
			str1=str1.replaceFirst(ch+"","");
			str2=str2.replaceFirst(ch+"","");
		}
		if(str1=="" && str2=="")
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String str1="banana";
		String str2="banaan";
		if(Anagram(str1,str2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		

	}

}
