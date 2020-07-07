package blm.twitter;

import blm.Main;
import blm.account.EmailAccount;
import blm.account.TwitterAccount;
import blm.utils.BrowserType;
import blm.utils.GetVerifyCode;
import blm.utils.InternetUtils;
import net.bytebuddy.utility.RandomString;

public class TwitterCreator {
    public static TwitterAccount create(EmailAccount mail) {
        try {
            Main.createWindow(BrowserType.TWITTER);
            String id = RandomString.make(10);
            String pass = RandomString.make(10);
            String name = RandomString.make(10);
            Main.getTwitterDriver().get("https://twitter.com/i/flow/signup");
            Thread.sleep(1000);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.CHANGEMAIL)));
            Thread.sleep(200);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.NAME)),name);
            Thread.sleep(200);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.MAIL)),mail.getEmail());
            Thread.sleep(200);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.YEAR)),"2000");
            Thread.sleep(200);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.MONTH)),"1");
            Thread.sleep(200);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.DAY)),"1");
            Thread.sleep(500);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.DONE1)));
            Thread.sleep(500);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.DONE2)));
            Thread.sleep(800);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.REGISTER)));
            Thread.sleep(3000);
            String code = GetVerifyCode.getVerifyCode(mail);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.ENTERVERIFYCODE)),code);
            Thread.sleep(1500);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.DONE3)));
            Thread.sleep(1500);
            Main.getTwitterDriver().sendKeys(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.ENTERPASSWORD)),pass);
            Thread.sleep(1000);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.DONE4)));
            Main.getTwitterDriver().maximize();
            Thread.sleep(1000);
            Main.getTwitterDriver().get("https://twitter.com/home");
            Thread.sleep(2000);
            Main.getTwitterDriver().click(Main.getTwitterDriver().findElementByXpath(ACTAUtils.getXpath(Type.GET)));
            Thread.sleep(1000);
            id = Main.getTwitterDriver().getURL().replaceAll("https://twitter.com/", "");
            String ip = InternetUtils.getGlobalIP(Main.getTwitterDriver());
            Main.closeWindow(BrowserType.TWITTER);
            return new TwitterAccount(id,mail.getEmail(),pass,ip);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new TwitterAccount("","","","");
    }
}
