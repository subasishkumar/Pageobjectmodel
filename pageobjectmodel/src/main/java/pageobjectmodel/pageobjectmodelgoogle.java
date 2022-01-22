package pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmodelgoogle {
    public pageobjectmodelgoogle(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
	@FindBy(name="q")
    private WebElement searchtb;
	
	public WebElement getSearchtb() {
		return searchtb;
	}
	
	public void search(String search) {
		searchtb.sendKeys(search,Keys.ENTER);
	}
}
