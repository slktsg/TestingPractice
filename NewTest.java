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
	  WebElement MembersDropdown = Booking.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	  Select no = new Select(MembersDropdown);
	  no.selectByIndex(2) ;
	  WebElement Currency = Booking.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	  Select rs= new Select(Currency);
	  rs.selectByIndex(1);
	  Booking.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
	  Booking.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  
	  
	
	  
  }
  
  @Test
  public void PersonalDetails()
  {
	WebDriver Data = new FirefoxDriver();
	Data.get("http://www.spicejet.com/");
	Data.navigate().to("https://book.spicejet.com/Contact.aspx");
	Data.findElement(By.id("ControlGroupLoginModelPopUpView_MemberLoginView_TextBoxUserID")).click();
	Data.findElement(By.id("ControlGroupLoginModelPopUpView_MemberLoginView_TextBoxUserID")).sendKeys("912345678907");
	  
  }
	{}
}


