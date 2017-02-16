
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GmailSignup {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
WebDriver driver=new ChromeDriver();
//Automating google
driver.get("https://www.google.com/?gws_rd=ssl");
//Searching for gmail signup in google using Actions class
Actions element=new Actions(driver);
WebElement abc=driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
element.moveToElement(abc).click().sendKeys("gmail signup").build().perform();
driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
//Automating gmail signup link
Actions link=new Actions(driver);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement xyz=driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a"));
link.moveToElement(xyz).click().build().perform();
//Entering first name
driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
//Entering last name
driver.findElement(By.id("LastName")).sendKeys("Bhavanam");
//Entering Gmail address
driver.findElement(By.id("GmailAddress")).sendKeys("nikhilbhavanam30");
//Entering password
driver.findElement(By.id("Passwd")).sendKeys("07111994");
//Confirming first name
driver.findElement(By.id("PasswdAgain")).sendKeys("07111994");
//Entering birth day
driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("07");
//Entering birth month
driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).sendKeys("November");
//Entering birth year
driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1994");
//Specifying gender
driver.findElement(By.xpath(".//*[@id='Gender']/div")).sendKeys("Male");
//selecting country code
driver.findElement(By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div/div[2]")).click();
driver.findElement(By.id(":ad")).click();
//driver.findElement(By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div/div[2]"));
//entering phone number
WebElement table=driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']"));
table.sendKeys("7842659737");
//Entering recovery email id
driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys("nikhilreddy07@gmail.com");
//Clicking on submit button
driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();
	}

}
