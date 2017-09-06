package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.AccountSettingsPage;
import Pages.LaunchPage;
import Pages.LoginPage;

public class POMTest {
	WebDriver driver;
	File file = new File("C:\\Latest_Selenium\\Domain\\ObjectProperties.properties");
	FileInputStream fileInput = null;
	Properties prop = new Properties();

	@BeforeTest()
	public void Init() {

		//Code to execute before test method to open new Chrome browser	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Latest_Selenium\\chromedriver.exe");
		driver = new ChromeDriver(); 
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
        driver.get(prop.getProperty("URL"));
	}

	@Test
	public void TestMethod(){

		

		LaunchPage launchPage = PageFactory.initElements(driver,
				LaunchPage.class);
		HomePage homePage = launchPage.gotoHomePage();		
		LoginPage loginPage = homePage.clickMenu();
		Object page = loginPage.dologin(prop.getProperty("username"),prop.getProperty("password"));

		if (page instanceof LoginPage)
			org.junit.Assert.fail("Test Case fail");
		else if (page instanceof AccountSettingsPage)
			System.out.println("Logged in successfully");
		AccountSettingsPage accountSettingPage = (AccountSettingsPage) page;
		accountSettingPage.setPreferences();
		System.out.println("Test Completed");
	}

	@AfterTest
	public void driverClose() {
		//Code to execute after test method to close all open browsers
		driver.quit();
	}
}
