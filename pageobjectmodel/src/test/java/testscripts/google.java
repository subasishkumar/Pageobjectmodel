package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericutils.Baseclass;
import pageobjectmodel.pageobjectmodelgoogle;
@Test
public class google extends Baseclass {
 WebDriver driver;
  public void googlese() {
	  pageobjectmodelgoogle pom=new pageobjectmodelgoogle(driver);
	  pom.getSearchtb();
  }
}
