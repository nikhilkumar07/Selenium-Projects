

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCompose {
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
WebDriver driver=new ChromeDriver();
System.out.println("Opening Google");
driver.get("https://www.google.com/?gws_rd=ssl");
System.out.println("Clicking on Gmail Link");
driver.findElement(By.xpath(".//a[contains(text(),'Gmail')]")).click();
System.out.println("Clicking on Sign In Link");
driver.findElement(By.xpath(".//a[contains(text(),'Sign In')]")).click();
System.out.println("Enter Email Id");
driver.findElement(By.id("Email")).sendKeys("nikhiltintu4@gmail.com");
System.out.println("Next Button");
driver.findElement(By.id("next")).click();
System.out.println("Wait for 5 seconds to find next element");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
System.out.println("Enter Password");
driver.findElement(By.id("Passwd")).sendKeys("nikhiltintu4");
System.out.println("Clicking on Sign In button");
driver.findElement(By.id("signIn")).click();
System.out.println("Click on Compose Button");
driver.findElement(By.xpath(".//div[contains(text(),'COMPOSE')]")).click();
System.out.println("Wait for 10 seconds to find next element");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
System.out.println("Enter Recipient's Email");
driver.findElement(By.xpath(".//textarea[@aria-label='To']")).sendKeys("nikhiltintu4@gmail.com"); 
System.out.println("Enter Subject");
driver.findElement(By.xpath(".//input[@aria-label='Subject']")).sendKeys("RE: TEXT MESSAGE ");
System.out.println("Enter Text");
driver.findElement(By.xpath(".//div[@aria-label='Message Body']")).sendKeys("Hello world");
System.out.println("Click on Send Button");
driver.findElement(By.xpath(".//div[contains(text(),'Send')]")).click();
}
}
