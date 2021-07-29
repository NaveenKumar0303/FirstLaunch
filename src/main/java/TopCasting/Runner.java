package TopCasting;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {

	public static void Execution() {

		Class1 obj = new Class2();
		obj.C();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("NaveenKumar");
		
	}

}
