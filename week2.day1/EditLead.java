package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();		
		
		driver.findElement(By.linkText("CRM/SFA")).click();	
		
		//Click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Leads option
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Alten Private Limited");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vadi1");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja1");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vadi1");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("createLeadForm_description");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Vadi11@gmail.com");
		
		Select s= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updateLeadForm_importantNote");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Page Title is: "+driver.getTitle());

	}

}
