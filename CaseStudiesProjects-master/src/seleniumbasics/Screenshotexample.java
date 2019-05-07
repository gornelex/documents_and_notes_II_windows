package seleniumbasics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotexample {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
		WebDriver driver = new ChromeDriver();


        try{
            driver.get("http://google.co.in");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            driver.findElement(By.xpath("//*[@name='qaaa']")).sendKeys("test");
            System.out.println("Entered data in textfield");    
        }   
        catch (Exception e)
        {  
              	
        	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(ss, new File("/home/gornelex/Selenium/Programs/CaseStudies/images/"+System.currentTimeMillis()+".jpg"));
        	System.out.println("Screenshot is captured for failed testcase");       		
        }  

	}

}
