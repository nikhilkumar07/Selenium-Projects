
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		System.out.println("Links In Amazon Website");
		
		//printing no. of links in amazon
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//printing no. of links in footer section

		WebElement footer=driver.findElement(By.xpath(".//*[@id='navFooter']"));
		System.out.println("Links in footer section");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//printing no. of links in header section
		WebElement header=driver.findElement(By.xpath(".//*[@id='nav-main']/div[3]"));
		System.out.println("Links in header section");
		System.out.println(header.findElements(By.tagName("a")).size());
		
		String Beforeclicking = null;
		String Afterclicking;
		//printing no. of links in the 1st coloum in footer section
		WebElement col=driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]"));
		System.out.println("Links in 1st coloum of footer section");
		System.out.println(col.findElements(By.tagName("a")).size());
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			//printing 1st coloum links text
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			//compares each link title name with "Gift a smile"title link
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Gift a Smile"))
			{
			
				Beforeclicking=	driver.getTitle();
				//clicking on "Gift a smile link" in 1st coloum
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
		}
		//System.out.println(driver.getTitle());
		Afterclicking=driver.getTitle();
		//comparing "Amazon" home title name and "Gift a smile" title name
		if(Beforeclicking!=Afterclicking)
		{
			if(driver.getPageSource().contains("How to support"))
			{
			System.out.println("pass");
			}
		
		else
		{
			System.out.println("fail");
		}
	}

}
}
