package module_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class task_02_09_2_24 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
     WebElement name_txt_box = driver.findElement(By.xpath("//input[@id='name']"));
     name_txt_box.sendKeys("unryana");
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("narayana3333@gmail.com");
     driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9090903333");
     driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("ongole,prakasham district");
     WebElement categ_male = driver.findElement(By.xpath("//label[@for='male']"));
    boolean check_01 = categ_male.isEnabled(); 
    if(true==check_01) {
    categ_male.click();
    System.out.println("male radio butoon is working fine");
    }
    else {
    	System.out.println("radio button is not working");
    }
    for(int i=1;i<=9;i++) {
                if(i>=3) {
    driver.findElement(By.xpath("(//label[@class='form-check-label'])["+i+"]")).click();
             Thread.sleep(1000);
                }
    }
        driver.switchTo().frame(0);
          WebElement check_02= driver.findElement(By.xpath("//input[@name='Submit']"));
          boolean sub_btn_check = check_02.isEnabled();
          if( sub_btn_check==true) {
        	 
        	  check_02.click();
        	  Thread.sleep(3000);
        	  System.out.println("subbmit button is working fine");
          }
          else {
        	  System.out.println("submit button is not working");
          }
          Thread.sleep(3000);
          driver.close();
	}
	
}
