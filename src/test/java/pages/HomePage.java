package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[2]/div/div/div/div/div[2]/a[2]")
	private WebElement countrySelect;
	
	@FindBy(tagName ="body")
	private WebElement body;
	
	public void selectCountry() {
        countrySelect.click();
    }
	public void alerthandle() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void scrollDown() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,680)");
    }

}
