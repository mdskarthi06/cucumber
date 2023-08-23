package sk6.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public static WebDriver driver;
    public static WebDriver  browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;

	}
public static void closing() {
	driver.close();

}
public static void quit1() {
	driver.quit();

}

public static void navigateto(String url) {
	driver.navigate().to(url);

}
public static void navigateback() {
	driver.navigate().back();

}

public static void forward() {
	driver.navigate().forward();

}
public static void refresh() {
 driver.navigate().refresh();

}
public static void get(String url) {
	
	driver.get(url);

}
public static void Alert() {
	driver.switchTo().alert().accept();

}
public static void mouseclick() {
	Actions sk = new Actions(driver);
	sk.contextClick().build().perform();
}
public static void frame() {
	driver.switchTo().frame("sframe");
	

}
public static void backto() {
	driver.switchTo().defaultContent();

}
public static String gettitle() {
	String sk1 = driver.getTitle();
	return sk1;
	

}



}








	
	


