package group7jjmm.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
public class Web {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "//chromedriver//chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/opt/google/chrome/google-chrome");
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.addArguments("--headless");
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--remote-debugging-port=9222");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/mvnwebapp");
	}
}
