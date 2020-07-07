package blm.utils;

import blm.Main;
import blm.account.EmailAccount;
import org.openqa.selenium.Alert;

public class GetVerifyCode {
    public static String getVerifyCode(EmailAccount account) {
        try {
            Main.createWindow(BrowserType.MAIL);
            Main.getMailDriver().get("https://m.kuku.lu/index.php?pagemode_login=1&noindex=1");
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath("//*[@id=\"link_loginform\"]"));
            Thread.sleep(1000);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath("//*[@id=\"user_number\"]"),account.getId());
            Thread.sleep(1000);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath("//*[@id=\"user_password\"]"),account.getPass());
            Thread.sleep(1000);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath("/html/body/div[1]/div[2]/div/div/div[4]/div[3]/div/div/input"));
            Thread.sleep(500);
            Alert alert = Main.getMailDriver().getDriver().switchTo().alert();
            Thread.sleep(100);
            alert.accept();
            Thread.sleep(500);
            Main.getMailDriver().get("https://m.kuku.lu/recv.php");
            Thread.sleep(500);
            String code = Main.getMailDriver().findElementByXpath("/html/body/div[1]/div[2]/div/div/div[5]/div/div[4]/div[1]/div[2]/div[2]/ul/li/a[1]/div/span[3]").getText().replaceAll("[^0-9]", "");
            Main.closeWindow(BrowserType.MAIL);
            return code;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
