package testngnaytr;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginnaytr {
	//valid user login into naytr
	//Login and logout

  @Test(enabled=false)
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://naytraangular.sia.co.in/#/navbar");
		wd.manage().window().maximize();
		Thread.sleep(5000);
		File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D://naytr project//Login//frontpage.png"));
		wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
		Thread.sleep(3000);
		File scrFile4 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("D://naytr project//Login//Afterloginbutton.png"));
		//username
		wd.findElement(By.xpath(".//*[@id='in']")).sendKeys("Yeatcheed1975@dayrep.com");
		//password
		List<WebElement> a=wd.findElements(By.xpath(".//*[@id='in']"));
		a.get(1).sendKeys("22222");
		File scrFile2 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile2, new File("D://naytr project//Login//dataenterinemailfield.png"));
		//click on login
		wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[3]/div/form/button")).click();
		Thread.sleep(3000);
		File scrFile1 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile1, new File("D://naytr project//Login//frontpage.png"));
	    //logout
	    Thread.sleep(3000);
	    String url=wd.getCurrentUrl();  
	    System.out.println(url); 
	    if(url.equals("http://naytraangular.sia.co.in/#/navbar/homepage")) 
	    {   
	    	System.out.println("login successful"); 
	    	} 
	    else 
	    {   
	    	System.out.println("login unsuccessful"); 
	    	}
	    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
	   
	    File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile5, new File("D://naytr project//Login//LOgoutafter.png"));
	    wd.quit();
	 
  }
//signup New  user
  @Test(enabled=false)
   public void newsignup() throws InterruptedException, IOException{
	   //login
	   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://naytraangular.sia.co.in/#/navbar");
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
	    Thread.sleep(3000);
	   //username
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
	   //emailid
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("Thaniorefore41@einrot.com");
	   //mobile
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("9014316925");
	   //password
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkumar@innotical.com7");
	   //cpasssword
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkumar@innotical.com7");
	   File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile5, new File("D://naytr project//signup//signup.png"));
	    Thread.sleep(3000);
	   //register
	    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).click();
	    Thread.sleep(8000);
	    File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D://naytr project//signup//clickregister.png"));
	    wd.quit();
	   
  }
//signup  Allready existing user error message
	   @Test(enabled=false)
	    public void log() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		   //username
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
		   //emailid
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("Porn1965@cuvox.de");
		   //mobile
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("9014316925");
		   //password
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkumar@innotical.com7");
		   //cpasssword
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkumar@innotical.com7");
		   File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile5, new File("D://naytr project//existinguser//signup.png"));
		    Thread.sleep(3000);
		   //register
		    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).click();
		    Thread.sleep(8000);
		    File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File("D://naytr project//existinguser//clickregister.png"));
		    wd.quit();
	   }
	   //invalid user
	   @Test(enabled=false)
	   public void alreadyexistinguser() throws InterruptedException, IOException{
		    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
			wd.manage().window().maximize();
			Thread.sleep(5000);
			File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D://naytr project//logininvaliduser//frontpage.png"));
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("D://naytr project//logininvaliduser//Afterloginbutton.png"));
			//username
			wd.findElement(By.xpath(".//*[@id='in']")).sendKeys("Yeatcheed1975@dayre.com");
			//password
			List<WebElement> a=wd.findElements(By.xpath(".//*[@id='in']"));
			a.get(1).sendKeys("22222");
			File scrFile2 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile2, new File("D://naytr project//logininvaliduser//dataenterinemailfield.png"));
			//click on login
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[3]/div/form/button")).click();
			Thread.sleep(3000);
			File scrFile1 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile1, new File("D://naytr project//logininvaliduser//frontpage.png"));
		    //logout
		    Thread.sleep(3000);
		    String url=wd.getCurrentUrl();  
		    System.out.println(url); 
		    if(url.equals("http://naytraangular.sia.co.in/#/navbar/homepage")) 
		    {   
		    	System.out.println("login successful"); 
		    	} 
		    else 
		    {   
		    	System.out.println("login unsuccessful"); 
		    	}
		    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
		   
		    File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile5, new File("D://naytr project//logininvaliduser//LOgoutafter.png"));
		    wd.quit();
		 
	   }
	   //forget password existing user
	   @Test(enabled=false)
	   public void forgetpassword() throws InterruptedException, IOException{
		    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
			wd.manage().window().maximize();
			Thread.sleep(5000);
			File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D://naytr project//forgetpassword//frontpage.png"));
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("D://naytr project//forgetpassword//Afterloginbutton.png"));
	   //forget password
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[3]/div/form/div[3]/a")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("D://naytr project//forgetpassword//Afterclickforgetpassword.png"));
			Thread.sleep(2000);
			wd.findElement(By.xpath("html/body/app-root/app-forget-password/div[2]/div/form/div/div/input")).sendKeys("satishkumar@innotical.com");
			Thread.sleep(2000);
			File scrFile6 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("D://naytr project//forgetpassword//entermailid.png"));
			wd.findElement(By.xpath("html/body/app-root/app-forget-password/div[2]/div/form/div/button")).click();
			Thread.sleep(3000);
			File scrFile7 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("D://naytr project//forgetpassword//afterresetbutton.png"));
	   wd.quit();
		   
	   }
	   
	   
	   //forget password invalid user try click reset button 
	   @Test(enabled=false)
	   public void forgetpasswordincvalisuser() throws InterruptedException, IOException{
		    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
			wd.manage().window().maximize();
			Thread.sleep(5000);
			File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D://naytr project//invaliduserforgetpassword//frontpage.png"));
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
			Thread.sleep(3000);
			File scrFile4 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile4, new File("D://naytr project//forgetpassword//Afterloginbutton.png"));
	   //forget password
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[3]/div/form/div[3]/a")).click();
			Thread.sleep(3000);
			File scrFile3 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile3, new File("D://naytr project//invaliduserforgetpassword//Afterclickforgetpassword.png"));
			Thread.sleep(2000);
			wd.findElement(By.xpath("html/body/app-root/app-forget-password/div[2]/div/form/div/div/input")).sendKeys("satishkumar@innotica.com");
			Thread.sleep(2000);
			File scrFile6 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile6, new File("D://naytr project//invaliduserforgetpassword//entermailid.png"));
			wd.findElement(By.xpath("html/body/app-root/app-forget-password/div[2]/div/form/div/button")).click();
			Thread.sleep(3000);
			File scrFile7 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile7, new File("D://naytr project//invaliduserforgetpassword//afterresetbutton.png"));
	   wd.quit();
		   
	   }
	   
	   
	   //name field filling with numbers and special chareters are spaces
	   @Test(enabled=false)
	    public void namefield() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		   //username
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("       ");
		   Thread.sleep(3000);
		   File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("D://naytr project//invalidnamefield//spaces.png"));
			  Thread.sleep(3000);
			  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).clear();
			  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("123456789");
			  Thread.sleep(3000);
			  File scrFile1 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile1, new File("D://naytr project//invalidnamefield//numbers.png"));
				Thread.sleep(3000);
				  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).clear();
				  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("!@#$%)(*&");
				  Thread.sleep(3000);
				  File scrFile2 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile2, new File("D://naytr project//invalidnamefield//specialcharacters.png"));
					Thread.sleep(3000);
					  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).clear();
					  wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("sati@123!@##$");
					  Thread.sleep(3000);
					  File scrFile3 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(scrFile3, new File("D://naytr project//invalidnamefield//combination.png"));
					wd.quit();
				
}
	  //with out filling all fields register is enable are disable
	   //1.filling 4 fields register button is enabled are disable
	   //fill all fields register button is enabed are diaable check in results
	   @Test(enabled=false)
	    public void register() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //register
	   
	 boolean q= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
	 System.out.println(q);
	 //username
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
	   //emailid
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("Porn1965@cuvox.de");
	   //mobile
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("9014316925");
	   //password
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkmar@innotical.com7");
	 
	   boolean q1= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
		 System.out.println(q1);
		 wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkmar@innotical.com7");
		 boolean q2= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
		 System.out.println(q2);
		 wd.quit();
}
	   //filling invallid mobile number (9 numbers) click on register
	   @Test(enabled=false)
	    public void mobile() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //register
	   
	 boolean q= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
	 System.out.println(q);
	 //username
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
	   //emailid
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("1965@cuvox.de");
	   //mobile
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("901431692");
	   //password
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkumar@innotical.com7");
	 //cpasssword
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkumar@innotical.com7");
	   File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile5, new File("D://naytr project//mobilevalidation//mobile.png"));
	    Thread.sleep(3000);
	   //register
	    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).click();
	    Thread.sleep(8000);
}
	   //invalid emailid
	   @Test(enabled=false)
	    public void email() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //register
	   
	 boolean q= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
	 System.out.println(q);
	 //username
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
	   //emailid
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("1965@cuvox.de@com");
	   //mobile
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("9014316928");
	   //password
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkumar@innotical.com7");
	 //cpasssword
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkumar@innotical.com7");
	   File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile5, new File("D://naytr project//email//signup.png"));
	    Thread.sleep(3000);
	   //register
	    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).click();
	    Thread.sleep(8000);
	    wd.quit();
}
	   //fiiling incorrect password
	   @Test(enabled=false)
	    public void incorrectpassword() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //register
	   
	 boolean q= wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).isEnabled();
	 System.out.println(q);
	 //username
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[1]/div/input")).sendKeys("kumar");
	   //emailid
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[2]/div/input")).sendKeys("1965@cuvox.de@com");
	   //mobile
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[3]/div/input")).sendKeys("9014316928");
	   //password
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[4]/div/input")).sendKeys("satishkumar@innotical.com7");
	 //cpasssword
	   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/div[5]/div/input")).sendKeys("satishkumar@innotica.com7");
	   Thread.sleep(3000);
	   File scrFile5 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile5, new File("D://naytr project//incorrectpassword//signup.png"));
	    Thread.sleep(3000);
	   //register
	    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[2]/div/div/div/form/button")).click();
	    Thread.sleep(8000);
	    wd.quit();
}
	   //gmail login
	   @Test (enabled=false)
	    public void gmaillogin() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //gmail
		    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[1]/div/div/div")).click();
		  
		    Set<String>set=wd.getWindowHandles();
		    Iterator<String>it=set.iterator();
		    String parentwindow=it.next();
		    String childwindow=it.next();
		    wd.switchTo().window(childwindow);
		    Thread.sleep(5000);
		    wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]")).sendKeys("peloteando2@gmail.com");
		    Thread.sleep(3000);
		    wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input")).click();
		    Thread.sleep(3000);
		   
		    wd.findElement(By.id("Passwd")).sendKeys("peloteando");
		    Thread.sleep(3000);
		    wd.findElement(By.id("signIn")).click();
		    Thread.sleep(3000);
		    wd.findElement(By.id("submit_approve_access")).click();
		    wd.switchTo().window(parentwindow);
}   
//facebooklogin
	   @Test(enabled=false)
	    public void facebook() throws InterruptedException, IOException{
		   //login
		   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://naytraangular.sia.co.in/#/navbar");
		   wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]/a")).click();
		    Thread.sleep(3000);
		    //facebook
		    wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[1]/img")).click();
		    Thread.sleep(3000);
		    Set<String>set=wd.getWindowHandles();
		    Iterator<String>it=set.iterator();
		    String parentwindow=it.next();
		    String childwindow=it.next();
		    wd.switchTo().window(childwindow);
		    Thread.sleep(5000);
		    wd.findElement(By.id("email")).sendKeys("satishkumar@innotical.com");
		    Thread.sleep(3000);
		    wd.findElement(By.id("pass")).sendKeys("satishkumar@");
		    Thread.sleep(3000);
		    wd.findElement(By.id("loginbutton")).click();
		    Thread.sleep(3000);
		    wd.switchTo().window(parentwindow);
		    Thread.sleep(3000);
		    File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File("D://naytr project//facebooklogin//faceboooklogin.png"));
		    
}
//user enters wrong password in login page
	   @Test
	   public void invalidpassword() throws InterruptedException, IOException {
	 	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 		WebDriver wd=new ChromeDriver();
	 		wd.get("http://naytraangular.sia.co.in/#/navbar");
	 		wd.manage().window().maximize();
	 		Thread.sleep(5000);
	 		File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	 		FileUtils.copyFile(scrFile, new File("D://naytr project//invalidpassword//frontpage.png"));
	 		wd.findElement(By.xpath("html/body/app-root/app-navbar/div[1]/div[1]/div[2]/div/li[3]")).click();
	 		Thread.sleep(3000);
	 		File scrFile4 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	 		FileUtils.copyFile(scrFile4, new File("D://naytr project//invalidpassword//Afterloginbutton.png"));
	 		//username
	 		wd.findElement(By.xpath(".//*[@id='in']")).sendKeys("Yeatcheed1975@dayrep.com");
	 		//password
	 		List<WebElement> a=wd.findElements(By.xpath(".//*[@id='in']"));
	 		a.get(1).sendKeys("2222");
	 		File scrFile2 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	 	    FileUtils.copyFile(scrFile2, new File("D://naytr project//invalidpassword//password.png"));
	 	 //click on login
			wd.findElement(By.xpath("html/body/app-root/app-navbar/div[4]/app-login/div[2]/div/div[1]/div/div[3]/div/form/button")).click();
			Thread.sleep(8000);
			File scrFile1 = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile1, new File("D://naytr project//invalidpassword//log.png"));

}
}
	   
	   

	    	
	    
	  
	  
	  
  
