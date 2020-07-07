package blm.account;

public class TwitterAccount {
    public String mail;
    public String pass;
    public String id;
    public String createdip;

    public TwitterAccount(String id,String mail, String pass,String createdip) {
        this.mail = mail;
        this.pass = pass;
        this.id = id;
        this.createdip = createdip;
    }

    public String getCreatedIP() {
        return createdip;
    }

    public String getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
    }
}
