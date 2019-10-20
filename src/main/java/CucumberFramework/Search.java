package CucumberFramework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

public class Search extends Page{
    private static final String URl = "https://stackoverflow.com";

    public void open(){
        open(URl);
    }

    public WebElement selectAskQuestionButton() {
        return $(".//*[contains(text(),'Ask Question')]");
    }

    public WebElement selectSearchField() {
        return $("//*[@name='q']");
    }

    public List<WebElement> searchResults() {
        return $$(By.xpath("//*[@class='flush-left js-search-results']"));
    }

}
