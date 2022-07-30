package group7jjmm.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Web {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "//chromedriver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/mvnwebapp");
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("xyzz@yahoo.com");
	}
}
