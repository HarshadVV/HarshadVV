package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://autoxdev.katdev.com:4000/shop?category=4W");
		Thread.sleep(10000);
		
		//dependent-independent using index
		 String prodName=driver.findElement(By.xpath("//div[@class='prod-infos'][1]/ancestor::li[1]/descendant::span[@class='title'][1]")).getText();
		 System.out.println(prodName);
	}

}
