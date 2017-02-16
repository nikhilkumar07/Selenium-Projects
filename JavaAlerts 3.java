
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		// This will print the Text present in Alert pop-up
		System.out.println(driver.switchTo().alert().getText());
		
		/* Using sendKeys() we can type "nikhil" in the alert pop-up's if there is a text box
		 * driver.switchTo().alert().sendKeys("nikhil"));
		 * 
		 */
		
		// The "switchTo()" will switch to the Java alert Pop-up's.
		// accept() will accept the Pop-up's like "OK".
		driver.switchTo().alert().accept();

	}

}
