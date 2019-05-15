package exmpss;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklg {

	public static void main(String[] args) throws InterruptedException {
		//Launch site
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dvr= new ChromeDriver();
		dvr.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		dvr.findElement(By.name("email")).sendKeys("sekhar9390@gmail.com");
		Thread.sleep(3000);
		dvr.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("rajashekar");
		Thread.sleep(3000);
		dvr.findElement(By.xpath("//*[@aria-label='Log In']")).submit();
		
		
		
		
		dvr.close();

	}

}
