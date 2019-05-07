package appModuleActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class updateProfile {
	
	WebDriver driver;
	
	public updateProfile(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		this.driver=driver;

	}
	
	
	public void updateProfileAction() throws InterruptedException {
		
		String name = "Gabriel Alejandro Ornelas Uribe"; 
		String country = "Mexico";
		String ph_number = "3311836248";
		String role_description = "Manual Tester";
		int experience_years = 2;
		int job_level = 4;
		int industry_selection = 1;
		String skills = "Tester Lead, QA Automation";
		int jobs_intested = 6;
		int job_type_element = 3;
		String currencity = "Guadalajara";
		int expected_salary = 1;
		Boolean relocated = false;
		String country_relocate = "Mexico";
		String city_relocate = "Mexico";
		
		/*Start the actions to fill all the formulary */
		//Complete name
		driver.findElement(By.name("fullname")).click();
		driver.findElement(By.name("fullname")).clear();
		driver.findElement(By.name("fullname")).sendKeys(name);
		Thread.sleep(2000);
		
		//adding country and phone number
		driver.findElement(By.xpath("//button[@class='btn btn-default countrydrpbtn dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='country-search']")).sendKeys(country);
		Thread.sleep(2000);
		driver.findElement(By.name("phone_number")).click();
		driver.findElement(By.name("phone_number")).clear();
		driver.findElement(By.name("phone_number")).sendKeys(ph_number);
		Thread.sleep(2000);
		
		//Current role description (What describes your Current Role ? *)
		driver.findElement(By.name("currentrole")).click();
		driver.findElement(By.name("currentrole")).clear();
		driver.findElement(By.name("currentrole")).sendKeys(role_description);
		Thread.sleep(3000);
		
		//What is your experience? (year of experience)
		driver.findElement(By.id("experience")).click();
		Select experience = new Select(driver.findElement(By.id("experience")));
		experience.selectByIndex(experience_years);
		Thread.sleep(3000);
		
		//continue
		driver.findElement(By.xpath("//*[@class='btn btn-default pull-right verify-continue-btn']")).click();
		Thread.sleep(3000);
		
		//Skipping message
		driver.findElement(By.xpath("//a[@class='skip']")).click();
		Thread.sleep(2000);
	
		//Select current level job in professional details
		driver.findElement(By.name("currentjob")).click();
		Select current_job_level = new Select(driver.findElement(By.name("currentjob")));
		current_job_level.selectByIndex(job_level);
		Thread.sleep(3000);
		
		//Select industry
		driver.findElement(By.name("currentIndustry")).click();
		Select current_industry = new Select(driver.findElement(By.name("currentIndustry")));
		current_industry.selectByIndex(industry_selection);
		Thread.sleep(3000);
		
		
		//adding Skills 
		driver.findElement(By.name("userSkill")).click();
		driver.findElement(By.name("userSkill")).clear();
		driver.findElement(By.name("userSkill")).sendKeys(skills);
		Thread.sleep(5000);
		
		//submit next
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
		
		//jobs interested
		driver.findElement(By.name("interestedJob")).click();
		Select insterested_jobs = new Select(driver.findElement(By.name("interestedJob")));
		insterested_jobs.selectByIndex(jobs_intested);
		Thread.sleep(3000);
		
		//Employment types looking for 
		driver.findElement(By.name("elementType")).click();
		Select jobs_type = new Select(driver.findElement(By.name("elementType")));
		jobs_type.selectByIndex(job_type_element);
		Thread.sleep(3000);
		
		//adding city name
		driver.findElement(By.name("currentCity")).click();
		driver.findElement(By.name("currentCity")).clear();
		driver.findElement(By.name("currentCity")).sendKeys(currencity);
		Thread.sleep(3000);
		
		
		//expected salary
		driver.findElement(By.name("lastDrawnSalaryUS")).click();
		Select salary = new Select(driver.findElement(By.name("lastDrawnSalaryUS")));
		salary.selectByIndex(expected_salary);
		Thread.sleep(3000);
		
		//Select if you want to relocate
		if (relocated == true) {
			driver.findElement(By.xpath("//input[@name='preferredlocation' and @value='true']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[6]/div/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[6]/div/div/ul/perfect-scrollbar/div/div[1]/li[1]/input")).sendKeys(country_relocate);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/div[6]/div/input")).sendKeys(city_relocate);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn onboarding-primary-button pull-right']")).click();
			Thread.sleep(3000);
		}
		else
		{
			driver.findElement(By.xpath("//input[@name='preferredlocation' and @value='false']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn onboarding-primary-button pull-right']")).click();
			Thread.sleep(5000);
		}
		
		driver.findElement(By.xpath("//button[@class='btn pull-right onboarding-primary-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='dropdown-toggle']//following::button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Blog")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);	
		
	}
	
	

}
