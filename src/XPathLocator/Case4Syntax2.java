package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4Syntax2 {

	public static void main(String[] args) throws InterruptedException {
		//Case4= xpath using multiple attribute(Logical operators)
		//It is use when we don't have unique attribute or attribute with unique value
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password' ]")).sendKeys("admin@123");
		
	}

}
