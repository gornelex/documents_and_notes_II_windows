package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class CaseStudy_module4 {

	static JavascriptExecutor jse;
	
	public static void main(String[] args) throws InterruptedException {
		
		//Open ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='radio' and @id='oneWayTrip']")).click();
	
		driver.findElement(By.name("or-src")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("or-src")).sendKeys("Bengaluru", Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.name("or-dest")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("or-dest")).sendKeys("Lucknow", Keys.ENTER);
		Thread.sleep(3000);
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 100)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary dateClose']")).click();;
		Thread.sleep(3000);
		
		driver.findElement(By.name("passenger")).click();
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[2]/div/button[2]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary block bold ig-search-btn ig-common-cta addLoader']")).click();
		Thread.sleep(3000);
		
	

		}

}
