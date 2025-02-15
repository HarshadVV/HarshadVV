package MouseActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath(" //a[contains(text(),'BANK')]"));
		WebElement dest=driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act=new Actions(driver);
		//dragAndDrop():This method is used to perform the Drag and Drop action
		act.dragAndDrop(src, dest).perform();
		}

}
