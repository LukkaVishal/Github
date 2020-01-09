//package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.abc.selenium.Login;
//import com.abc.selenium.Main;
//import com.abc.selenium.Welcome;

public class MagentoTest {
	public static void main(String[] args) {
		String url="https://magento.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		 
		 Welcome w= new Welcome(driver);
		 w.clickOnMyAccount();
		 Login l = new  Login(driver);
		 l.enterEmail();
		 l.enterPassword();
		 l.clickOnLogin();
		 
		 Main m= new Main(driver);
		 m.clickOnLogout();
		 driver.close();
	}

}
