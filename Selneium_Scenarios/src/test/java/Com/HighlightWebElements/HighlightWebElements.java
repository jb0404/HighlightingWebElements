package Com.HighlightWebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// Launching the github
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		// to maximize window
		driver.manage().window().maximize();

		// TO find the element using ID Locator
		// driver.findElement(By.id("login_field")).sendKeys("ID Locator");
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(2000);

		// driver.findElement(By.name("password")).sendKeys("name Locator");
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(2000);

		// driver.findElement(By.linkText("Forgot password?")).click();
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(2000);
         
		//driver.findElement(By.partialLinkText("Create an")).click();
		highlight(driver,driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
		driver.close();
	}

	public static void highlight(WebDriver driver, WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);

	}
}
