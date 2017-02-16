
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookAutomate {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("nikhiltintu4@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("nikhiltintu77");
		driver.findElement(By.cssSelector("#u_0_n")).click();
		

	}

}
