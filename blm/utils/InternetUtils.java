package blm.utils;

public class InternetUtils {
    public static String  getGlobalIP(Browser browser) {
        browser.get("http://www.openspc2.org/reibun/javascript2/etc/information/0001/sample/index.html");

        String[] html = browser.getSource().split("\n");
        int a = 0;
        for(String str : html) {
            a++;
            if(a == 7) {
                return str.replaceAll("[a-zA-Z]","").replaceAll("=","").replaceAll("'","").replaceAll(";","").replaceAll("\t","").replaceAll(" ","");
            }
        }
        return "";
    }
}
