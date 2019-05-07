package seleniumbasics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy_module3 {

	



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Opening Browser (Chrome Browser)
		System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("search-inp")).sendKeys("Selenium",Keys.ENTER);
		
		//Looking for Selenium course and enter to the page
	Thread.sleep(3000);
		WebElement selenium_course_link = driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[1]"));
		ClickOn(driver, selenium_course_link, 5);
		
		//checking the page title
		Thread.sleep(3000);
		String current_title = driver.getTitle();
	
		
		//Check the title expected "Selenium 3.0 WebDriver Online Training" with a boolean TRUE or FALSE
		boolean result = current_title.equals("Selenium 3.0 WebDriver Online Training");
		
		System.out.println("Current title:" + current_title);
		if (result == true) {
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("Title is not the same:");
			System.out.println("Should be: Selenium 3.0 WebDriver Online Training");
		}

				
		driver.navigate().back();
		
		
		driver.findElement(By.linkText("Courses")).click();
		Thread.sleep(3000);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		
		WebElement element = wait.until (new Function<WebDriver, WebElement>(){

			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[1]/div[1]/div[2]/div[1]/h3"));
			}
				
				
		});
		
	System.out.println("element is displayed?" + element.isDisplayed());
		
		
		driver.close();

	}

	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
	new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	}

	
	

}
