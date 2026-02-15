import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondCode {

	public static void main(String[] args) {
		
		 
		        WebDriver driver = new EdgeDriver();
		        
		        // Add options (e.g., maximize window)
		        // ChromeOptions options = new ChromeOptions();
		        // options.addArguments("--start-maximized");
		        // WebDriver driverWithOptions = new ChromeDriver(options);

		        // Example actions
		        driver.get("https://www.google.com");
		        System.out.println(driver.getTitle());
		        driver.quit();
		    }
		

}
