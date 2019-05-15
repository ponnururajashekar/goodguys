package exmpss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakuriexam {

	public static void main(String[] args) throws InterruptedException {
		//Launch site
	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	 ChromeDriver dvr= new ChromeDriver();
	 dvr.get("https://my.naukri.com/account/createaccount?othersrcp=11496&wExp=N");
	 Thread.sleep(3000);
	 
	 //click on i'm fresher button
	 dvr.findElement(By.xpath(" //*[text()='I am a Fresher']")).click();
	 
	 WebElement err= dvr.findElement(By.xpath("//*[text()='Outside India']"));
	 JavascriptExecutor js = (JavascriptExecutor)dvr;  
	 js.executeScript("arguments[0].click();",err);	
	 
	 WebElement rvrr= dvr.findElement(By.xpath("(//*[@type='text'])[8]"));
	 if(rvrr.isDisplayed()) {
		 
		 System.out.println("Textbox is displayed");
		 
	 }
	 else {
		 System.out.println("Textbox is  not displayed");

	 }
		 
	 }

	 
	 
				
				

	}


