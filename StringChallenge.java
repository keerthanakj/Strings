package MyPkg;

import java.util.Scanner;

class InAmsterdam {
	
	 int countAm(String str) 
	 {
		 int count = 0;
			String s[]=str.split(" ");
			
			String target="am";
			
			for(int i =0;i<s.length;i++) {
				if(s[i].equalsIgnoreCase(target)) {
					count++;
				}
			}
			System.out.println(count);
		return count;
		 
	 }	
}

public class StringChallenge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		
		InAmsterdam obj = new InAmsterdam();
		obj.countAm(str);

	}

}


