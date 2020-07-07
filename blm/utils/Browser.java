package blm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser {
    private WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void get(String url) {
        driver.get(url);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element,CharSequence ce) {
        element.sendKeys(ce);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public WebElement findElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public String getSource() {return driver.getPageSource();}

    public WebDriver getDriver() {
        return driver;
    }
}
