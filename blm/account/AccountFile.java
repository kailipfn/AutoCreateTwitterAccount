package blm.account;

import blm.utils.Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountFile {
    public static Config config = new Config("twitter");
    public static Config config2 = new Config("email");

    public static void save(TwitterAccount account,EmailAccount email) {
        config.setString(account.getMail(),account.getPass() + "--" + account.getId() + "--" + account.getCreatedIP());
        config2.setString(email.getEmail(),email.getId() + "--" + email.getPass() + "--" + email.getRecoveryEmail());
    }

    public static List<TwitterAccount> listAccounts() {
        List<TwitterAccount> list = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(config.getConfigFile()));

            String line;

            while ((line = br.readLine()) != null) {
                if (!line.contains("#")) {
                    String[] koi = line.split("=",2);
                    String[] ase = koi[1].split("--",2);
                    TwitterAccount account = new TwitterAccount(koi[0],ase[0],ase[1],ase[2]);
                    list.add(account);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<EmailAccount> listEmailAccounts() {
        List<EmailAccount> list = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(config.getConfigFile()));

            String line;

            while ((line = br.readLine()) != null) {
                if (!line.contains("#")) {
                    String[] koi = line.split("=",2);
                    String[] ase = koi[1].split("--",2);
                    EmailAccount account = new EmailAccount(koi[0],ase[0],ase[1],ase[2]);
                    list.add(account);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

