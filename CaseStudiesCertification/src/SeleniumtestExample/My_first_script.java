package SeleniumtestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_first_script {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\chromedriver74.0.3729.6_win32.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\geckodriver_v0.24.0_win64.exe");*/
		
		
		
		
		driver.get("https://google.com.mx");
	}

}
