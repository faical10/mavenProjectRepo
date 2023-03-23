package Today_mars01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mars01 {
	
	public static WebDriver driver;
	
	@Test

	public void rediffTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mailrediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Selenuimpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenuim@123");
		driver.findElement(By.className("signinbtn")).click();
	}
}
