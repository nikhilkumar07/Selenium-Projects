import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class StaticDropdownMenu {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		Select dropdown=new Select((WebElement) driver.findElements(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(5);
		dropdown.deselectByVisibleText("9 Aults");
		dropdown.deselectByValue("6");
	
	}

}
