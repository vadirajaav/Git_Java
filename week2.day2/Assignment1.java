package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("AV");
		
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("11");
		
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("Password123");
		
		// select from drop list
		WebElement day = driver.findElement(By.id("day"));
		Select dayDOB = new Select(day);
		dayDOB.selectByVisibleText("22");

		WebElement month = driver.findElement(By.id("month"));
		Select monthDOB = new Select(month);
		monthDOB.selectByVisibleText("Feb");

		WebElement year = driver.findElement(By.id("year"));
		Select yearDOB = new Select(year);
		yearDOB.selectByVisibleText("1992");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.close();
		

	}

	

}
