
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://patrickhlauke.github.io/recaptcha/");
		int number=frameCountNumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int number1=frameCountNumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		
		
	

	}
	
	public static int frameCountNumber(WebDriver driver,By by)
	{
		int i;
		int frameCount=driver.findElements(By.tagName("iframe")).size();
		for(i=0;i<frameCount;i++)
		{
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0)
			{
				break;
			}
			else
			{
				System.out.println("continue looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
