package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver = new ChromeDriver();
		
		// 1- Open Browser (Chrome)
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/ar");
		
		System.out.println(driver.findElement(By.partialLinkText("تسجيل")).getText().contains("تسجيل"));
		
	/*
	    driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.cssSelector("input#identifierId")).sendKeys("asd");
		driver.findElement(By.xpath("//button[@jsname=\"LgbsSe\"]")).click();
	 */
		driver.quit();
	}

}
