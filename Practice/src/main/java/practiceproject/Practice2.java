package practiceproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe/");
			
			WebDriver driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://the-internet.herokuapp.com/");
			
			/*
			
		WebElement multipleWindow=	driver.findElement(By.xpath("//*[text()='Multiple Windows']"));
		
		multipleWindow.click();
		
		WebElement clickHere=driver.findElement(By.xpath("//*[text()='Click Here']"));
		clickHere.click();
		
		
		  Set<String> list=driver.getWindowHandles();
		  System.out.println(list.size());
		  
		 Iterator<String> it=list.iterator();
		 String parentid= it.next();
		 String child= it.next();
		 
		 
		 driver.switchTo().window(child);
		 WebElement childText=driver.findElement(By.xpath("//*[@class='example']/h3"));
		 System.out.println( childText.getText());
		 
		//String ChildTitle= driver.getTitle();
		
		//System.out.println(ChildTitle);
		
		
      

		
		driver.switchTo().window(parentid);
		WebElement parentText = driver.findElement(By.xpath("//*[@id='content']/div/h3"));
		System.out.println(parentText.getText());
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		
		
		*/
			//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
            //WebDriver driver=new ChromeDriver();

                  /*

                     driver.get("http://the-internet.herokuapp.com/");
                     driver.findElement(By.linkText("Nested Frames")).click();
                      driver.switchTo().frame("frame-top");
                      driver.switchTo().frame("frame-middle");

                         */
			
			driver.findElement(By.linkText("Nested Frames")).click();
			driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
			
			WebElement frameText=driver.findElement(By.xpath("//*[@id='content']"));
			System.out.println(frameText.getText());
			
			
		
		 
		 
		 



	}

}
