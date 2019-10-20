package CucumberFramework.stepFiles;

import CucumberFramework.Search;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import java.util.List;


public class SearchStep {
    Search search  = new Search();
    private String searchQuery = "cucumber";


    @And("^User enters a valid request$")
    public void user_enters_request_to_search_field() {
        search.selectSearchField().sendKeys(searchQuery);
    }

    @When("^User clicks search$")
    public void user_clicks_enter()  {
        search.selectSearchField().sendKeys(Keys.RETURN);
    }

    @Then("^User should get correct response$")
    public void user_should_get_correct_response() {
        List<WebElement> searchResults = search.searchResults();
        for (WebElement result : searchResults) {
            Assert.assertTrue(result.getAttribute("innerText").toLowerCase().contains(searchQuery));
        }
    }

}
