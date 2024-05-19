package pagepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucepage {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement sauceuser;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement saucepass;
	
	@FindBy(name = "login-button")
	WebElement saucelogin;
	
	/*@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
	WebElement p1;
	
	@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button")
	WebElement p2;
	
	@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/button")
	WebElement p3;
	
	@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
	WebElement p4;
	
	@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
	WebElement p5;
	
	@FindBy (xpath = "/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[2]/button")
	WebElement p6;*/
	
	@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburgermenu;
	
	@FindBy(xpath="//*[@id=\"inventory_sidebar_link\"]")
	WebElement allitems;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public Saucepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String username,String password)
	{
		sauceuser.sendKeys(username);
		saucepass.sendKeys(password);
		
	}
	public void sauceloginclick()
	{
		saucelogin.click();
	}
	public void addtocart()
	{
	//	p1.click();
		//p2.click();
	//	p3.click();
	//	p4.click();
	//	p5.click();
		//p6.click();
		
		List<WebElement> li = driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
		
		for(WebElement cart: li)
		{
			
			String text = cart.getText();
			
			if(text.equalsIgnoreCase("Add to cart"))
			{
				cart.click();
			}
		}
		
		
	}
	public void cartclick()
	{
		cart.click();
	}
	public void clear() {
       sauceuser.clear();		
       saucepass.clear();
	}
	public void checkoutclick()
	{
		checkout.click();
	}
	public void personeldetails()
	{
		firstname.sendKeys("abc");
		lastname.sendKeys("def");
		zipcode.sendKeys("689534");
	}
	public void continueclick()
	{
		continuebutton.click();
	}
	public void hamburger()
	{
		hamburgermenu.click();
	}
	public void backhome()
	{
		allitems.click();
	}
	public void logoutclick()
	{
		logout.click();
	}

}
