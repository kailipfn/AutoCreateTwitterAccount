package blm.account;

import blm.sutemail.SuteMailCreator;
import blm.twitter.TwitterCreator;

public class AccountCreator {
    public static void create() {
        EmailAccount email = SuteMailCreator.craete();

        TwitterAccount twitter = TwitterCreator.create(email);

        AccountFile.save(twitter,email);

        System.out.println("===========================================");
        System.out.println("Email Account:");
        System.out.println("Email: " + email.getEmail());
        System.out.println("Email Id: " + email.getId());
        System.out.println("Email Pass: " + email.getPass());
        System.out.println("Recovery Email: " + email.getRecoveryEmail());
        System.out.println("");
        System.out.println("Twitter Account:");
        System.out.println("ID: " + twitter.getId());
        System.out.println("Mail: " + twitter.getMail());
        System.out.println("Pass: " + twitter.getPass());
        System.out.println("Created IP: " + twitter.getCreatedIP());
        System.out.println("===========================================");
    }
}
