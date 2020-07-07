package blm.account;

public class EmailAccount {
    private String email;
    private String id;
    private String pass;
    private String recoveryemail;
    public EmailAccount(String email,String id,String pass,String recoveryemail) {
        this.email = email;
        this.id = id;
        this.pass = pass;
        this.recoveryemail = recoveryemail;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getRecoveryEmail() {
        return recoveryemail;
    }
}
