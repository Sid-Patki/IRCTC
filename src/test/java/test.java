import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		
		System.setProperty("edge driver", "Drivers\\msedgedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("www.qa.com");
	}

}
