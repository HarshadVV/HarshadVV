package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testMethods {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']")).sendKeys("test");
		
		}

}
