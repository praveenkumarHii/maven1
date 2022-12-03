package Com.Adactin.stepdefnation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Adactin.runner.RunnerClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefnation {
	public static WebDriver driver=RunnerClass.driver;
	@Given("^User Lunch The Adaction Application$")
	public void user_Lunch_The_Adaction_Application() throws Throwable {
		 driver.get("https://adactinhotelapp.com/");
         driver.manage().window();
	}

	@When("^User Enter The User Name In User Name Field$")
	public void user_Enter_The_User_Name_In_User_Name_Field() throws Throwable {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("praveenkumarr");
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("praveenraja");
	}

	@Then("^User Click The login Button And Navigate Next Page$")
	public void user_Click_The_login_Button_And_Navigate_Next_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("^User Select The Location Used In Drop Down$")
	public void user_Select_The_Location_Used_In_Drop_Down() throws Throwable {
		WebElement locat = driver.findElement(By.name("location"));
		Select s = new Select(locat);
		s.selectByValue("Brisbane");
		}

	@When("^User Select The Hotel In Search Hotel Page In Used In DropDown$")
	public void user_Select_The_Hotel_In_Search_Hotel_Page_In_Used_In_DropDown() throws Throwable {
		WebElement hot = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hot);
		s1.selectByIndex(2);
	}

	@When("^User Select The Room Type Used In DropDown$")
	public void user_Select_The_Room_Type_Used_In_DropDown() throws Throwable {
		WebElement room = driver.findElement(By.name("room_type"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Super Deluxe");
	}

	@When("^User Select The Number Of Room Types Used In DropDown$")
	public void user_Select_The_Number_Of_Room_Types_Used_In_DropDown() throws Throwable {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(rooms);
		s4.selectByIndex(3);
	}

	@When("^User Enter The Checkin Date Used In Sendkey$")
	public void user_Enter_The_Checkin_Date_Used_In_Sendkey() throws Throwable {
		WebElement checkin = driver.findElement(By.xpath("(//input[@name='datepick_in'])[1]"));
		checkin.clear();
		WebElement day = driver.findElement(By.xpath("//input[@name='datepick_in'][1]"));
		checkin.sendKeys("11/08/2022");
	}

	@When("^User Enter The Checkout Date Used In Sendey$")
	public void user_Enter_The_Checkout_Date_Used_In_Sendey() throws Throwable {
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out'][1]"));
		checkout.clear();
		WebElement checkout2 = driver.findElement(By.xpath("//input[@name='datepick_out'][1]"));
		checkout.sendKeys("13/08/2022");
	}

	@When("^User Select the Adults Per Used In DropDown$")
	public void user_Select_the_Adults_Per_Used_In_DropDown() throws Throwable {
		WebElement room1 = driver.findElement(By.xpath("//select[@name='adult_room'][1]"));
		Select s6 = new Select(room1);
		s6.selectByVisibleText("3 - Three");
	}

	@When("^User Select The Cheldrens Per Room Used In DropDown$")
	public void user_Select_The_Cheldrens_Per_Room_Used_In_DropDown() throws Throwable {
		WebElement room2 = driver.findElement(By.xpath("//select[@name='child_room'][1]"));
		Select s7 = new Select(room2);
		s7.selectByVisibleText("4 - Four");
	}

	@Then("^User Click The Search Hotel Page And Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Hotel_Page_And_Navigate_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();		
	}

	@Given("^User Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
		WebElement select1 = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"][1]"));
		select1.click();	
	}

	@Then("^User Click The Continue Button And Navigate To Payement Page$")
	public void user_Click_The_Continue_Button_And_Navigate_To_Payement_Page() throws Throwable {
		WebElement condinue = driver.findElement(By.id("continue"));
		condinue.click();
	}

	@Given("^User Enter The Name Used In Send Key$")
	public void user_Enter_The_Name_Used_In_Send_Key() throws Throwable {
		WebElement name = driver.findElement(By.xpath("//input[@name=\"first_name\"][1]"));
		name.sendKeys("praveen");
		WebElement last = driver.findElement(By.xpath("//input[@id=\"last_name\"][1]"));
		last.sendKeys("love");
	}

	@Given("^User Enter The Billing Address Used In SendKey$")
	public void user_Enter_The_Billing_Address_Used_In_SendKey() throws Throwable {
		WebElement address = driver.findElement(By.xpath("//textarea[@name=\"address\"][1]"));
		address.sendKeys("8/88,8th block, 9th flor,athipet,ambatthur,chenai 6000121.");
	}

	@Given("^User Enter The Credit CardNumber Used In Sendkey$")
	public void user_Enter_The_Credit_CardNumber_Used_In_Sendkey() throws Throwable {
		WebElement card = driver.findElement(By.xpath("//input[@id=\"cc_num\"][1]"));
		card.sendKeys("1234568909657123");
	}

	@Given("^User Select The Credit CardType Used In DropDown$")
	public void user_Select_The_Credit_CardType_Used_In_DropDown() throws Throwable {
		WebElement type = driver.findElement(By.xpath("//select[@id=\"cc_type\"][1]"));
		Select s11 =new Select(type);
		s11.selectByIndex(3);
		Thread.sleep(5000);
	}

	@Given("^User Select Expiry Date And Month Used In DropDrown$")
	public void user_Select_Expiry_Date_And_Month_Used_In_DropDrown() throws Throwable {
		WebElement month = driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"][1]"));
		Select s12=new Select(month );
		s12.selectByVisibleText("February");
		WebElement year = driver.findElement(By.xpath("//select[@id=\"cc_exp_year\"][1]"));
		Select s13 =new Select(year);
		s13.selectByValue("2012");
	}

	@Given("^User Enter The Cvv Number Used In SendKey$")
	public void user_Enter_The_Cvv_Number_Used_In_SendKey() throws Throwable {
		WebElement bold = driver.findElement(By.xpath("//input[@id=\"cc_cvv\"][1]"));
		bold.sendKeys("4352");
	}

	@Then("^User Click The BookNow And Navigte To Booking Confirmation$")
	public void user_Click_The_BookNow_And_Navigte_To_Booking_Confirmation() throws Throwable {
		WebElement man = driver.findElement(By.xpath("//input[@id=\"book_now\"][1]"));
		man.click();
	}

	@Given("^User Booking Confirmation In My Itinery Button Click$")
	public void user_Booking_Confirmation_In_My_Itinery_Button_Click() throws Throwable {
		WebElement man = driver.findElement(By.xpath("//input[@id=\"book_now\"][1]"));
		man.click();
	}

	@Then("^User Booked In Itinery In Click The LogOut Button$")
	public void user_Booked_In_Itinery_In_Click_The_LogOut_Button() throws Throwable {
	//	WebElement log2 = driver.findElement(By.xpath("//input[@id=\"logout\"][1]"));
		//log2.click();		
	}




}
