package exmpss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindAllLinks {


	public static void main(String[] args) throws InterruptedException {
		//Launch site
		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		 ChromeDriver dvr= new ChromeDriver();
		 dvr.get("https://www.amazon.in/");
		 dvr.manage().window().maximize();
		 Thread.sleep(3000);
		 
		// find all links in size
		 List<WebElement> liii = dvr.findElements(By.xpath("//a"));
		 System.out.println("Display all links ;;;"+liii.size());
		 
		 int count = 0;
		 for (int i = 0; i < liii.size(); i++) {
			 
				

			 String sree = liii.get(i).getText();
			 
			 System.out.println("Display all links:::"+ sree);
			 
			 count = count+1;
			 
			 System.out.println("Displayed  total count::"+liii.size());
		}
		 
	}

}
