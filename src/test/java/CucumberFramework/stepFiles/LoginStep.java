package CucumberFramework.stepFiles;
import CucumberFramework.Login;
import CucumberFramework.Page;
import CucumberFramework.Search;
import cucumber.api.java.After;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep{
	Login login = new Login();
	Search search = new Search();

	@And("^User enters a valid username$")
	public void user_enters_a_valid_username() {
		login.selectLogin().sendKeys("marishenkavasiuk123@gmail.com");
	}

	@And("^User enters a valid password$")
	public void user_enters_a_valid_password() {
		login.selectPassword().sendKeys("Mepege123");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		login.submitButton().click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement askQuestionButton = search.selectAskQuestionButton();
		Assert.assertTrue(askQuestionButton.isDisplayed());
	}

	@After
	public static void tearDown() throws InterruptedException {
		Page.tearDown();
	}

}
