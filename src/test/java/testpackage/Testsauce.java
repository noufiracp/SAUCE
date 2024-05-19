package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import basepackage.Saucebase;
import excelutils.Excelutilssauce;
import pagepackage.Saucepage;

public class Testsauce extends Saucebase{

	@Test(priority = 1)     //login to site
	public void logintosite()throws Exception
	{

	Saucepage ob = new Saucepage(driver);

        String Excel = "/Users/cpnoufira/Desktop/saucetask.xlsx";

        String Sheet = "Sheet1";

        int rowcount = Excelutilssauce.getrowcount(Excel, Sheet);
        
        for (int i=1;i<=rowcount;i++)

        {
                    String Username=Excelutilssauce.getcellvalue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Username);
                    String Password=Excelutilssauce.getcellvalue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Password);
                    
                    ob.clear();
                    
                    ob.setvalues(Username, Password);
                    
                    ob.sauceloginclick();
                    
        }
	}
@Test(priority=2)     //add products into cart,click cart and click checkout
	public void addpdtstocart()throws Exception
	{

		Saucepage ob1=new Saucepage(driver);
		ob1.addtocart();
		
		Thread.sleep(2000);
		
		ob1.cartclick();
		
		ob1.checkoutclick();
	        
	        Thread.sleep(2000);
	}
@Test(priority=3)         //adding personel details and click continue
public void personel()throws IOException, InterruptedException
{
	Saucepage ob1=new Saucepage(driver);
    Thread.sleep(2000);

	ob1.personeldetails();
	Thread.sleep(2000);
	ob1.continueclick();
}
@Test(priority=4)  //click hamburger,back home(all items) and click on logout
public void hamburger()throws IOException, InterruptedException
{
	Saucepage ob1=new Saucepage(driver);
    Thread.sleep(2000);

	ob1.hamburger();
	ob1.backhome();
    Thread.sleep(2000);
	ob1.hamburger();

	ob1.logoutclick();

}
}



