package buseetTroject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class souq {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nahla\\Downloads\\chrome\\chromedriver.exe");

	
    WebDriver driver=new ChromeDriver();  

			driver.get("https://egypt.souq.com/eg-en/)");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12 Pro Max");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("window.scrollBy(0,800)");
	        driver.findElement(By.id("low-price")).sendKeys("100");
	        driver.findElement(By.id("high-price")).sendKeys("6000");
	        Thread.sleep(3000);
	        driver.findElement(By.className("a-button-input")).click();
	        
	        Thread.sleep(6000);
	        js.executeScript("window.scrollBy(0,1600)");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@class='colorsprite aok-float-left']")).click();// black color
	        driver.findElement(By.xpath("//img[@data-image-index='3']")).click();
	        
	        
	        Thread.sleep(2000);
	        String color=driver.findElement(By.xpath("//span[text()='Matte Black']")).getText();
	        String ExpectedTitleColor="Matte Black";
	        String price= driver.findElement(By.xpath("//div[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[1]/span[2]/span[2]")).getText();
	        Thread.sleep(2000);
	        String ExpectedTitlePrice="350";
	        Assert.assertEquals(ExpectedTitleColor,color);
	        Assert.assertEquals(ExpectedTitlePrice,price);
	        
	        System.out.println(color);
	        System.out.println(price);


	        
	}
}
