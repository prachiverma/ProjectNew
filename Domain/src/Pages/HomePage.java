package Pages;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}	

    @FindBy(linkText = "Buy")
    private WebElement lnk_Buy; 
    
    @FindBy(linkText = "Rent")
    private WebElement lnk_Rent;
    
    @FindBy(linkText = "New homes")    
    private WebElement lnk_Newhomes; 
    
    @FindBy(linkText = "Sold")    
    private WebElement lnk_Sold;
    
    @FindBy(linkText = "Commercial")
    private WebElement lnk_Commercial;
    
    @FindBy(linkText = "News")
    private WebElement lnk_News;
    
    @FindBy(linkText = "Advice")
    private WebElement lnk_Advice;
    
    @FindBy(linkText = "Agents")
    private WebElement lnk_Agents;
    
    @FindBy(linkText = "More")
    private WebElement lnk_More;
    
    @FindBy(linkText = "Home")
    private WebElement lnk_Home;
    
    @FindBy(xpath = "//li[contains(@class, 'active')]/ul/li[1]/a")
    private WebElement selectedSubMenu;   
    
    public LoginPage clickMenu()
    {
    	//Code to click on menu items and to verify that pages are successfully loaded
    	lnk_Buy.click();
    	BasePage.isTextPresent("Buy");
    	lnk_Rent.click();
    	BasePage.isTextPresent("Rent");
    	lnk_Newhomes.click();
    	BasePage.isTextPresent("Find New Homes");
    	lnk_Sold.click();
    	BasePage.isTextPresent("Sold");
    	lnk_Commercial.click();
    	BasePage.isTextPresent("For Sale");
    	driver.navigate().back();
		/*Actions builder = new Actions(driver);
		builder.moveToElement(lnk_News).build().perform();	*/	    	
		lnk_News.click();
    	selectedSubMenu.click();
    	BasePage.isTextPresent("News");
    	driver.navigate().back();
    	lnk_Advice.click();
    	selectedSubMenu.click();
    	BasePage.isTextPresent("Advice");    	
    	lnk_Agents.click();
    	BasePage.isTextPresent("Agent");
    	lnk_More.click(); 
    	selectedSubMenu.click();
    	BasePage.isTextPresent("Share");
    	driver.navigate().back();
    	return PageFactory.initElements(driver, LoginPage.class);
    }

}
