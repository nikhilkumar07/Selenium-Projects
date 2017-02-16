import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com");
		// "findElement" will identify the elements by different locator techniques like XPath
		// "By." will identify elements with Locator techniques
		// click() will trigger the click option on the application under test(www.qaclickacademy.com")
		driver.findElement(By.xpath(".//*[@id='login-social']/p[1]/a")).click();
		
	}

}
