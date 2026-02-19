import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdCode {

	public static void main(String[] args) {
		
		 
		        WebDriver driver = new ChromeDriver();
		        
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
