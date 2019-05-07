package withPageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import withoutPageFactory.logOutPage;
import withoutPageFactory.loginPage;
import withoutPageFactory.openGmail;
import withoutPageFactory.sendingEmail;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {
		//Opening Browser (Chrome Browser)
		System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com.mx/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mainPage MainPage = new mainPage(driver);
		MainPage.clickOngoogleSession();
		
		loginPage LoginPage = new loginPage(driver);
		LoginPage.typeEmailAddress("gornelex1986@gmail.com");
		LoginPage.clickOnNextButton();
		LoginPage.typePassword("guadalupe01");
		Thread.sleep(3000);
		LoginPage.clickOnNextButton();
		
		openGmail OpenGmail = new openGmail(driver);
		Thread.sleep(2000);
		OpenGmail.clickOngoogleApps();
		OpenGmail.clickOngmailApp();
		Thread.sleep(3000);
		
		sendingEmail SendingEmail = new sendingEmail(driver);
		SendingEmail.clickOnredactEmail();
		Thread.sleep(2000);
		SendingEmail.sendEmail("gornelex1986@gmail.com", "Test example", "This is an automatic text example");
		Thread.sleep(2000);
		
		logOutPage LogOutPage = new logOutPage(driver);
		LogOutPage.googleLogout();
		
		driver.close();
		
	}

}
