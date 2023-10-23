import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project2 {
	
	WebDriver driver = new EdgeDriver();
	String URL = "https://www.saucedemo.com/";
	
	
			
	@BeforeTest
	public void myBeforeTest() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().window().maximize();
		
		
	}
	@Test()
	public void myTest() {
		List<WebElement> AddToCartBtn = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < AddToCartBtn.size(); i+=2) {
			AddToCartBtn.get(i).click();
		}
		
	}
	@AfterTest
	public void myAfterTest() {}
	

}
