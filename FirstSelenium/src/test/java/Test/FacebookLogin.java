package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// interfacename obj=new Classname();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Fei Ai\\eclipse-workspace\\FirstSelenium\\src\\test\\java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("English (US)")).click();
		// wait 3 sec
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("fredoz0@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234569ddd");
		driver.findElement(By.xpath("//*[@aria-label=\"Log In\"]")).click();

		String a = driver.findElement(By.xpath("//*[contains(text(),\"match any account\")]")).getText();

		System.out.println(a);
		String status = null;
		String expected = "The email you’ve entered doesn’t match any account. Sign up for an account.";

		if (a.equals(expected)) {
			status = "Passed!!!";
			System.out.println("Test Case " + status);
		} else {
			status = "Failed!!!";
			System.out.println("Test Case " + status);
			System.out.println(" please raise a bug ticket");
		}
		// driver.close();

	}

}
