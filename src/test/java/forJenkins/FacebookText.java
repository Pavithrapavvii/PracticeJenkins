package forJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookText {
	@Test
	public void getText(WebDriver driver,String browser)
	{
		//WebDriver driver=new ChromeDriver();
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		if(browser.equals("ie")) {
			driver=new InternetExplorerDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		 driver.get("https://www.facebook.com/");
		 String text = driver.findElement(By.name("login")).getText();
		 System.out.println(text);
		 driver.close();
	}
	
	//facebook done

}
