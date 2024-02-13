package module_01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_03_12_2_24 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(15));
		waits.until(ExpectedConditions.alertIsPresent());
		Alert aler = driver.switchTo().alert();
		aler.accept();
		WebElement element = driver.findElement(By.xpath("//button[@id='populate-text']"));
		element.click();
		  waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		System.out.println(driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']")).getText()+" is replaced by text");
		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
		 waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
		 System.out.println();
		 System.out.println(driver.findElement(By.xpath("//button[text()='Enabled']")).isEnabled());
		 driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		 waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Button']")));
		 System.out.println(driver.findElement(By.xpath("//button[text()='Button']")).isDisplayed());
		driver.findElement(By.xpath("//button[@id='checkbox']")).click();
		waits.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//input[@id='ch']"))));
		System.out.println(driver.findElement(By.xpath("//input[@id='ch']")).isSelected());
	}

}
