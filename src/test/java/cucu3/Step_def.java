package cucu3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucu2.Adactinrunner;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class Step_def {

	public static WebDriver driver = Adactinrunner.driver;

	@Given("^user Launch The Web Application$")
	public void user_Launch_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("mdskarthi123");
		Thread.sleep(3000);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("3X5TS2");
		Thread.sleep(3000);
	}

	@Then("^user Cliclk The Login Button And It Navigates TO Search Hotel$")
	public void user_Cliclk_The_Login_Button_And_It_Navigates_TO_Search_Hotel() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);
	}

	@When("^user Select The Hotel In The Hotel Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select abc = new Select(location);
		abc.selectByVisibleText("Melbourne");
		Thread.sleep(3000);
	}

	@When("^user Select The Room In The Room Field$")
	public void user_Select_The_Room_In_The_Room_Field() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select abc1 = new Select(hotel);
		abc1.selectByVisibleText("Hotel Creek");
		Thread.sleep(3000);
	}

	@When("^user Enter The NUmber Of Rooms In The Number Of Rooms Field$")
	public void user_Enter_The_NUmber_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		WebElement room = driver.findElement(By.id("room_type"));
		Select abc2 = new Select(room);
		abc2.selectByVisibleText("Standard");
		Thread.sleep(3000);
	}

	@When("^user Enter The Date In The Check In Date Field$")
	public void user_Enter_The_Date_In_The_Check_In_Date_Field() throws Throwable {
		WebElement datein = driver.findElement(By.id("date_pick"));
		datein.clear();
		datein.sendKeys("22/07/2023");
		Thread.sleep(3000);
	}

	@When("^user Enter The Date IN The Check Out Date Field$")
	public void user_Enter_The_Date_IN_The_Check_Out_Date_Field() throws Throwable {
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("22/07/2023");
		Thread.sleep(3000);
	}

	@When("^user Enter The Adults In The Adults Per Room Field$")
	public void user_Enter_The_Adults_In_The_Adults_Per_Room_Field() throws Throwable {
		WebElement adut = driver.findElement(By.id("adult_room"));
		Select abc3 = new Select(adut);
		abc3.selectByVisibleText("1");
		Thread.sleep(3000);
	}

	@When("^user Enter The Chikdrens In The Childrens Per Field$")
	public void user_Enter_The_Chikdrens_In_The_Childrens_Per_Field() throws Throwable {
		WebElement childrens = driver.findElement(By.id("child_room"));
		Select abc4 = new Select(childrens);
		abc4.selectByVisibleText("1");
		Thread.sleep(3000);
	}

	@Then("^user Click In The Search Button And It Navigates To Select Hotel$")
	public void user_Click_In_The_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		Thread.sleep(3000);
	}

	@When("^user Select The Hotel Creek$")
	public void user_Select_The_Hotel_Creek() throws Throwable {
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		Thread.sleep(3000);
	}

	@Then("^user Click The Continue Button And It Navigates To Book a Hotel$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_a_Hotel() throws Throwable {
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		Thread.sleep(3000);
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("karthi");
		Thread.sleep(3000);
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("s");
		Thread.sleep(3000);
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		WebElement bill = driver.findElement(By.id("address"));
		bill.sendKeys("21 mm nagar");
		Thread.sleep(3000);
	}

	@When("^user Enter The Credit Card Number In The Credit Card Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Field() throws Throwable {
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("645382911");
		Thread.sleep(3000);
	}

	@When("^user Enter The Credit Card Type In The Credit Card Field$")
	public void user_Enter_The_Credit_Card_Type_In_The_Credit_Card_Field() throws Throwable {
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select abc5 = new Select(cctype);
		abc5.selectByVisibleText("VISA");
		Thread.sleep(3000);
	}

	@When("^user Enter The Expiry Date In The Expiry Field$")
	public void user_Enter_The_Expiry_Date_In_The_Expiry_Field() throws Throwable {
		WebElement dat1 = driver.findElement(By.id("cc_exp_month"));
		Select abc6 = new Select(dat1);
		abc6.selectByVisibleText("4");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select abc7 = new Select(year);
		abc7.selectByVisibleText("2023");
		Thread.sleep(3000);
	}

	@When("^user Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		cvvnum.sendKeys("3645192345632871");
		Thread.sleep(3000);
	}

	@Then("^user Click The Book Now Button$")
	public void user_Click_The_Book_Now_Button() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		WebElement log = driver.findElement(By.id("logout"));
		Select log1 = new Select(log);
		log1.selectByVisibleText("Logout");
		log.click();
	}

}
