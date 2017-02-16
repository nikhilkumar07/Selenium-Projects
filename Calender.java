
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//*[@id='start_date_sec']/span[3]")).click();
driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[6]/a")).click();

int i=0;
while(i<5)
{
	driver.findElement(By.xpath("//*[@id='adult_count']/a[2]")).click();
	i++;
}
	}

}
