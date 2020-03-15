package UnittestFrame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguagetest {

// in facebook home page, find out all language they support, loop through all language link text, and if linke text eual to zhongwen, click that

	public static WebDriver driver = null;

	public static void setup() {

		WebDriverManager.firefoxdriver().setup();
		// open the chrome browser
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}

	@Ignore
	public void language() {

		setup();
		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.className("_sv4"));

		System.out.println(links.size());

		// print all of links text, ten text

		for (int i = 0; i < links.size(); i++) {

			System.out.println(links.get(i).getText());

			if (links.get(i).getText().equals("中文(简体)")) {
				links.get(i).click();

			}

		}

		driver.navigate().back();

	}
	
	@Ignore
	public void pictures() {
		
		List<String> a=new ArrayList<String>();
		setup();
		driver.get("https://www.facebook.com/");
		List<WebElement> aa=driver.findElements(By.tagName("img"));
		
		System.out.println(aa.size());
		
		if(aa.size()>0) {
			System.out.println("this page contains images");
		}
	}
	
	@Test
	public void gettingAttribute() {
		setup();
		driver.get("https://www.facebook.com/");
		WebElement facct=driver.findElement(By.linkText("Forgot account?"));
		
		String herf_value=facct.getAttribute("href");
		
		System.out.println(herf_value);
	}

	

}
