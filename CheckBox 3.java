import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		/* The "isSelected()" returns a boolean value. 
		In this case if the application selects Student box then the isSelected() will returns a boolean value either True/False.*/
		
System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).click();

	}

}
