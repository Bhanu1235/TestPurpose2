package MavenTest.NewStatesMen;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.gargoylesoftware.htmlunit.WebClientOptions;

public class NSFooterLinksTest  {

	

	   @Test

		public void testNew() throws Exception {  


		  WebDriver driver = new FirefoxDriver();
//		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		    WebDriver driver = new ChromeDriver();
			//driver.setJavascriptEnabled(true);
		    //driver.manage().window().maximize(); 

		       driver.get("https://www.newstatesman.com/");
		      

		       driver.manage().window().maximize();  
		       
		       driver.findElement(By.id("donate-close")).click();
		       Thread.sleep(2000);
		       JavascriptExecutor jse = (JavascriptExecutor) driver;
				  jse.executeScript("window.scrollBy(0,1000)");
//		       act=new Actions(driver);
		      
		     
		      for(int i=1;i<=10;i++)
			  {
		      //String path1 = ".//*[@id='block-menu-menu-footer-menu']/div/ul/li["+i+"]/a";
		      WebElement element=driver.findElement(By.xpath(".//*[@id='block-menu-menu-footer-menu']/div/ul/li["+i+"]/a"));
		      String footerMenu = element.getText();
		      element.click();
		       //WebElement element1= driver.findElement(By.name("search_block_form"));
		       
		       Thread.sleep(1000);
				  //JavascriptExecutor jse = (JavascriptExecutor) driver;
				  jse.executeScript("window.scrollBy(0,1500)");
				  System.out.println("Clicked on tab:"+footerMenu);
				  Thread.sleep(3000);
				  //path="div.box-skin_content section.row img[src*='error404']";
				  
				  if(driver.getPageSource().contains( "Latest Content" ))
				  {
					  System.out.println("	Link Working...:"+footerMenu);
					 
			      }
				  else
				  {
					  System.out.println(footerMenu+": 404 Error");
				  }
			  
				    
			    	driver.navigate().back();
			    	jse.executeScript("window.scrollBy(0,1000)");
				  
				  }

			  }
			  
		  }
		  
	  