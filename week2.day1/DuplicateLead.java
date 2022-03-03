package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				WebElement CN=driver.findElement(By.id("createLeadForm_companyName"));
				CN.sendKeys("XXYY");
				WebElement FN=driver.findElement(By.id("createLeadForm_firstName"));
				FN.sendKeys("Vadi");		
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vadi22");
				driver.findElement(By.name("departmentName")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Script");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
				Select s=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				s.selectByVisibleText("New York");
				driver.findElement(By.name("submitButton")).click();//Click on Create Lead Button
				System.out.println("Page Title is : "+driver.getTitle());
				driver.findElement(By.linkText("Duplicate Lead")).click();		
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Company");
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vadirenamed");
				driver.findElement(By.name("submitButton")).click();//Click on Create Lead Button
				System.out.println("Page Title is: "+driver.getTitle());
				//driver.close();//Close the browser
			}




	
	}

