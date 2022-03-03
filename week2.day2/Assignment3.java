package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		System.out.println("Page title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		driver.close();
		
	}

}
