package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {

	@Test
	public void Testcase1() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World2");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		String ActTitle = driver.getTitle();
	
		
		Assert.assertEquals(ActTitle, "Facebook - Log In or Sign Up");
		
		
		WebElement Uname = driver.findElement(By.id("email"));
		WebElement Pwd = driver.findElement(By.id("pass"));
		WebElement Button = driver.findElement(By.id("u_0_b"));
		
		Uname.sendKeys("Test123");
		Pwd.sendKeys("1234");
		Button.click();


	}

}
