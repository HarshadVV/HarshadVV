package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMozilla {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		

	}

}
