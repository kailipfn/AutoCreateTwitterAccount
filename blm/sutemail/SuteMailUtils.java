package blm.sutemail;

public class SuteMailUtils {
    public static String getXpath(Type type) {
        if(type == Type.ADDADDRESS) {
            return "//*[@id=\"link_addMailAddrByManual\"]";
        }
        if(type == Type.ENTERMAILNAME) {
            return "//*[@id=\"input_manualmailaddr\"]";
        }
        if(type == Type.ENTEREMAILDOMAIN) {
            return "//*[@id=\"link_addMailAddrByManual_data\"]/div[2]/div[1]/label";
        }
        if(type == Type.CREATEEMAIL) {
            return "//*[@id=\"link_addMailAddrByManual_data\"]/div[6]/input";
        }
        if(type == Type.EMAIL) {
            return "//*[@id=\"area-newaddress-view-data\"]/div/div[1]/u/b";
        }
        if(type == Type.LOGINDETAILS) {
            return "//*[@id=\"link_logindata\"]";
        }
        if(type == Type.RM) {
            return "//*[@id=\"new_rescueaddr\"]";
        }
        if(type == Type.ID) {
            return "//*[@id=\"new_number\"]";
        }
        if(type == Type.PASS) {
            return "//*[@id=\"new_password\"]";
        }
        if(type == Type.PASS2ND) {
            return "//*[@id=\"new_password_re\"]";
        }
        if(type == Type.SETUPRM) {
            return "//*[@id=\"link_changerescueaddr_button\"]";
        }
        if(type == Type.SETUPID) {
            return "//*[@id=\"area_changenumber_button\"]";
        }
        if(type == Type.SETUPPASS) {
            return "//*[@id=\"link_changepassword_button\"]";
        }
        if(type == Type.DONEID) {
            return "//*[@id=\"area_changenumber\"]/div/input";
        }
        if(type == Type.DONEPASS) {
            return "//*[@id=\"area_changepassword\"]/div/input";
        }
        if(type == Type.DONERM) {
            return "//*[@id=\"area_changerescueaddr\"]/div/input";
        }
        return "";
    }
}
