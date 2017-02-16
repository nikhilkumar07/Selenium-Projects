
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethods {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights");
		WebElement male_radio_button=driver.findElement(By.id("multi_city_button"));        
	      male_radio_button.click();
		/*System.out.println("Before clicking Multi-city radio button");
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='multi_city_button']")).click();
		System.out.println("After clicking Multi-city radio button");*/
		
		/*isDisplayed() is used to validate wheather an object is visible or not.
		But the object must exist in the web page/code.*/
	
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		
		/* size() will only validate wheather the objects are present in the Web page/code or not.
		 *  In the below statement the XPath I declared doesn't exist in the code so it shows an error.
		 */
		 
		System.out.println(driver.findElements(By.xpath(".//*[@id='mul_city_button']/span")).size());
		// The getText() will show the the "Text" present on the object.
		//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom_noblocksit']/div[1]/div[1]/div[2]/h3")).getText());
		
		//isEnabled() will show wheather the object/element is enabled or not in the webpage
		//driver.findElement(By.xpath(".//*[@id='mul_city_button']/span")).isEnabled();
		
		
		
		
	}

}
