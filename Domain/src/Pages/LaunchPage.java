package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class LaunchPage extends BasePage {
	
		
	public LaunchPage(WebDriver driver)	{
		this.driver = driver;		
	}
	
    public HomePage gotoHomePage()
    {
    	//code to Maximize the window

        driver.manage().window().maximize();
        return PageFactory.initElements(driver, HomePage.class);
    }
}
