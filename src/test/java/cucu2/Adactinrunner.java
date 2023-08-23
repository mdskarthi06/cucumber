package cucu2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\src\\test\\java\\sk6\\cucumber",glue = "C:\\Users\\Welcome\\eclipse-workspace\\cucumber\\src\\test\\java\\cucu3" )

public class Adactinrunner{
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}
	@AfterClass
	public static void teardown() {
		driver.close();

	}
}
