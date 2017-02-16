
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions element=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
		element.moveToElement(abc).click().sendKeys("gmail signup").build().perform();
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		//Automating gmail signup link
		Actions link=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement xyz=driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a"));
		link.moveToElement(xyz).click().build().perform();
	
Actions action = new Actions(driver);    
		WebElement optionsList = driver.findElement(By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div"));
		action.moveToElement(optionsList).click();

		List<WebElement> options = driver.findElements(By.xpath(".//*[@id=':ad']/div/div/span[1]')]"));
		for(WebElement option : options) {
		    if (option.getText().equals("India")) 
		    {
		        option.click();
		    }


	}

}
}
