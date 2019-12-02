package practiceproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe/");
			
			WebDriver driver = new  ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 WebElement login=driver.findElement(By.xpath("//a[@class='login']"));
			 login.click();
			 WebElement userName =driver.findElement(By.id("email"));
			 userName.sendKeys("mshahin3@yahoo.com");
			 
			 WebElement password =driver.findElement(By.id("passwd"));
			 password.sendKeys("newyork");
			 WebElement submit= driver.findElement(By.id("SubmitLogin"));
			 submit.click();
			 
			 
			 WebElement dress = driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]"));
			 dress.click();
			 
			
			 Actions action = new Actions(driver);	
			 WebElement moveOverImage=driver.findElement(By.xpath("(//*[@class='product-image-container']/a/img)[2]"));
			 action.moveToElement(moveOverImage).build().perform(); 
			WebElement element= driver.findElement(By.xpath("(//*[@id='category'] //*[text()='Add to cart'])[2]"));
			element.click();
			
			WebElement proceedTocheckout =driver.findElement(By.xpath("(//*[@class='button-container']/a/span)[1]"));
			 JavascriptExecutor js   = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", proceedTocheckout);
			 
			WebElement totalPrice= driver.findElement(By.xpath("//*[@id='total_price']"));
			System.out.println("Total Price with shipping " +totalPrice.getText());
			
			/*
			System.out.println(driver.getTitle());
			String parent= driver.getWindowHandle();
			System.out.println(parent);
			
			
		Set<String> ids=driver.getWindowHandles();
		System.out.println("total windows" + ids.size());
	
		Iterator<String> it=ids.iterator();
		   while(it.hasNext()) {
			   System.out.println(it.next());
			 
			// String childid=it.next();
			// driver.switchTo().window(childid);
		   //  System.out.println(driver.getTitle());
		    
		    */
		   
		
			//WebElement getTotal =driver.findElement(By.xpath("//*[@class='ajax_block_cart_total']"));
			
			//System.out.println(getTotal.getText());
			/*
			//WebElement proceedTocheckout =driver.findElement(By.xpath("//*[text()='Proceed to checkout']"));
				//	proceedTocheckout.click();
					
			WebElement closeWindow =driver.findElement(By.xpath("//*[@class='cross']"));
			closeWindow.click();
			
			WebElement logout =driver.findElement(By.xpath("//*[@class='logout']"));
			
			logout.click();
			 
			 */
			//driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4]"));

			//driver.findElements(By.cssSelector("span.price.product-price"));

	}

}
