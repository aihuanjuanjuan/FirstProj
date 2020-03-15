package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"))).build().perform();
		
		ac.click(driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a"))).build().perform();
		
		System.out.println(driver.getTitle());
	}

}
