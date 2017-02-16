
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		//explicit wait
		WebDriverWait wd=new WebDriverWait(driver,5);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("nik");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[8]/p")).click();


	}

}
