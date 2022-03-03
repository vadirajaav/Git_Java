package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();		
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();	
		
		//Click on Leads button
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		//Click on Create Leads option
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Alten Private Limited");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Vadi");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Raja");
		
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Vadi");
		
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("IT");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("createLeadForm_description");
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("Vadi@gmail.com");
		
		Select s= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("New York");
		
		WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton.click();
		
		System.out.println("Page Title is: "+driver.getTitle());
		
	}

}
