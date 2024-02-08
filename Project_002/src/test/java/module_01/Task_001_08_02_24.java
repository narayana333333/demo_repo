package module_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_001_08_02_24 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("narayana");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz143@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9187654098");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("phase-3,kphb colont");
        driver.findElement(By.xpath("//input[@id='male']")).click();
        for(int i=1;i<=7;i++) {
        	driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]")).click();
        	Thread.sleep(1000);
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='country']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='Germany']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/02/2024");
        driver.close();
	}

}
