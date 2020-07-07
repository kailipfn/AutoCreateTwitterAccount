package blm;

import blm.account.AccountCreator;
import blm.utils.Browser;
import blm.utils.BrowserType;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static WebDriver driver1;
    private static WebDriver driver2;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", Main.class.getResource("utils/chromedriver.exe").getPath());

        AccountCreator.create();
    }

    public static Browser getTwitterDriver() {
        return new Browser(driver1);
    }

    public static Browser getMailDriver() {
        return new Browser(driver2);
    }

    public static void createWindow(BrowserType a) {
        if(a == BrowserType.TWITTER) {
            driver1 = new ChromeDriver();
        }
        if(a == BrowserType.MAIL) {
            driver2 = new ChromeDriver();
        }
    }

    public static void closeWindow(BrowserType a) {
        if(a == BrowserType.TWITTER) {
            driver1.quit();
        }
        if(a == BrowserType.MAIL) {
            driver2.quit();
        }
    }
}
