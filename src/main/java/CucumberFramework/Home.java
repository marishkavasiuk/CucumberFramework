package CucumberFramework;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

public class Home extends Page{
    Page page = new Page();
    public String URl = "https://stackoverflow.com";

    public void open(){
        page.open(URl);
    }

    public WebElement loggingButton(){
        return $("//*[text()='Log in']");
    }

}

