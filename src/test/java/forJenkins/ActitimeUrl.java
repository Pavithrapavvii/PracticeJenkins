package forJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeUrl {
	@Test
	public void getCurrentUrl(WebDriver driver,String browser)
	{
		//
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
		
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String Url = driver.getCurrentUrl();
		if(Url.equals("https://www.selenium.dev/"))
		{
			System.out.println("url is successfully navigating and pass");
		}
		else {
			System.out.println("url is not successfully navigating and fail");
		}
		driver.close();
	}
	//byeeeeee

}
