
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		Actions element=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		element.moveToElement(abc).build().perform();
		WebElement xyz=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		element.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("iphone 5s").build().perform();
		element.contextClick(xyz).build().perform();

	}

}
