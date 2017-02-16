
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;


public class KillingTasks {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "//Users//nikhilkumarbhavanam//Downloads//chromedriver");
		//WebDriver driver=new ChromeDriver();
		WindowsUtils.tryToKillByName("Microsoft word.exe");
	

	}

}
