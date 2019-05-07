package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy_module2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Opening Browser (Chrome Browser)
		System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/geckodriver_v0.24.0_linux64");
		//WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://www.edureka.co/");
		
		
		//Using different attributes. Basic commands practice
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-inp")).sendKeys("Phyton");
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_v1[query]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.className("search_inp")).sendKeys("Selenium Course");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='search_inp collapse giTrackElementHeader']")).clear();
		Thread.sleep(2000);
		
		WebElement loginselector = driver.findElement(By.cssSelector(".top-signin"));
		loginselector.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[1]/button")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[1]/button")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-inp")).sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Selenium")).click();
		Thread.sleep(2000);
		
		driver.close();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
		}

}
