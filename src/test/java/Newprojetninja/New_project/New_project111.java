package Newprojetninja.New_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_project111 {
	
	public static WebDriver driver;
 




	@Test
		 public static void loginAllTest() {
		
			 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("helloworld@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		

		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();

		 }
	
	
	
	
}
