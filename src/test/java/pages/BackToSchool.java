package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToSchool {

    WebDriver driver;
	
	public BackToSchool(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/main/div[2]/div[4]/div/div[3]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/ul/li[3]/a/div[2]/a")
    private WebElement categoryHeader;

    // Locator for the filter elements
    
    @FindBy(id = "sort-by-select")
    private WebElement filterTypeDropdown;
    
    @FindBy(xpath="//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
    private WebElement add;
    
    @FindBy(id = "cbox-6571565")
    private WebElement compare;
    
//    public WebElement getFilterTypeDropdown() {
//        return driver.findElement(By.tagName("button")); // This will get the first button on the page
//    }

    public void clickcategory() {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--use-fake-ui-for-media-stream");
        driver.findElement(By.linkText("Laptops & Computers")).click();
    	categoryHeader.click();
    }
    
    public boolean areProductsListed() {
        return categoryHeader.isDisplayed();
    }
	
	public void applyFilter() {
        filterTypeDropdown.click();
    }
	public boolean filterdisplay() {
		return filterTypeDropdown.isDisplayed();
	}
	public void addToCart() {
        add.click();
	}
	
	public void comparing() {
		compare.click();
	}
	
	public boolean compareElements() {
		return compare.isDisplayed();
	}

}
