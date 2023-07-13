package forJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookText {
	@Test
	public void getText()
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String text = driver.findElement(By.name("login")).getText();
		 System.out.println(text);
		 driver.close();
	}
	
	//hellooooo

}
