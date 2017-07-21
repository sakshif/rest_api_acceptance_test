package Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cucumberTest {



	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sakshimahajan/git/chromedriver");
		WebDriver driver ;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		  driver.get("https://www.google.com");
		  Thread.sleep(2000);
		  
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ATDD");
		  searchBox.submit();
		  Thread.sleep(5000); 
		 driver.quit();
	}

}
