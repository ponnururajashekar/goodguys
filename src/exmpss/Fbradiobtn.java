package exmpss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbradiobtn {

	public static void main(String[] args) throws InterruptedException {
		//Launch site
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dvr= new ChromeDriver();
		dvr.get("https://www.facebook.com/");
		Thread.sleep(3000);
				
		//radio button
		WebElement ivrr= dvr.findElement(By.xpath("(//*[@type='radio'])[2]"));
		Thread.sleep(3000);
		ivrr.click();
		if(ivrr.isEnabled()) {
			
			System.out.println("Radio button is selected");
			
		}
		
		else {
			System.out.println("Radio button is  not selected");

		}
		
		

	}

}
