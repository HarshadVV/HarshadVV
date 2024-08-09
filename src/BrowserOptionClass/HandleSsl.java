package BrowserOptionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSsl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setAcceptInsecureCerts(true); //by default it is false we need to make it true
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.get("https://expired.badssl.com/");
		 
		 System.out.println("Title of page= "+ driver.getTitle());

	}

}
