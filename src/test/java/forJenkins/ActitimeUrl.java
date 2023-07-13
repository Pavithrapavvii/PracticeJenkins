package forJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActitimeUrl {
	@Test
	public void getCurrentUrl()
	{
		WebDriver driver=new ChromeDriver();
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
	//thank you
	//hiii

}
