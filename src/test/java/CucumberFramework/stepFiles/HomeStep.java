package CucumberFramework.stepFiles;

import CucumberFramework.Home;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeStep {

    Home home = new Home();

    @Given("^User opens home page$")
    public void user_opens_home_page() {
        home.open();
    }

    @And("^User clicks on the login button on homepage$")
    public void user_clicks_on_the_login_button_on_homepage()  {
        home.loggingButton().click();
    }

}
