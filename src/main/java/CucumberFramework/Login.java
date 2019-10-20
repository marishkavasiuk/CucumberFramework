package CucumberFramework;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

public class Login extends Page{
    private static final String URl = "https://stackoverflow.com/users/login";

    public void open(){
        open(URl);
    }

    public WebElement selectLogin() {
        return $(".//*[@id='email']");
    }

    public WebElement selectPassword() {
        return $(".//*[@id='password']");
    }

    public WebElement submitButton() {
        return $(".//*[@id='submit-button']");
    }

}
