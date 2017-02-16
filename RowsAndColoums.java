
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RowsAndColoums {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.espncricinfo.com/sri-lanka-v-australia-2016/engine/match/1035927.html");
		WebElement table=driver.findElement(By.xpath("//table[@class='batting-table innings']"));
		List<WebElement> noOfRows=table.findElements(By.xpath("//tbody/tr[.//a[contains(text(),'DAS')]]"));
		System.out.println("no. of rows in the table are:"+ noOfRows.size());
		int i=0;
		for(WebElement eachRow:noOfRows)
		{
			List<WebElement> eachColoum=eachRow.findElements(By.tagName("td"));
			i++;
			System.out.println("no. of coloums in"+ i+ "row "+eachColoum.size());
			for(WebElement text:eachColoum)
			{
				System.out.println(text.getText());
			}
			
		}

	}

}
