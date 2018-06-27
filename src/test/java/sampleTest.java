import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class sampleTest {
	WebDriver Driver;
	
  @Test(groups="flavour")
  public void f() {
	  System.out.println("i am vanilla");
  }
  @Test(groups="flavour")
  public void g() {
	  System.out.println("i am icecream");
  }
  @Test(groups="fruit")
  public void h() {
	  System.out.println("i am grape");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
