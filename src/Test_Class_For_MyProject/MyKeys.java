package Test_Class_For_MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");	
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.id("ss")).click();
		driver.findElement(By.id("ss")).sendKeys("Amman"+Keys.ARROW_DOWN );

	
//		driver.findElement(By.id("My-Select")).click();
//		Keys  theKeys = Keys.ARROW_DOWN;
//		driver.findElement(By.id("My-Select")).sendKeys("t"+ Keys.ENTER);
		
	}

}
