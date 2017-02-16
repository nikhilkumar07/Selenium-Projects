import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	
	//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	
	/*The method should be "findElements" because in the Xpath 
	 we have specified group1 so all the elements in the group1 are going to be identified.
	 If you give findElement() and there are more than 1 element in group 1 then it wont compile*/
	
	int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
	for(int i=0;i<count;i++)
	{
		String name=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		if(name.equals("Cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
	}

	}

}
