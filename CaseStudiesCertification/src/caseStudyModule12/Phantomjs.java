package caseStudyModule12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phantomjs {

	public static void main(String[] args) throws IOException {
		System.setProperty("phantomjs.binary.path", "C:\\Selenium\\InstallationStuff\\ExeFiles_Browser Drivers\\phantomjs2.1.1.exe");
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("edureka");
		element.submit();
		String title = driver.getTitle();
		
		boolean result = title.equals("edureka");
			
		if (result == true) {
			System.out.println("title is correct");
		}
		else
		{
			
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     	FileUtils.copyFile(screenshot, new File("C:\\Selenium\\Programs\\CaseStudiesCertification\\images\\"+ System.currentTimeMillis()+".jpg"));
	     	System.out.println("Screenshot is captured");
			
		}

	}

}
