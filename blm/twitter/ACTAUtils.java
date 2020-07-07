package blm.twitter;

import org.openqa.selenium.By;

public class ACTAUtils {
    public static String getXpath(Type type) {
        if(type == Type.CHANGEMAIL) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[4]/span";
        }
        if(type == Type.NAME) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[2]/label/div/div[2]/div/input";
        }
        if(type == Type.MAIL) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/label/div/div[2]/div/input";
        }
        if(type == Type.YEAR) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[5]/div[3]/div/div[3]/div[2]/select";
        }
        if(type == Type.MONTH) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[5]/div[3]/div/div[2]/div[2]/select";
        }
        if(type == Type.DAY) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[5]/div[3]/div/div[1]/div[2]/select";
        }
        if(type == Type.DONE1) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div";
        }
        if(type == Type.DONE2) {
            return "/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div";
        }
        if(type == Type.DONE3) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div";
        }
        if(type == Type.DONE4) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div";
        }
        if(type == Type.DONE5) {
            return "//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div";
        }
        if(type == Type.DONE6) {
            return "//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div/div[3]/div[2]";
        }
        if(type == Type.REGISTER) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[5]";
        }
        if(type == Type.ENTERVERIFYCODE) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[2]/label/div/div[2]/div/input";
        }
        if(type == Type.ENTERPASSWORD) {
            return "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/div/label/div/div[2]/div/input";
        }
        if(type == Type.GET) {
            return "/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[7]/div";
        }
        else {
            return "";
        }
    }
}
