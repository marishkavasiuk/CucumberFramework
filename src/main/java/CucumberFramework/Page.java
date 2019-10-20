package CucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Page {
    private static WebDriver driver;

    public static synchronized WebDriver getDriver() {
        String chromepath = "C:\\Program Files\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    protected void open(String url) {
        getDriver();
        driver.get(url);
    }

    public static void tearDown() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.quit();
        driver = null;
    }

    protected WebElement $(String xpath, String... args) {
        return driver.findElement(By.xpath(String.format(xpath, args)));
    }

    protected List<WebElement> $$(By by) {
        return driver.findElements(by);
    }

    protected WebElement $(By by) {
        return driver.findElement(by);
    }
}