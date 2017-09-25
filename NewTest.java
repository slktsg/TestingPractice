import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  private static final WebDriver Booking = null;

@Test
public void spicejetBooking() throws InterruptedException {
	  
	  
	  WebDriver Booking = new FirefoxDriver();
	  Thread.sleep(1000);
	  Booking.get("http://www.spicejet.com/");
	  Booking.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("BLR",Keys.ENTER);
	  Booking.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("HYD",Keys.ENTER);
	  Booking.findElement(By.className("ui-datepicker-trigger")).click();
	  Booking.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
	  
	  //Dropdown Actions
	  WebElement MembersDropdown = Booking.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	  Select no = new Select(MembersDropdown);
	  no.selectByIndex(2) ;
	  WebElement Currency = Booking.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	  Select rs= new Select(Currency);
	  rs.selectByIndex(1);
	  
	  //Checkbox
	  Booking.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
	  Booking.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  
	  //Wait statements
	  Thread.sleep(6000);
	  Booking.findElement(By.name("ControlGroupSelectView$AvailabilityInputSelectView$CheckBoxDefenseAgreement")).click();;
	  Booking.findElement(By.id("ControlGroupSelectView_AgreementInputSelectView_CheckBoxAgreement")).click();
	  Thread.sleep(1000);
	  Booking.findElement(By.id("ControlGroupSelectView_ButtonSubmit")).click();
	  Thread.sleep(4000);
	  
	  //Dropdown actions
	  Booking.findElement(By.id("ControlGroupLoginModelPopUpView_MemberLoginView_TextBoxUserID")).sendKeys("912309875423");
	  WebElement gender=Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_DropDownListTitle"));
	  Select gen = new Select(gender);
	  gen.selectByIndex(3);
	  
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName")).sendKeys("Sandeep");
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName")).sendKeys("sen");
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxCity")).sendKeys("Bangaluru");
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone")).sendKeys("9087123454");;
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress")).sendKeys("AB@gmail.com");
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_CheckBoxPrevVisit")).click();
	  Booking.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_CheckBoxPromoOpt")).click();
	  
	  //closing the current window
	 	  Booking.close();
	
	  
  }
  
  @Test
  public void PersonalDetails() throws InterruptedException
  {
	  WebDriver Booking = new FirefoxDriver();
	  Thread.sleep(1000);
	  Booking.get("http://www.spicejet.com/");
	  
	 
	  Booking.close();
	  
	  Booking.get("http://www.samsung.com/us/");
	//Closing the entire browser
	  
	Booking.quit();
	  
  }
}


