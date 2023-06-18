package MyPkg;

import java.util.Scanner;

public class CheckUserLogin {
String uemail;
String upass;

  void input() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter UserEmail");
	  uemail =sc.next();
	  System.out.println("Enter userpass");
	  upass =sc.next();
	  
  }
   void checkUser() {
	   if(uemail.equalsIgnoreCase("admin@gmail.com") && upass.equals("admin123")) {
		   System.out.println("Valid user");
	   }
	   else {
		   System.out.println("User is not valid");
	   }
   }
	
	
	public static void main(String[] args) {
		CheckUserLogin obj=new CheckUserLogin();
		obj.input();
		obj.checkUser();

	}

}