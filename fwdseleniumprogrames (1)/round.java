package womensunglasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class round {
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://naytraangular.sia.co.in/");
		Thread.sleep(3000);
		FileInputStream f=new FileInputStream("D://selenium programes//meneyeglasses//src//womensunglasses//womensunglasses.properties");
		Properties p=new Properties();
		p.load(f);
		Thread.sleep(3000);
		wd.findElement(By.xpath(p.getProperty("login"))).click();
		Thread.sleep(3000);
		 wd.findElement(By.xpath(".//*[@id='in']")).sendKeys("satishkumar@innotical.com");
			//password
			List<WebElement> a=wd.findElements(By.xpath(".//*[@id='in']"));
			a.get(1).sendKeys("satishkumar@");
	
		//submit
		wd.findElement(By.xpath(p.getProperty("submit"))).click();
		Thread.sleep(3000);
		//eyeglass
		wd.get(p.getProperty("round"));
		Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)wd;
for(int second=50;;second++){
	if(second>120){
		break;
		
	}
			jse.executeScript("window.scrollBy(0,550)", "");
}
List<WebElement> imgs=wd.findElements(By.tagName("img"));
Integer counter=0;
int sum = 0;
for(WebElement image:imgs){ 
		counter++;
		Thread.sleep(1000);
		String radioimg = "/html/body/app-root/app-navbar/div[4]/app-frame-list/div[1]/div[5]/div/div/div["+counter+"]/div/div[2]/span";
		Thread.sleep(5000);
		 List<WebElement> radios=wd.findElements(By.xpath(radioimg));
		System.out.println("image-"+counter+"="+" radiocount="+radios.size());
sum=sum+radios.size();
	}
	
System.out.println("total no of radio color frames"+"="+sum);
Object ev=14;
if(ev.equals(sum)){
	System.out.println("frames quantity filter successfully");
}
	else{
		System.out.println("frames quantity filter unsuccessfully");
	}

wd.quit(); 
  
  }
}
