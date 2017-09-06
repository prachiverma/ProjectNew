package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import junit.framework.Assert;

public class BasePage {
	
	protected static WebDriver driver;
	public static void verifyResponse(String pgTitleExpected, String pgTitleActual)
	{
		AssertJUnit.assertEquals(pgTitleExpected, pgTitleActual);
	}
	protected static boolean isTextPresent(String text){
	    try{
	        boolean b = driver.getPageSource().contains(text);
	        return b;
	    }
	    catch(Exception e){
	        return false;
	    }
	  }

	

}
