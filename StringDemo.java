package MyPkg;

public class StringDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//String, StringBuffer,StringBuffer
		int c=0;
		String str="Edubridge"; //no of vowels=4  aeiou
		System.out.println(str.charAt(0));
		for(int i=0;i<str.length();i++) 
		{
			System.out.println(str.charAt(i));
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'||ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
			{
			    c=c+1;
			}
		}
	System.out.println("no of vowels="+c);
	}

}
