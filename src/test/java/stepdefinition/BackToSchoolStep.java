package stepdefinition;
import pages.BackToSchool;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackToSchool;
import pages.HomePage;
public class BackToSchoolStep {
	WebDriver driver = new ChromeDriver();
	HomePage homepage;
	BackToSchool backtoschool;
	
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    
	    driver.get("https://www.bestbuy.com");
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
		backtoschool = new BackToSchool(driver);
	}
	
	@When("I select country if needed")
	public void i_select_country_if_needed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Actions action = new Actions(driver);
//		
//		WebElement w = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img"));
//		js.executeScript("arguments[0].click();", w);
		homepage.selectCountry();
	}
	
	@When("the user clicks on the user")
	public void the_user_clicks_on_the_user() {
	    //homepage.alerthandle();
	}

	@Then("I scroll down")
	public void i_scroll_down() {
		homepage.scrollDown();
//		ChromeOptions options = new ChromeOptions();
//
//        // Set default permissions for location
//        options.addArguments("--use-fake-ui-for-media-stream");
//		driver.findElement(By.linkText("Laptops & Computers")).click();
		


	}

	@When("I navigate to the {string} category page")
	public void i_navigate_to_the_category_page(String string) {
		backtoschool.clickcategory();
			}

	@Then("I should see products listed under the {string} category")
	public void i_should_see_products_listed_under_the_category(String string) {
		backtoschool.areProductsListed();
        System.out.println("page opened");

	}

	@When("I select a product {string} and add it to the shopping cart")
	public void i_select_a_product_and_add_it_to_the_shopping_cart(String string) {
	    backtoschool.applyFilter();
	}
//
	@Then("the shopping cart should contain the {string} product")
	public void the_shopping_cart_should_contain_the_product(String string) {
		backtoschool.filterdisplay();
	    System.out.println("i can able to apply filters");
	}

	@When("I apply the filter {string} with the value {string}")
	public void i_apply_the_filter_with_the_value(String string, String string2) {
	    backtoschool.addToCart();
	}

	@Then("the category page should display only products that match the {string} filter criteria")
	public void the_category_page_should_display_only_products_that_match_the_filter_criteria(String string) {
	    System.out.println("i can able to add to cart");
	}

	@When("I select the products  for comparison")
	public void i_select_the_products_for_comparison() {
        backtoschool.comparing();
	}

	@Then("I should be able to view a comparison of the selected products' features and prices")
	public void i_should_be_able_to_view_a_comparison_of_the_selected_products_features_and_prices() {
		backtoschool.compareElements();
	    System.out.println("i can able to compare");
	}

}
