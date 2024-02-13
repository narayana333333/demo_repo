package module_01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
      
        	List<WebElement> weeks = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
        	//List<WebElement> WN = driver.findElements(By.xpath("(//input[@type='checkbox'])")); 
        	//Iterator<WebElement> EL=WN.iterator(); 
        	Iterator<WebElement> itr=weeks.iterator();
        while(itr.hasNext()) {
        	WebElement sple = itr.next();
        	sple.click();
        	Thread.sleep(1000);
        	String wName = sple.getText();
        	System.out.println(wName);
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='country']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='Germany']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/02/2024");
        Thread.sleep(3000);
       driver.close();
	}

}
