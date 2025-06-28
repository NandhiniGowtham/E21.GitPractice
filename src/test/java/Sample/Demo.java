package Sample;

import Login.LoginPage;
import Login.Logout;
import Login.Tc_1AddToproduct;

public class Demo {

	public static void main(String[] args) {
		
		 System.out.println("LoginPage");
		 
		 LoginPage.login("NandhiniGowtham","12345678909");
		 System.out.println(".....");
		 Tc_1AddToproduct.addToProduct();
		 Logout lo=new Logout();
		 lo.logoutpage();

	}

}
