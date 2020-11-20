import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ihsmarkitpcm {
	
	 WebDriver driver;
	
	
	@Before		
    public void openBrowser() {	
	 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nares\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			driver=new ChromeDriver();	        
	        driver.navigate().to("https://dotnetfiddle.net/"); 
	        driver.manage().window().maximize();
    }		

	    @Test		
	    public void test1(){					
	       
	    	driver.findElement(By.xpath("//button[@id='run-button']")).click();
	    	String displayedTest=driver.findElement(By.id("output")).getText();
	    	assertEquals(displayedTest,"Hello World");    	
	       				
	    }
	    
	    @Test		
	    public void test2(){
	    	
	    	WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-sidebar-toggle']"));   
	    	button.click();
	    	boolean isButtonDisplay=button.isDisplayed();
	    	assertEquals(isButtonDisplay,false);
	    }
	    
	    @After		
	    public void closeDriver() {					
	       driver.quit();
	
	    }
}
