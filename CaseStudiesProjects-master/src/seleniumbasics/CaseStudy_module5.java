package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CaseStudy_module5 {
	
	//Only: mandatory fields
	//Please, complete the following before start the script 
	
	//Login edureka.co details
	static String email_id = "gornelex1986@gmail.com"; //Add your Edureka.co Email id.
	static String password_id = "guadalupe01"; //Edureka.co password.
	
	/*Personal data*/
	
	//Complete name
	static String name = "Gabriel Alejandro Ornelas Uribe"; 
	
	//Country 
	static String country = "Mexico";
	
	//Phone number
	static String ph_number = "3311836248";
	
/*Select your job description 
Software Developer
Load/Performance Tester
Automated Tester
Manual Tester
System Administrator
Database Administrator
Database Developer
Front-End Developer
Back-end Developer
UI Designer
UX Designer
Mobile Developer
Cloud Architect
Cloud Developer
Big Data Developer / Engineer
Big Data Architect
Blockchain Developer
ETL Consultant
ETL Developer
Data-Scientist
Data Analyst
Data Architect
Business Analyst
BI Developer
DevOps Engineer
DevOps Consultant
Project Manager
Deep Learning Engineer
Machine Learning Engineer
Mainframe Developer
Ethereum Developer
Blockchain Consultant
Student
Others
*/
	static String role_description = "Manual Tester";
	
//Years of experience - Select the value according to the years.
   /*1 = 0-2 years, 
	 2 = 2-4 years, 
     3 = 4-7 years, 
	 4 = 7-10 years, 
	 5 = 10-15 years, 
	 6 = 15 */
	static int experience_years = 2;
	
	
	//Most Accurately Describes your Current Job Level ? 
	   /*1 = Top/Executive Management, 
		 2 = Senior Management, 
	     3 = Mid Management, 
		 4 = Entry Level, 
		 5 = Not Applicable - Fresher, 
		  */
		static int job_level = 4;
		
		
		//Select an industry 
		   /*1 = Internet 
			 2 = IT-Software / Software Services
		     3 = BPO / Call Centre / ITES 
			 4 = Banking / Financial Services / Broking
			 5 = Media / Entertainment
			 6 = Retail / Wholesale
			 7 = Pharma / Biotech / Clinical Research
			 8 = Consulting
			 9 = KPO / Research / Analytics
			 10= Advertising / PR / MR / Event Management
			 11= Telecom / ISP
			 12= IT-Hardware & Networking
			 13= Semiconductors / Electronics
			 14= Insurance
			 15= Automobile / Auto Anciliary / Auto Components
			 16= Others
			  */
			static int industry_selection = 1;
			
			//Enter your Skills (separated by commas)
	static String skills = "Tester Lead, QA Automation";
	
	/*Types of jobs you are interested in 
	Select one of the options

	1 = Big Data and Analytics
	2 = Cloud Computing
	3 = Business Intelligence and Visualization
	4 = DevOps
	5 = Programming and Web Development
	6 = Software Testing
	7 = Project Management
	8 = Mobile App Development
	9 = Digital Marketing
	10 = Operating Systems
	11= Architecture & Design Patterns
	12= Data Science
	13= Frontend Development
	14= Artificial Intelligence
	15= Databases
	16= Cyber Security
	17= Data Warehousing and ETL
	18= Robotic Process Automation
	19= Blockchain
	*/
	static int jobs_intested = 6;
	
	/*Employment types looking for *
	 * 1 = Permanent
	 * 2 = Contract
	 * 3 = Both
	 * */
	static int job_type_element = 3;
	
	
	//Current city Where are you currently based? * Enter your city name
	static String currencity = "Guadalajara";
			
    /*what is your expected Salary
 *1 = $25K - $50K
2 = $50K-$75K
3 = $75K-$100K
4 = $100K-$125k
5 = $125K-$150k
6 = $150K-$175k
7 = $175K-$200k
8 = $200K-$225k
9 = $225K-$250k
10= $250K-$275k
11= $275K-$300k
12= $300K-$400k
13= $400K-$500k
14= $500k*/
		static int expected_salary = 1;	

//Are you willing to relocate? *
	/*
	 * enter true = yes
	 * enter false = no
	 * */
		static Boolean relocated = false;
		
//Relocate country and City name
		
		static String country_relocate = "Mexico";
		static String city_relocate = "Mexico";
		
		
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//Open ChromeBrowser
				System.setProperty("webdriver.chrome.driver", "/home/gornelex/Selenium/InstallationStuff/ExeFiles/chromedriver73.0.3683.68_linux64");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.get("https://www.edureka.co/");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.linkText("Log In")).click();
				Thread.sleep(2000);
				
				/*Login process*/
				driver.findElement(By.id("si_popup_email")).sendKeys(email_id);
				driver.findElement(By.id("si_popup_passwd")).sendKeys(password_id);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
				Thread.sleep(2000);
				
				//Click on profile
				driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@data-button-name='My Profile']")).click();
				Thread.sleep(2000);
				
				//Click details page
				driver.findElement(By.id("personal_details")).click();
				Thread.sleep(2000);
				

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
				
				driver.close();
	
	}

}
