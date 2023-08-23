package sk6.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runnerclass extends Baseclass{
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = browserlaunch("chrome");
	    WebDriverManager.chromiumdriver().setup();
	  //  WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("");
		WebElement sk = driver.findElement(By.id("username"));
	//	sk.sendKeys("mdskarthi123");
		value2(sk, "3X5ST2");
		WebElement sk1 = driver.findElement(By.id("password"));
		value2(sk1, "password");
	//	sk1.sendKeys("3X5ST2");
		WebElement sk2 = driver.findElement(By.id("login"));
		//sk2.click();
		
		value1(sk2);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	private static void value1(WebElement sk2) {
		// TODO Auto-generated method stub
		
	}

	private static void value2(WebElement sk, String string) {
		// TODO Auto-generated method stub
		
	}

	
	
	}


