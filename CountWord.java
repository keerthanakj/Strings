package MyPkg;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Full java Development";
		
		String s1[]= s.split(" ");
		String target="java";
		
		int count=0;
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equalsIgnoreCase(target))
				count++;	
			
		}
		System.out.println(count);
	}

}
