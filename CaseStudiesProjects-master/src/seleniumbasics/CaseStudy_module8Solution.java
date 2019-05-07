import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
@Listeners(SamplePackage.Listener.class)
public class EcommerceTest {
    
    public static WebDriver driver;
    public static String driverPath = "./chromedriver.exe";
    public static String sBookKey = "Selenium Books";

    @Test (priority = 2)
    public void AddToWishList() {
        getElement(By.xpath("//*[text()=\"✕\"]")).click();
        //search for the selenium book

        getElement(By.xpath("//*[@placeholder=\"Search for products, brands and more\"]")).sendKeys(sBookKey);
        getElement(By.xpath("//*[@placeholder=\"Search for products, brands and more\"]")).sendKeys(Keys.ENTER);
        getElement(By.xpath("//*[@title=\"Educational and Professional Books\"]")).click();
        getElement(By.xpath("//*[@title=\"Selenium WebDriver 1st  Edition\"]")).click();
        
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        //Use the list of window handles to switch between windows
        String handleName = tabs.get(1);driver.switchTo().window(handleName);

        getElement(By.id("pincodeInputId")).sendKeys("560092");
        getElement(By.xpath("//*[text()=\"Check\"]")).click();
        
        try {
            Thread.sleep(1000);
            }
            
             catch (InterruptedException e1) 
             {
             e1.printStackTrace();
             }
             
             String text =getElement(By.xpath("//*[text()=\"Delivery by\"]")).getText();
             System.out.println(text);
             getElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
             driver.close();
             driver.switchTo().window(tabs.get(0));


             getElement(By.xpath("//*[@href=\"/viewcart?otracker=Cart_Icon_Click\"]")).click();
             String text1 =getElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a")).getText();
             System.out.println(text1);
             
             getElement(By.xpath("//*[text()=\"Place Order\"]")).click();
             getElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("test@testmail.com");
             getElement(By.xpath("//*[text()=\"CONTINUE\"]")).click();
             getElement(By.xpath("//*[@type=\"password\"]")).sendKeys("12345678");
             getElement(By.xpath("//*[@type=\"submit\"]")).click();
             //pause for a second.
             
             try {
                 
                 Thread.sleep(1000);
                 } 
                 catch (InterruptedException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                     }
                     boolean Error = driver.getPageSource().contains("Your username or password is incorrect");
                     Assert.assertEquals("True",Error);
                     }
                     
                     public void endSession() 
                     {
                         driver.close();
                         driver.quit();
                     }


