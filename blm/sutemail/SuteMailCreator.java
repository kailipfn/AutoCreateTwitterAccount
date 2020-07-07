package blm.sutemail;

import blm.Main;
import blm.account.EmailAccount;
import blm.utils.BrowserType;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

public class SuteMailCreator {
    public static EmailAccount craete() {
        try {
            Main.createWindow(BrowserType.MAIL);
            String mail =  RandomStringUtils.random(16,"abcdefghijklnmopqrstuvwxyz");
            String recoverymail = RandomStringUtils.random(16,"abcdefghijklnmopqrstuvwxyz") + "@yopmail.com";
            String id =  RandomStringUtils.random(8,"abcdefghijklnmopqrstuvwxyz");
            String pass = RandomString.make(10);
            Main.getMailDriver().get("https://m.kuku.lu/");
            Thread.sleep(1000);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.ADDADDRESS)));
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.ENTEREMAILDOMAIN)));
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.ENTERMAILNAME)),mail);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.CREATEEMAIL)));
            Thread.sleep(2000);
            mail = Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.EMAIL)).getText();
            Main.getMailDriver().get("https://m.kuku.lu/index.php?pagemode_login=1&noindex=1");
            Thread.sleep(2000);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.LOGINDETAILS)));
            Thread.sleep(500);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.SETUPRM)));
            Thread.sleep(200);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.SETUPID)));
            Thread.sleep(200);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.SETUPPASS)));
            Thread.sleep(500);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.RM)),recoverymail);
            Thread.sleep(200);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.ID)),id);
            Thread.sleep(200);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.PASS)),pass);
            Thread.sleep(200);
            Main.getMailDriver().sendKeys(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.PASS2ND)),pass);
            Thread.sleep(500);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.DONERM)));
            Thread.sleep(200);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.DONEID)));
            Thread.sleep(200);
            Main.getMailDriver().click(Main.getMailDriver().findElementByXpath(SuteMailUtils.getXpath(Type.DONEPASS)));
            Thread.sleep(500);
            Main.closeWindow(BrowserType.MAIL);
            return new EmailAccount(mail,id,pass,recoverymail);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new EmailAccount("","","","");
    }
}
