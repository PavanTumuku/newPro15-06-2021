package del.teee;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex {
	
			public static void main(String[]args) throws InterruptedException
			{
			
			ex obj = new ex();
			obj.lunch_browser();
				
			}
			
			
			public void lunch_browser() throws InterruptedException 
			{
				
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\selenium_softwares\\Drivers\\chromeDriver\\chromedriver.exe");
				//System.setProperty("webdriver.gecko.driver","c:/your/path/to/geckodriver.exe");
				
				WebDriver d= new ChromeDriver(); // object creation   // webdriver predef cl
				Thread.sleep(2000);
				d.manage().window().maximize();
				d.get("https://www.google.com/");
				Thread.sleep(2000);// mil sec

				WebElement el1 = d.findElement(By.name("q"));
				el1.sendKeys("bharath spice midrand");
				el1.sendKeys(Keys.ENTER);
				//el1.click();
				
				d.findElement(By.partialLinkText("Bharath Spice | One Stop India Shop")).click();
				
	
				
			}
		}
	
	


