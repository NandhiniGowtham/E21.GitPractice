package Sample;

import Login.LoginPage;
import Login.Logout;

public class Demo {

	public static void main(String[] args) {
		
		 System.out.println("LoginPage");
		 
		 LoginPage.login("NandhiniGowtham","12345678909");
		 System.out.println(".....");
		 Logout lo=new Logout();
		 lo.logoutpage();

	}

}
